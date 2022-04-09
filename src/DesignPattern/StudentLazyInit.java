package DesignPattern;

public class StudentLazyInit {

    private static StudentLazyInit student;

    private StudentLazyInit() {}

    /** Double checking locking principle **/
    public static StudentLazyInit getStudentInstance() {

        if (student == null) {
            synchronized (StudentLazyInit.class) {
                if (student == null) {
                    student = new StudentLazyInit();
                }
            }
        }

        return student;
    }

    /** Thread Safe Instance **/
    /*public static synchronized StudentLazyInit getStudentLazyInstance() {

        if (student == null) {
            student = new StudentLazyInit();
        }

        return student;
    }*/
}
