package StudentInformationSystem;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        //this.teacher = teacher;
    }


    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacher();
        }
        else {
            System.out.println("teacher and course do not match.");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }






}
