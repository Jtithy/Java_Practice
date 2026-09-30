
import java.util.ArrayList;
import java.util.Scanner;

//Abstraction
abstract class Employee {

    private final String employeeId;
    private final String employeeName;
    private final double employeeSalary;

    //Encapsulation
    public Employee(String employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public abstract void displayEmployeeDetails();
}

class Manager extends Employee {

    private final String department;

    public Manager(String employeeId, String employeeName, double employeeSalary, String department) {
        super(employeeId, employeeName, employeeSalary);
        this.department = department;
    }

    //Polymnorphism
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Manager ID: " + getEmployeeId());
        System.out.println("Manager Name: " + getEmployeeName());
        System.out.println("Manager Salary: " + getEmployeeSalary());
        System.out.println("Manager Department: " + department);
    }
}

class Designer extends Employee {

    private final String designTool;

    public Designer(String employeeId, String employeeName, double employeeSalary, String designTool) {
        super(employeeId, employeeName, employeeSalary);
        this.designTool = designTool;
    }

    //Polumorphism
    @Override
    public void displayEmployeeDetails() {

        System.out.println("Designer ID: " + getEmployeeId());
        System.out.println("Designer Name: " + getEmployeeName());
        System.out.println("Designer Salary: " + getEmployeeSalary());
        System.out.println("Designer Tool: " + designTool);
    }
}

class Developer extends Employee {

    private final String programmingLanguage;

    public Developer(String employeeId, String employeeName, double employeeSalary, String programmingLanguage) {
        super(employeeId, employeeName, employeeSalary);
        this.programmingLanguage = programmingLanguage;
    }

    //Polymorphism
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Developer ID: " + getEmployeeId());
        System.out.println("Developer Name: " + getEmployeeName());
        System.out.println("Developer Salary: " + getEmployeeSalary());
        System.out.println("Developer Programming Language: " + programmingLanguage);
    }

}

class Tester extends Employee {

    private final String testingTool;

    public Tester(String employeeId, String employeeName, double employeeSalary, String testingTool) {
        super(employeeId, employeeName, employeeSalary);
        this.testingTool = testingTool;
    }

    //Polymorphism
    @Override
    public void displayEmployeeDetails() {

        System.out.println("Tester ID: " + getEmployeeId());
        System.out.println("Tester Name: " + getEmployeeName());
        System.out.println("Tester Salary: " + getEmployeeSalary());
        System.out.println("Tester Tool: " + testingTool);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Employee> employees = new ArrayList<>();

            System.out.println("Welcome to Employee Management System");
            System.out.println("""
                                       Enter Employee Type:
                                       1.Manager
                                       2.Designer
                                       3.Developer
                                       4.Testing""");
            int choice = input.nextInt();
            input.nextLine(); //Newline character

            System.out.print("\nEnter Employee ID: ");
            String employeeId = input.next();
            input.nextLine(); //Newline character

            System.out.print("\nENter Employee Name: ");
            String employeeName = input.nextLine();
            input.nextLine(); //Newline character

            System.out.print("\nEmployee Salary: ");
            double employeeSalary = input.nextDouble();
            input.nextLine(); //Newline character

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Manager Department: ");
                    String department = input.nextLine();
                    employees.add(new Manager(employeeId, employeeName, employeeSalary, department));
                }
                case 2 -> {
                    System.out.println("Enter Designer Tool: ");
                    String deginerTool = input.nextLine();
                    employees.add(new Designer(employeeId, employeeName, employeeSalary, deginerTool));
                }
                case 3 -> {
                    System.out.println("Enter Developer Programming Language: ");
                    String programmingLanguage = input.nextLine();
                    employees.add(new Developer(employeeId, employeeName, employeeSalary, programmingLanguage));
                }
                case 4 -> {
                    System.out.println("Enter Tester Tool: ");
                    String testingTool = input.nextLine();
                    employees.add(new Tester(employeeId, employeeName, employeeSalary, testingTool));
                }
                default ->
                    System.out.println("Invalid Choice");
            }

            System.out.println("Employee Information: ");
            for (Employee employee : employees) {
                employee.displayEmployeeDetails();
            }
        }
    }
}
