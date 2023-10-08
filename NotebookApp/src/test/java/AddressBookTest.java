import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddressBookTest {
    // Юнит-тест для проверки добавления контакта
    @Test
    public void testAddContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("John", "Doe", "123-456-7890");
        addressBook.addContact(contact);

        assertTrue(addressBook.getContacts().contains(contact));
    }
    // Юнит-тест для проверки редактирования контакта
    @Test
    public void testEditContact() {
        AddressBook addressBook = new AddressBook();
        Contact originalContact = new Contact("Jane", "Smith", "987-654-3210");
        addressBook.addContact(originalContact);

        Contact updatedContact = new Contact("Jane", "Doe", "111-222-3333");
        addressBook.editContact(originalContact, updatedContact);

        assertTrue(addressBook.getContacts().contains(updatedContact));
        assertFalse(addressBook.getContacts().contains(originalContact));
    }
    // Юнит-тест для проверки удаления контакта
    @Test
    public void testDeleteContact() {
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Alice", "Johnson", "555-123-4567");
        addressBook.addContact(contact);

        addressBook.deleteContact(contact);

        assertFalse(addressBook.getContacts().contains(contact));
    }
}
