package homework04.view;

import homework04.data.Student;

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        System.out.println("Список студентов:");
        for (Student student : list) {
            System.out.println("    " + student.getLastName() + " " + student.getFirstName());
        }
    }
}
