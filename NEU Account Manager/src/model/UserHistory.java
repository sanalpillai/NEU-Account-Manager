package model;

import java.util.ArrayList;
import java.util.List;

public class UserHistory {
    
    private List<User> history;
    
    public UserHistory() {
        this.history = new ArrayList<>();
    }

    public List<User> getHistory() {
        return history;
    }

    public void setHistory(List<User> history) {
        this.history = history;
    }
    
    public User addNewUser() {
        User newUser = new User();
        history.add(newUser);
        return newUser;
    }
    
    public void deleteUser(User user) {
        history.remove(user);
    }
}