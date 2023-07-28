package homework04.controller;


import homework04.data.User;

public interface UserController<T extends User> {
    public void create (String firstName, String secondName, String lastName);

}
