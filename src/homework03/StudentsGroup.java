package homework03;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup implements Iterable<Student> {
    private List<Student> students;

    private Integer number;

    public StudentsGroup () {
        this.students = new ArrayList<Student>();
        this.number = null;
    }

    public StudentsGroup (Integer number) {
        this.students = new ArrayList<Student>();
        this.number = number;
    }

    public StudentsGroup(Integer number ,List<Student> students) {
        this.number = number;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Integer getNumber() {
        return number;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
        }
    }

    @Override
    public String toString() {
        return "Группа #" + number + ": \n" + students;
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }
}
