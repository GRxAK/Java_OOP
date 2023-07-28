package homework04.service;

import homework04.data.Teacher;
import homework04.data.UserComparator;

import java.util.List;

public class TeacherService {
    private Teacher teacher;

    public List<Teacher> getSortByFIO (List<Teacher> teachers) {
        teachers.sort(new UserComparator<Teacher>());
        return teachers;
    }

    public void setAll(Teacher teacher ,String firstName, String secondName, String lastName, String dateOfBirth) {
        teacher.setFirstName(firstName);
        teacher.setSecondName(secondName);
        teacher.setLastName(lastName);
        teacher.setDateOfBirth(dateOfBirth);
    }
}
