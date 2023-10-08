import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void editContact(Contact existingContact, Contact newContact) {
        int index = contacts.indexOf(existingContact);
        if (index != -1) {
            contacts.set(index, newContact);
        }
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    // Геттер для списка контактов
    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Contact> searchContactByName(String name) {
        List<Contact> searchResults = new ArrayList<>();
        for (Contact contact : contacts) {
            // Сравниваем имя контакта (без учета регистра)
            if (contact.getFirstName().equalsIgnoreCase(name) ||
                    contact.getLastName().equalsIgnoreCase(name)) {
                searchResults.add(contact);
            }
        }
        return searchResults;
    }
}
