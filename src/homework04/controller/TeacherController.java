package homework04.controller;

import homework04.data.Teacher;
import homework04.view.TeacherView;
import homework04.view.UserView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    UserView<Teacher> teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName, "01.01.2000");
    }

    public void printInConsole(List<Teacher> students) {
        teacherView.sendOnConsole(students);
    }
}
