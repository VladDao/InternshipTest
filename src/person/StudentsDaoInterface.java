package person;


import java.util.Set;

public interface StudentsDaoInterface {

    Set<Student> getAll();

    void setStudent(Student student);

    void removeStudent(Student student);

    void updateStudent(Student student);

}
