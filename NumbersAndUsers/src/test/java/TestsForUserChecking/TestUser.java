package TestsForUserChecking;

import UsersChecking.User;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestUser {
    @Test
    public void testAuthenticate_ValidCredentials() {
        User user = new User("admin", "password", true);
        assertTrue(user.authenticate("admin", "password"));
    }

    @Test
    public void testAuthenticate_InvalidUsername() {
        User user = new User("admin", "password", true);
        assertFalse(user.authenticate("user", "password"));
    }

    @Test
    public void testAuthenticate_InvalidPassword() {
        User user = new User("admin", "password", true);
        assertFalse(user.authenticate("admin", "wrong-password"));
    }
}
