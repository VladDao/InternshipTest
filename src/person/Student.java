package person;

import person.consciousness.Knowledge;

import java.util.Objects;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public int getKnowledge() {
        return knowledge.getLevel();
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return name.equals(student.name);
    }
}
