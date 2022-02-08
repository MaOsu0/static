package Zadanie1.app;

import Zadanie1.data.Student;

import java.util.Scanner;


public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Anna", "Środek", 316271);
        Student student2 = new Student("Kamil", "Góra", 316231);
        Student student3 = new Student("Kasia", "Dół", 316274);

        System.out.println("Liczba studentów to " + Student.getStudentNumbers());


    }
}
