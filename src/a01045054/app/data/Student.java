package a01045054.app.data;

import a01045054.app.display.Sorter;

public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private StudentMarks studentMarks;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String studentId, StudentMarks studentMarks) {
        super();
        setFirstName(firstName);
        setLastName(lastName);
        this.studentId = studentId;
        this.studentMarks = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String name) {
        if (name != null && name.trim().length() > 0) {
            this.firstName = name;
        }
    }

    public void setLastName(String name) {
        if (name != null && name.trim().length() > 0) {
            this.lastName = name;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String id) {
        if (id != null && id.trim().length() > 0) {
            this.studentId = studentId;
        }
    }

    public void setStudentMarks(StudentMarks m) {
        this.studentMarks = m;
    }

    public StudentMarks getStudentMarks()
    {
        return studentMarks;
    }

    @Override
    public String toString() {
        return getFullName() + " ID:" + studentId;
    }

}
