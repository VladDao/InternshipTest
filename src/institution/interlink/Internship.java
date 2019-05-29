package institution.interlink;

import person.Student;

import java.util.LinkedHashSet;
import java.util.Set;

public class Internship {
    private static final String LS = System.lineSeparator();
    private String name;
    private Set<Student> students = new LinkedHashSet<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        students.add(student);

    }

    public String getStudents() {
        StringBuilder sb = new StringBuilder();
        students.forEach(student -> sb.append(student.getName()).append(LS));
        return sb.toString();
    }
}
