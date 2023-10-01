package UsersChecking;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (user != null && user.authenticate(user.getUsername(), user.getPassword())) {
            users.add(user);
        }
    }

    public boolean userExists(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAllNonAdminUsers() {
        users.removeIf(user -> !user.isAdmin());
    }
}
