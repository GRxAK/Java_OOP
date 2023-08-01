package homework05;

import homework05.controller.Controller;
import homework05.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("Кубышин", "Антон", "Сергеевич");
        controller.createStudent("Журавлева", "Зинаида", "Юрьевна");
        controller.createStudent("Заморский", "Тимофей", "Михайлович");
        controller.createStudent("Столичная", "Яна", "Рудольфовна");
        controller.createTeacher("Токарев", "Макар", "Иваннович");

        controller.createStudyGroup(1);

    }
}
