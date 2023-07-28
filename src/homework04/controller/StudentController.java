package homework04.controller;

import homework04.data.Student;
import homework04.view.StudentView;
import homework04.view.UserView;

import java.util.List;

public class StudentController implements UserController<Student> {
    UserView<Student> studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        Student student = new Student(firstName, secondName, lastName, "01.01.2000");
    }

    public void printInConsole(List<Student> students) {
        studentView.sendOnConsole(students);
    }
}
