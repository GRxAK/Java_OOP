package homework05.model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<User> students;

    public StudyGroup(Teacher teacher, List<User> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Учебная группа: " + teacher +
                "\n    " + students;
    }
}
