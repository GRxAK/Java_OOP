package homework03;

import java.util.Collections;
import java.util.List;

public class StudentsGroupServes {
    private StudentsGroup studentsGroup;

    public StudentsGroupServes () {
        this.studentsGroup = new StudentsGroup();
    }
    public StudentsGroupServes (Integer number) {
        this.studentsGroup = new StudentsGroup(number);
    }
    public StudentsGroupServes (Integer number ,List<Student> students) {
        this.studentsGroup = new StudentsGroup(number ,students);
    }

    public boolean removeStudent (String firstName, String secondName, String lastName) {
        Student removeStudent = new Student(null, firstName, secondName, lastName);
        List<Student> studentList = studentsGroup.getStudents();
        for (Student student : studentList) {
            if (student.equals(removeStudent)) {
                studentList.remove(removeStudent);
                return true;
            }
        }
        return false;
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public void sortID (StudentsGroup studentsGroup) {
        Collections.sort(studentsGroup.getStudents());
    }

    public void sortName (StudentsGroup studentsGroup) {
        StudentComparator studentComparator = new StudentComparator();
        Collections.sort(studentsGroup.getStudents(), studentComparator);
    }
}
