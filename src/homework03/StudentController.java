package homework03;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public static void main(String[] args) {
        Student student01 = new Student(1, "Анатолий", "Юрьевич", "Двойкин");
        Student student02 = new Student(2, "Сергий", "Сергеевич", "Шариков");
        Student student03 = new Student(3, "Ирина", "Анатольевна", "Юдина");
        Student student04 = new Student(4, "Иван", "Александрович", "Отличный");
        Student student05 = new Student(5, "Ольга", "Ивановна", "Лебедева");
        Student student06 = new Student(6, "Олег", "Исаков", "Яковлев");
        Student student07 = new Student(7, "Юля", "Антонова", "Носова");
        Student student08 = new Student(8, "Маша", "Арёмова", "Морозова");
        Student student09 = new Student(9, "Ира", "Ивановна", "Эртильская");
        Student student10 = new Student(10, "Марина", "Ивановна", "Лебедева");
        Student student11 = new Student(11, "Артём", "Аристахович", "Артемонов");
        Student student12 = new Student(12, "Святослав", "Вячеславич", "Роднин");
        Student student13 = new Student(13, "Яна", "Яновна", "Киш");
        Student student14 = new Student(14, "Борис", "Васильевич", "Быстров");

        StudentsGroup studentsGroup01 = new StudentsGroup(45);
        studentsGroup01.addStudent(student04);
        studentsGroup01.addStudent(student06);
        studentsGroup01.addStudent(student01);
        studentsGroup01.addStudent(student03);
        studentsGroup01.addStudent(student02);
        studentsGroup01.addStudent(student05);

        StudentsGroup studentsGroup02 = new StudentsGroup(79);
        studentsGroup02.addStudent(student07);
        studentsGroup02.addStudent(student08);
        studentsGroup02.addStudent(student09);
        studentsGroup02.addStudent(student10);

        StudentsGroup studentsGroup03 = new StudentsGroup(11);
        studentsGroup03.addStudent(student11);
        studentsGroup03.addStudent(student12);
        studentsGroup03.addStudent(student13);
        studentsGroup03.addStudent(student14);


        // работа сортировки с первой группой
        StudentsGroupServes studentsGroupServes = new StudentsGroupServes();
        studentsGroupServes.setStudentsGroup(studentsGroup01);
        System.out.println("Показывает всех стутендентов добавленных в группу");
        System.out.println(studentsGroup01);


        System.out.println("Удаляем Шарикова из группы");
        studentsGroupServes.removeStudent("Сергий", "Сергеевич", "Шариков");
        System.out.println(studentsGroup01);


        System.out.println("Сортируем по ID");
        studentsGroupServes.sortID(studentsGroup01);
        System.out.println(studentsGroup01);


        System.out.println("Сортируем по Фамилии + Имени");
        studentsGroupServes.sortName(studentsGroup01);
        System.out.println(studentsGroup01);

        System.out.println();

        // создаем поток
        System.out.println("Создаем поток");
        System.out.println();

        Stream stream02 = new Stream(2);
        stream02.addGroup(studentsGroup02);
        stream02.addGroup(studentsGroup03);

        Stream stream01 = new Stream(1);
        stream01.addGroup(studentsGroup01);
        System.out.println(stream01);

        System.out.println();


        // создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream02);
        streams.add(stream01);
        System.out.println("Сортируем поток по группам");
        System.out.println("До:");
        System.out.println(streams);

        System.out.println("После:");
        StreamServes streamServes = new StreamServes();
        streamServes.sortSize(streams);
        System.out.println(streams);
    }
}
