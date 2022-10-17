package Salarycalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours =workHours;
        this.hireYear = hireYear;

    }


     public double tax() {

        if (this.salary< 1000.0){
            return 0;
        }
        else {
            return this.salary * 0.03;
        }

    }

    public double bonus() {
        if (this.workHours > 40){
           return (this.workHours-40) *30;
        }
        else {
            return 0;
        }

    }

    public double raiseSalary(){
        if (2021-this.hireYear>19) {

            return this.salary * 0.15;
        }
        else if (2021-this.hireYear>9 && 2021-this.hireYear<20) {
            return this.salary * 0.10;
        }
        else if (2021-this.hireYear>0 && 2021-this.hireYear<10) {
            return this.salary * 0.05;
        }
        else {
            return 0;
        }

    }


   public String toString(){
       //double total = salary + bonus() + raiseSalary();
       double netSalary = salary +bonus() + raiseSalary() - tax();

        System.out.println("Employee's name: "+ this.name);
        System.out.println("Salary: "+ this.salary);
        System.out.println("Work Hours: "+ this.workHours);
        System.out.println("Year of starting: "+ this.hireYear);
        System.out.println("Tax: "+ this.tax());
        System.out.println("Bonus: "+ this.bonus());
        System.out.println("Salary Increase: "+ this.raiseSalary());
        System.out.println("Net Salary: "+ netSalary);

        return null;
   }






}
