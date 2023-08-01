package homework05.model;

import static homework05.model.Type.*;

public class Student extends User {
    private int ID;
    private Type type;

    public Student (int ID, String lastName, String firstName, String secondName) {
        super(lastName, firstName, secondName);
        this.ID = ID;
        this.type = STUDENT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Студент: ID = " + this.ID + '\'' +
                "Фамилия = " + super.getLastName() + '\'' +
                ", Имя = " + super.getFirstName() + '\'' +
                ", Отчество = " + super.getSecondName();
    }
}
