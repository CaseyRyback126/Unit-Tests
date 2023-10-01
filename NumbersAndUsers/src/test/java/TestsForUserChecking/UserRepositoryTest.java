package TestsForUserChecking;

import UsersChecking.User;
import UsersChecking.UserRepository;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRepositoryTest {
    @Test
    public void testAddUserSuccessful() {
        UserRepository userRepository = new UserRepository();
        User user = new User("myUsername", "myPassword", false);
        userRepository.addUser(user);
        assertTrue(userRepository.userExists("myUsername"));
    }

    @Test
    public void testAddUserFailedAuthentication() {
        UserRepository userRepository = new UserRepository();
        User user = new User("admin", "password", true);
        userRepository.addUser(user);
        assertFalse(userRepository.userExists("user"));
    }

    @Test
    public void testUserExists() {
        UserRepository userRepository = new UserRepository();
        User user = new User("myUsername", "myPassword", false);
        userRepository.addUser(user);
        assertTrue(userRepository.userExists("myUsername"));
        assertFalse(userRepository.userExists("nonExistingUser"));
    }

    @Test
    public void testLogoutAllNonAdminUsers() {
        UserRepository userRepository = new UserRepository();

        // Добавляем админа
        User adminUser = new User("admin", "adminPassword", true);
        userRepository.addUser(adminUser);

        // Добавляем обычного пользователя
        User regularUser = new User("user", "userPassword", false);
        userRepository.addUser(regularUser);

        // Проверяем, что оба пользователя добавлены
        assertTrue(userRepository.userExists("admin"));
        assertTrue(userRepository.userExists("user"));

        // Разлогиниваем всех, кроме админа
        userRepository.logoutAllNonAdminUsers();

        // Проверяем, что только админ остался в системе
        assertTrue(userRepository.userExists("admin"));
        assertFalse(userRepository.userExists("user"));
    }
}
