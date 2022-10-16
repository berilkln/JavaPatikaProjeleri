package StudentInformationSystem;
public class Main {
    public static void main(String[] args) {
        /*
Course class properties:
Qualifications : name,code,prefix,note,Teacher
Methods : Course() , addTeacher() , printTeacher()

Teacher class properties:
Qualifications : name,mpno,branch
Methods : Teacher()

Student class properties:
Qualifications : name,stuNo,classes,course1,course2,course3,avarage,isPass
Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
        */

        Teacher T1 = new Teacher("X", "5555", "CSE");
        //T1.print();
        Teacher T2 = new Teacher("Y","2222", "PHYS");
        Teacher T3 = new Teacher("Z","1111","MTH");


        Course ComputerScience = new Course("Computer Science", "101", "CSE");
        ComputerScience.addTeacher(T1);   //'we assigned the teacher to the lesson'

        Course Physics = new Course("Physics","101", "PHYS");
        Physics.addTeacher(T2);

        Course Math = new Course("Math", "101", "MTH");
        Math.addTeacher(T3);


        //ComputerScience.printTeacher();

        Student S1 = new Student("Student1", "123", "4th",ComputerScience,Physics,Math);

        S1.addBulkExamNote(100,49,67);
        S1.isPass();











        
    }
}
