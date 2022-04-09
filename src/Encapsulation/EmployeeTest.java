package Encapsulation;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmpName("Karim");
        employee.setEmpAccNo(107103);
        employee.setEmpBalance(5000);

        double balance = employee.getEmpBalance();

        if (balance != -1) {
            System.out.println("Account Balance: " + balance);
        } else {
            System.out.println("Wrong Information");
        }

        /*Employee employee1 = new Employee();
        employee1.setEmpName("Mr. Karim");
        System.out.println(employee1.getEmpName());*/

    }
}
