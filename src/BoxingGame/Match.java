package BoxingGame;

public class Match {

    Fighter F1;
    Fighter F2;
    int maxWeight;
    int minWeight;

    Match(Fighter F1, Fighter F2, int maxWeight, int minWeight) {
        this.F1 = F1;
        this.F2 = F2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

     void run() {
        if (isCheck()) {
            while (this.F1.health>0 && this.F2.health>0) {
                System.out.println("New Round");
                this.F2.health = this.F1.hit(this.F2);
                if (isWin()){
                    break;
                }
                //System.out.println(this.F2.health);
                this.F1.health = this.F2.hit(this.F1);
                if (isWin()){
                    break;
                }
                System.out.println(this.F1.name + " Health->" + this.F1.health);
                System.out.println(this.F2.name + " Health->" + this.F2.health);


            }
        }
        else {
            System.out.println("Athletes' weights do not match");
        }
    }


    public boolean isCheck() {
        return (F1.weight >= minWeight && F1.weight <= maxWeight) && (F2.weight >= minWeight && F2.weight <= maxWeight);

    }
    public boolean isWin() {
        if (this.F1.health == 0) {
            System.out.println("The Winner: " + this.F2.name);
            return true;
        } else if (this.F2.health == 0){
            System.out.println("The Winner : " + this.F1.name);
            return true;
        }

        return false;
    }



}
