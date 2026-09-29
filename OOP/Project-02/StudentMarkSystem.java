
abstract class StudentMarkSystem {

    void showMessage() {
        System.out.println("Welcome to Student Management System");
    }

    //Abstract methods for student management
    public abstract void addStudent(Student student);

    public abstract void removeStudent(String studentId);

    public abstract void displayStudents();

    //Abstract methods for marks
    public abstract void addMark(String studentId, String subject, double mark);

    public abstract void displayMarks(String studentId);
}

class Student {

    private String studentId;
    private String sName;
    private String batch;
    private String department;

    //Constructor
    public Student(String studentId, String sName, String batch, String department) {
        this.studentId = studentId;
        this.sName = sName;
        this.batch = batch;
        this.department = department;
    }

    //Getter Methods
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

    //Setter Methods
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

    //Display student info method
    void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + sName);
        System.out.println("Batch: " + batch);
        System.out.println("Department: " + department);
    }
}
