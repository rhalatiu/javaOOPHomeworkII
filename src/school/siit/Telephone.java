package school.siit;

public interface Telephone {

    public void addContact(String contactNo, String phoneNo, String firstName, String lastName);
    void listContacts();
    public void sendMessage(String phoneNo, String messageContent);
    public void listMessages(String phoneNo);
    public void call(String phoneNo);
    void viewHistory();
}
