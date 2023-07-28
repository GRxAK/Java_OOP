package homework04;

import homework04.data.*;
import homework04.service.TeacherService;
import homework04.view.StudentView;
import homework04.view.TeacherView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student( "Анатолий", "Юрьевич", "Двойкин", "12.02.2010");
        Student student02 = new Student( "Сергий", "Сергеевич", "Шариков", "12.02.2010");
        Student student03 = new Student( "Ирина", "Анатольевна", "Юдина", "12.02.2010");
        Student student04 = new Student( "Иван", "Александрович", "Отличный", "12.02.2010");
        Student student05 = new Student( "Ольга", "Ивановна", "Лебедева", "12.02.2010");
        Student student06 = new Student( "Олег", "Исаков", "Яковлев", "12.02.2010");
        Student student07 = new Student( "Юля", "Антонова", "Носова", "12.02.2010");
        Student student08 = new Student( "Маша", "Арёмова", "Морозова", "12.02.2010");
        Student student09 = new Student( "Ира", "Ивановна", "Эртильская", "12.02.2010");
        Student student10 = new Student( "Марина", "Ивановна", "Лебедева", "12.02.2010");
        Student student11 = new Student( "Артём", "Аристахович", "Артемонов", "12.02.2010");
        Student student12 = new Student( "Святослав", "Вячеславич", "Роднин", "12.02.2010");

        Teacher teacher01 = new Teacher( "Яна", "Яновна", "Кравцова", "12.02.2010");
        Teacher teacher02 = new Teacher( "Борис", "Васильевич", "Быстров", "12.02.2010");

        List<Student> listStudents01 = new ArrayList<>();
        List<Student> listStudents02 = new ArrayList<>();

        StudentGroup studentsGroup01 = new StudentGroup(teacher01, listStudents01);
        studentsGroup01.crateStudent(student01);
        studentsGroup01.crateStudent(student02);
        studentsGroup01.crateStudent(student03);
        studentsGroup01.crateStudent(student04);
        studentsGroup01.crateStudent(student05);
        studentsGroup01.crateStudent(student06);
        studentsGroup01.crateStudent(student07);

        StudentGroup studentsGroup02 = new StudentGroup(teacher02, listStudents02);
        studentsGroup02.crateStudent(student08);
        studentsGroup02.crateStudent(student09);
        studentsGroup02.crateStudent(student10);
        studentsGroup02.crateStudent(student11);
        studentsGroup02.crateStudent(student12);

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(listStudents01);

        // работа с учетелями

        List<Teacher> listTeachers = new ArrayList<Teacher>();
        listTeachers.add(teacher01);
        listTeachers.add(teacher02);

        TeacherView teacherView =  new TeacherView();
        teacherView.sendOnConsole(listTeachers);

        TeacherService teacherService = new TeacherService();
        teacherService.getSortByFIO(listTeachers);
        teacherView.sendOnConsole(listTeachers);

        teacherService.setAll(teacher01, "Яна", "Яковлена", "Арбузова", "20.10.2000");
        teacherView.sendOnConsole(listTeachers);

        teacherService.getSortByFIO(listTeachers);
        teacherView.sendOnConsole(listTeachers);
    }
}
