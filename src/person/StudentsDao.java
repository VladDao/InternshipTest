package person;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentsDao implements StudentsDaoInterface {
    private Set<Student> students = new LinkedHashSet<>();

    @Override
    public Set<Student> getAll() {
        return students;
    }

    @Override
    public void setStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void updateStudent(Student student) {

    }
}
