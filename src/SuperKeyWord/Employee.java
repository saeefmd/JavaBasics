package SuperKeyWord;

public class Employee extends Person {

    int id;
    String name;
    double salary;

    public Employee (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
