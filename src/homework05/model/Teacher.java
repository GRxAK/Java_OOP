package homework05.model;

import static homework05.model.Type.*;

public class Teacher extends User {
    private int ID;
    private Type type;

    public Teacher (int ID, String lastName, String firstName, String secondName) {
        super(lastName, firstName, secondName);
        this.ID = ID;
        this.type = TEACHER;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Учитель: ID = " + this.ID + '\'' +
                "Фамилия = " + super.getLastName() + '\'' +
                ", Имя = " + super.getFirstName() + '\'' +
                ", Отчество = " + super.getSecondName();
    }
}
