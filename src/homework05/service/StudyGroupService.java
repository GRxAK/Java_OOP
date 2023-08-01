package homework05.service;

import homework05.model.User;
import homework05.model.StudyGroup;
import homework05.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup create(Teacher teacher, List<User> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        return studyGroup;
    }
}
