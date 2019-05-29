package institution;

import institution.interlink.Internship;
import person.Student;
import person.StudentsDao;

public class University {
    private String name;
    private StudentsDao studentsDao = new StudentsDao();
    private Internship internship;

    public University(String name) {
        this.name = name;
    }

    public void setInternship(Internship internship) {
        this.internship = internship;
        getInternship();
    }

    public void setStudent(Student student) {
        if (studentsDao.getAll().contains(student)) {
            studentsDao.removeStudent(student);
            studentsDao.setStudent(student);
        } else {
            studentsDao.setStudent(student);
        }
    }

    public void addStudent(Student student) {
        studentsDao.setStudent(student);
    }

    private int getThreshold() {
        int sum = studentsDao.getAll().stream().mapToInt(Student::getKnowledge).sum();
        return (sum / studentsDao.getAll().size());
    }

    public Internship getInternship() {
        int threshold = getThreshold();
        studentsDao.getAll().stream()
                .filter(student -> student.getKnowledge() > threshold)
                .forEachOrdered((o) -> internship.setStudent(o));
        return internship;
    }
}
