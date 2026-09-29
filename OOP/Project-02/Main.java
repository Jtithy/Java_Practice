
import java.util.ArrayList;
import java.util.Scanner;

abstract class StudentMarkSystem {

    void showMessage() {
        System.out.println("Welcome to Student Management System");
    }

    // Abstract methods for student management
    public abstract void addStudent(Student student);

    public abstract void removeStudent(String studentId);

    public abstract void displayStudentById(String studentId);

    // Abstract methods for marks
    public abstract void addMark(String studentId, String subject, double mark);

    public abstract void displayMarks(String studentId);
}

// ================= STUDENT CLASS =================
class Student {

    private String studentId;
    private String sName;
    private String batch;
    private String department;

    // Constructor
    public Student(String studentId, String sName, String batch, String department) {
        this.studentId = studentId;
        this.sName = sName;
        this.batch = batch;
        this.department = department;
    }

    // Getter Methods
    public String getStudentId() {
        return studentId;
    }

    public String getsName() {
        return sName;
    }

    public String getBatch() {
        return batch;
    }

    public String getDepartment() {
        return department;
    }

    // Setter Methods
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Display student information
    void displayStudentInfo() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + sName);
        System.out.println("Batch: " + batch);
        System.out.println("Department: " + department);
    }
}

// ================= STUDENT MANAGEMENT =================
class StudentManagement extends StudentMarkSystem {

    private final ArrayList<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {

        students.add(student);

        System.out.println(
                "Added successfully: " + student.getsName()
        );
    }

    @Override
    public void removeStudent(String studentId) {

        for (Student student : students) {

            if (student.getStudentId().equals(studentId)) {

                students.remove(student);

                System.out.println(
                        "Removed successfully: "
                        + student.getsName()
                );

                return;
            }
        }

        System.out.println(
                "Student with ID "
                + studentId
                + " not found."
        );
    }

    @Override
    public void displayStudentById(String studentId) {

        if (students.isEmpty()) {

            System.out.println("No students found.");

            return;
        }

        for (Student student : students) {

            if (student.getStudentId().equals(studentId)) {

                student.displayStudentInfo();

                return;
            }
        }

        System.out.println(
                "Student with ID "
                + studentId
                + " not found."
        );
    }

    @Override
    public void addMark(String studentId, String subject, double mark) {
        System.out.println("Use MarkManagement to add marks.");
    }

    @Override
    public void displayMarks(String studentId) {
        System.out.println("Use MarkManagement to display marks.");
    }
}

// ================= MARK CLASS =================
class Mark {

    private final String subject;
    private final double mark;

    public Mark(String subject, double mark) {

        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public double getMark() {
        return mark;
    }
}

// ================= MARK MANAGEMENT =================
class MarkManagement extends StudentMarkSystem {

    private final ArrayList<Student> students = new ArrayList<>();

    // Store student IDs
    private final ArrayList<String> studentIds = new ArrayList<>();

    // Store marks
    private final ArrayList<Mark> marks = new ArrayList<>();

    @Override
    public void addStudent(Student student) {

        students.add(student);
    }

    @Override
    public void removeStudent(String studentId) {

        students.removeIf(
                student
                -> student.getStudentId().equals(studentId)
        );

        // Remove marks belonging to that student
        for (int i = studentIds.size() - 1; i >= 0; i--) {

            if (studentIds.get(i).equals(studentId)) {

                studentIds.remove(i);
                marks.remove(i);
            }
        }
    }

    @Override
    public void displayStudentById(String studentId) {

        for (Student student : students) {

            if (student.getStudentId().equals(studentId)) {

                student.displayStudentInfo();

                return;
            }
        }

        System.out.println(
                "Student with ID "
                + studentId
                + " not found."
        );
    }

    // ================= ADD MARK =================
    @Override
    public void addMark(
            String studentId,
            String subject,
            double mark) {

        // Check whether student exists
        boolean studentExists = false;

        for (Student student : students) {

            if (student.getStudentId().equals(studentId)) {

                studentExists = true;

                break;
            }
        }

        if (!studentExists) {

            System.out.println(
                    "Student with ID "
                    + studentId
                    + " not found."
            );

            return;
        }

        // Check maximum 2 courses
        int courseCount = 0;

        for (String id : studentIds) {

            if (id.equals(studentId)) {

                courseCount++;
            }
        }

        if (courseCount >= 2) {

            System.out.println(
                    "This student already has 2 courses."
            );

            return;
        }

        // Check valid mark
        if (mark < 0 || mark > 100) {

            System.out.println(
                    "Mark must be between 0 and 100."
            );

            return;
        }

        // Add student ID and mark
        studentIds.add(studentId);

        marks.add(
                new Mark(subject, mark)
        );

        System.out.println(
                "Mark added successfully."
        );
    }

