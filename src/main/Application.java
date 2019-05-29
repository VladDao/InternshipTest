package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", new Knowledge(100)));
        university.addStudent(new Student("Julia Veselkina", new Knowledge(90)));
        university.addStudent(new Student("Julia2 Veselkina", new Knowledge(91)));
        university.addStudent(new Student("Maria Perechrest", new Knowledge(80)));

        Internship internship = new Internship("Interlink");
        university.setInternship(internship);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
