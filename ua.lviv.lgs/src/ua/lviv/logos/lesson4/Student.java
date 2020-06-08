package ua.lviv.logos.lesson4;

import java.time.Year;

public class Student {
    private String studentName;
    private String nameOfUniversity;
    Student( String studentName, String nameOfUniversity) {
    super ();
    this.studentName = studentName;
    this.nameOfUniversity = nameOfUniversity;
    }
    public void changeStudentName (String desiredName) {
        this.studentName = desiredName;
    }

    public String getStudentInfo (String courseYear) {
        return this.nameOfUniversity + courseYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", nameOfUniversity='" + nameOfUniversity + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s = new Student("Natalie", "Ivan franko National University");
        System.out.println(s);
        s.changeStudentName("Yulia");
        System.out.println(s);
        System.out.println(s.studentName + " " + s.getStudentInfo(" 4 year student"));
    }
}
