package school.siit;

public interface Telephone {

    void addContact(String contactNo, String phoneNo, String firstName, String lastName);
    void listContacts();
    void sendMessage(String phoneNo, String messageContent);
    void listMessages(String phoneNo);
    void call(String phoneNo);
    void viewHistory();
}
