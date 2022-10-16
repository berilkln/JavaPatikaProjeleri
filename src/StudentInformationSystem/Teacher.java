package StudentInformationSystem;

public class Teacher {
    String name;
    String mpno;   //mobile phone number
    String branch;


    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }
    void print() {
        System.out.println("Teacher's name:" + this.name);
        System.out.println("Teacher's branch:" + this.branch);
        System.out.println("Teacher's phone:" + this.mpno);
    }
}
