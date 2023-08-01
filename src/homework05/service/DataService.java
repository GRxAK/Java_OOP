package homework05.service;

import homework05.model.*;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();

    public void create(String lastName, String firstName, String secondName, Type type) {
        int ID = getFreeID(type);
        if (Type.STUDENT == type) {
            this.userList.add(new Student(ID, lastName, firstName, secondName));
        }
        if (Type.TEACHER == type){
            this.userList.add(new Teacher(ID, lastName, firstName, secondName));
        }
    }

    public User getUser(Type type, int ID) {
        User result = null;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : this.userList) {
            if (itsStudent && user instanceof Student && ID == ((Student) user).getID()) {
                result =  (Student) user;
            }
            if (!itsStudent && user instanceof Teacher && ID == ((Teacher) user).getID()) {
                result =  (Teacher) user;
            }
        }
        return result;
    }

    public List<User> getAllUser(Type type) {
        List<User> list = new ArrayList<User>();
        boolean itsStudent = Type.STUDENT == type;
        for (User user : this.userList) {
            if (itsStudent && user instanceof Student) {
                list.add((Student) user);
            }
            if (!itsStudent && user instanceof Teacher) {
                list.add((Teacher) user);
            }
        }
        return list;
    }

    public List<User> getUserList() {
        return this.userList;
    }

    private int getFreeID(Type type) {
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : this.userList) {
            if (itsStudent && user instanceof Student) {
                lastID = ((Student) user).getID() + 1;
            }
            if (!itsStudent && user instanceof Teacher) {
                lastID = ((Teacher) user).getID() + 1;
            }
        }
        return lastID;
    }
}
