package homework04.view;

import homework04.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        System.out.println("Выводит список учителей");
        for (Teacher teacher : list) {
            System.out.println("    " + teacher.getLastName() + " " + teacher.getFirstName());
        }
    }
}