    // ================= DISPLAY MARKS =================
    @Override
    public void displayMarks(String studentId) {

        double total = 0;

        int count = 0;

        System.out.println();

        System.out.println(
                "Marks for Student ID: "
                + studentId
        );

        System.out.println(
                "----------------------------"
        );

        for (int i = 0; i < studentIds.size(); i++) {

            if (studentIds.get(i).equals(studentId)) {

                Mark mark = marks.get(i);

                System.out.println(
                        "Course: "
                        + mark.getSubject()
                );

                System.out.println(
                        "Mark: "
                        + mark.getMark()
                );

                System.out.println();

                total += mark.getMark();

                count++;
            }
        }

        if (count == 0) {

            System.out.println(
                    "No marks found."
            );

            return;
        }

        System.out.println(
                "----------------------------"
        );

        System.out.println(
                "Total Marks: "
                + total
        );

        double average = total / count;

        System.out.println(
                "Average: "
                + average
        );

        double cgpa = calculateCGPA(average);

        System.out.println(
                "CGPA: "
                + cgpa
        );
    }

    // ================= CGPA =================
    private double calculateCGPA(double average) {

        if (average >= 80) {

            return 4.00;

        } else if (average >= 75) {

            return 3.75;

        } else if (average >= 70) {

            return 3.50;

        } else if (average >= 65) {

            return 3.25;

        } else if (average >= 60) {

            return 3.00;

        } else if (average >= 55) {

            return 2.75;

        } else if (average >= 50) {

            return 2.50;

        } else if (average >= 45) {

            return 2.25;

        } else if (average >= 40) {

            return 2.00;

        } else {

            return 0.00;
        }
    }
}

// ================= MAIN CLASS =================
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentManagement studentManagement
                = new StudentManagement();

        MarkManagement markManagement
                = new MarkManagement();

        markManagement.showMessage();

        while (true) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View Student by ID");
            System.out.println("4. Add Mark");
            System.out.println("5. View Marks & CGPA");
            System.out.println("6. Exit");

            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                // ================= ADD STUDENT =================
                case 1 -> {

                    System.out.println();
                    System.out.println("---- Add Student ----");

                    System.out.print("Enter Student ID: ");
                    String studentId
                            = scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name
                            = scanner.nextLine();

                    System.out.print("Enter Batch: ");
                    String batch
                            = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department
                            = scanner.nextLine();

                    Student student
                            = new Student(
                                    studentId,
                                    name,
                                    batch,
                                    department
                            );

                    // Add student to both systems
                    studentManagement.addStudent(student);

                    markManagement.addStudent(student);

                }

                // ================= REMOVE STUDENT =================
                case 2 -> {

                    System.out.println();
                    System.out.println("---- Remove Student ----");

                    System.out.print(
                            "Enter Student ID: "
                    );

                    String removeId
                            = scanner.nextLine();

                    studentManagement.removeStudent(
                            removeId
                    );

                    markManagement.removeStudent(
                            removeId
                    );

                }

                // ================= VIEW STUDENT =================
                case 3 -> {

                    System.out.println();
                    System.out.println(
                            "---- View Student ----"
                    );

                    System.out.print(
                            "Enter Student ID: "
                    );

                    String viewId
                            = scanner.nextLine();

                    studentManagement.displayStudentById(
                            viewId
                    );

                }

                // ================= ADD MARK =================
                case 4 -> {

                    System.out.println();
                    System.out.println("---- Add Mark ----");

                    System.out.print(
                            "Enter Student ID: "
                    );

                    String markStudentId
                            = scanner.nextLine();

                    System.out.print(
                            "Enter Subject/Course: "
                    );

                    String subject
                            = scanner.nextLine();

                    System.out.print(
                            "Enter Mark: "
                    );

                    double mark
                            = scanner.nextDouble();

                    scanner.nextLine();

                    markManagement.addMark(
                            markStudentId,
                            subject,
                            mark
                    );

                }

                // ================= VIEW MARKS =================
                case 5 -> {

                    System.out.println();
                    System.out.println(
                            "---- View Marks ----"
                    );

                    System.out.print(
                            "Enter Student ID: "
                    );

                    String marksStudentId
                            = scanner.nextLine();

                    markManagement.displayMarks(
                            marksStudentId
                    );

                }

                // ================= EXIT =================
                case 6 -> {

                    System.out.println();
                    System.out.println(
                            "Thank you for using "
                            + "Student Management System."
                    );

                    scanner.close();

                    return;

                    // ================= INVALID CHOICE =================
                }

                default -> {

                    System.out.println(
                            "Invalid choice. "
                            + "Please try again."
                    );
                }
            }
        }
    }
}
