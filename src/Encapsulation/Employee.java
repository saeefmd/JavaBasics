package Encapsulation;

import java.util.Scanner;

public class Employee {

    private String empName;
    private long empAccNo;
    private String empEmail;
    private double empBalance;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpAccNo() {
        return empAccNo;
    }

    public void setEmpAccNo(long empAccNo) {
        this.empAccNo = empAccNo;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public double getEmpBalance() {

        System.out.println("Please enter your Account Name: ");

        Scanner scanner = new Scanner(System.in);

        String accName = scanner.nextLine();

        System.out.println("Please enter your Account Number: ");

        long accNo = scanner.nextLong();

        scanner.close();

        if (accName.equals(empName) && accNo == empAccNo) {
            return  empBalance;
        } else {
            return -1;
        }
    }

    public void setEmpBalance(double empBalance) {
        this.empBalance = empBalance;
    }
}
