package DesignPattern;

public class Student {

    private Student() {}

    private static Student student_obj;

    static {

        try {
            student_obj = new Student();
        } catch (Exception e) {
            System.out.println("Exception on Instance Creation");
        }

    }

    public static Student getStudentInstance() {
        return student_obj;
    }

    /*private static final Student STUDENT_OBJ = new Student();
    
    private Student() {}

    public static Student getStudentInstance() {
        return STUDENT_OBJ;
    }*/
}
