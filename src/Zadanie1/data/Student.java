package Zadanie1.data;

public class Student {

   private String firstName;
   private String LastName;
   private int index;
   private static int studentNumbers;

    public static int getStudentNumbers() {
        return studentNumbers;
    }

    public void setStudentNumbers(int studentNumbers) {
        this.studentNumbers = studentNumbers;
    }

    public Student(String firstName, String lastName, int index) {
        this.firstName = firstName;
        LastName = lastName;
        this.index = index;
        studentNumbers++;
    }

    final static void studentsIndexCounter (Student student) {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getPesel() {
        return index;
    }

    public void setPesel(int pesel) {
        this.index = pesel;
    }
}
