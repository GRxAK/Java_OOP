package homework05.controller;

import homework05.model.*;
import homework05.service.DataService;
import homework05.service.StudyGroupService;
import homework05.wiew.StudentView;
import homework05.wiew.StudyGroupView;

import java.util.Collections;
import java.util.List;

public class Controller {
    private StudentView studentView = new StudentView();
    private StudyGroupView studyGroupView = new StudyGroupView();
    private DataService dataService = new DataService();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String lastName, String firstName, String secondName) {
        dataService.create(lastName, firstName, secondName, Type.STUDENT);
    }

    public void createTeacher(String lastName, String firstName, String secondName) {
        dataService.create(lastName, firstName, secondName, Type.TEACHER);
    }

    public void createStudyGroup(int ID) {
        List<User> studentList =  dataService.getAllUser(Type.STUDENT);
        Teacher teacher = (Teacher) dataService.getUser(Type.TEACHER, ID);
        StudyGroup group = studyGroupService.create(teacher, studentList);
        studyGroupView.printConsole(group);
    }


    public void getAllStudents() {
        List<User> list = dataService.getAllUser(Type.STUDENT);
        for (User student : list) {
            studentView.printConsole((Student) student);
        }
    }
}
