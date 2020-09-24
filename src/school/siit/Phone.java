package school.siit;

public abstract class Phone implements Telephone{

    public void addContact(String contactNO, String phoneNO, String firstName, String lastName){}
    public void listContacts(){}
    public void sendMessage(String phoneNo, String messageContent){}
    public void listMessages(String phoneNo){}
    public void call(String phoneNo){}
    public void viewHistory(){}
}
