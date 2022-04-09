package DesignPattern;

public class TestStudent {
    public static void main(String[] args) {

        Student student1 = Student.getStudentInstance();

        StudentLazyInit student2 = StudentLazyInit.getStudentInstance();
    }
}
