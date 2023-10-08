import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddressBookEndToEndTest {
    private AddressBook addressBook;

    @Before
    public void setUp() {
        addressBook = new AddressBook();
    }

    @Test
    public void testExportAndImportData() {
        // Создайте несколько тестовых контактов
        Contact contact1 = new Contact("John", "Doe", "123-456-7890");
        Contact contact2 = new Contact("Jane", "Smith", "987-654-3210");

        // Добавляем их в адресную книгу
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        // Экспортируем данные
        List<Contact> exportedContacts = addressBook.getContacts();

        // Очищаем адресную книгу (для имитации новой сессии)
        addressBook.getContacts().clear();

        // Импортируем данные обратно
        for (Contact contact : exportedContacts) {
            addressBook.addContact(contact);
        }

        // Проверяем, что данные были успешно импортированы
        List<Contact> importedContacts = addressBook.getContacts();
        assertEquals(exportedContacts.size(), importedContacts.size());
        for (Contact contact : exportedContacts) {
            assertTrue(importedContacts.contains(contact));
        }

    }

    @Test
    public void testContactSearch() {
        Contact contact1 = new Contact("Alice", "Johnson", "111-222-3333");
        Contact contact2 = new Contact("Bob", "Smith", "444-555-6666");

        // Добавьте контакты в адресную книгу
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);

        // Поиск контакта по имени
        List<Contact> searchResults = addressBook.searchContactByName("Johnson");

        // Проверьте, что результат поиска содержит ожидаемый контакт
        assertEquals(1, searchResults.size());
        assertTrue(searchResults.contains(contact1));
    }
}
