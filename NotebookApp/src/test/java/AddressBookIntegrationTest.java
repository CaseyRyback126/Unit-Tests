import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddressBookIntegrationTest {
    // Интеграционный тест для проверки взаимодействия добавления и удаления контакта
    @Test
    public void testAddAndDeleteContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("John", "Doe", "123-456-7890");

        // Шаг 1: Добавить контакт
        addressBook.addContact(contact);
        assertTrue(addressBook.getContacts().contains(contact));

        // Шаг 2: Удалить контакт
        addressBook.deleteContact(contact);
        assertFalse(addressBook.getContacts().contains(contact));
    }
}
