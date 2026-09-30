
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

            while (true) {

                System.out.println("\n===== Employee Management System =====");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employee");
                System.out.println("3. Remove Employee");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int menuChoice = input.nextInt();
                input.nextLine();

                switch (menuChoice) {

                    // Add Employee
                    case 1 -> {

                        System.out.println("\n===== Add Employee =====");

                        System.out.println("""
                            Enter Employee Type:
                            1. Manager
                            2. Designer
                            3. Developer
                            4. Testing
                            """);

                        System.out.print("Enter Employee Type: ");
                        int choice = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter Employee ID: ");
                        String employeeId = input.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String employeeName = input.nextLine();

                        System.out.print("Enter Employee Salary: ");
                        double employeeSalary = input.nextDouble();
                        input.nextLine();

                        switch (choice) {

                            case 1 -> {
                                System.out.print("Enter Manager Department: ");
                                String department = input.nextLine();

                                employees.add(
                                        new Manager(
                                                employeeId,
                                                employeeName,
                                                employeeSalary,
                                                department
                                        )
                                );

                                System.out.println("Manager added successfully!");
                            }

                            case 2 -> {
                                System.out.print("Enter Designer Tool: ");
                                String designerTool = input.nextLine();

                                employees.add(
                                        new Designer(
                                                employeeId,
                                                employeeName,
                                                employeeSalary,
                                                designerTool
                                        )
                                );

                                System.out.println("Designer added successfully!");
                            }

                            case 3 -> {
                                System.out.print("Enter Developer Programming Language: ");
                                String programmingLanguage = input.nextLine();

                                employees.add(
                                        new Developer(
                                                employeeId,
                                                employeeName,
                                                employeeSalary,
                                                programmingLanguage
                                        )
                                );

                                System.out.println("Developer added successfully!");
                            }

                            case 4 -> {
                                System.out.print("Enter Tester Tool: ");
                                String testingTool = input.nextLine();

                                employees.add(
                                        new Tester(
                                                employeeId,
                                                employeeName,
                                                employeeSalary,
                                                testingTool
                                        )
                                );

                                System.out.println("Tester added successfully!");
                            }

                            default ->
                                System.out.println("Invalid Employee Type!");
                        }
                    }

                    // View Employee
                    case 2 -> {

                        System.out.println("\n===== Employee Information =====");

                        if (employees.isEmpty()) {
                            System.out.println("No employees found.");
                        } else {

                            for (Employee employee : employees) {
                                employee.displayEmployeeDetails();
                                System.out.println("----------------------------");
                            }
                        }
                    }

                    // Remove Employee
                    case 3 -> {

                        System.out.println("\n===== Remove Employee =====");

                        if (employees.isEmpty()) {
                            System.out.println("No employees available to remove.");
                        } else {

                            System.out.print("Enter Employee ID to remove: ");
                            String removeId = input.nextLine();

                            boolean removed = false;

                            for (int i = 0; i < employees.size(); i++) {

                                if (employees.get(i).getEmployeeId().equals(removeId)) {

                                    employees.remove(i);
                                    removed = true;

                                    System.out.println(
                                            "Employee " + removeId + " removed successfully!"
                                    );

                                    break;
                                }
                            }

                            if (!removed) {
                                System.out.println("Employee ID not found.");
                            }
                        }
                    }

                    // Exit
                    case 4 -> {

                        System.out.println("\nThank you for using Employee Management System!");
                        return;
                    }

                    default ->
                        System.out.println("Invalid Choice!");
                }
            }
        }
    }
}
