package homework04.view;

import homework04.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
