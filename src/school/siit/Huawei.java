package school.siit;

public abstract class Huawei extends Phone {

    @Override
    public void addContact(String contactNo, String phoneNo, String firstName, String lastName) {
        super.addContact(contactNo, phoneNo, firstName, lastName);
    }

    @Override
    public void listContacts() {
        super.listContacts();
    }

    @Override
    public void sendMessage(String phoneNo, String messageContent) {
        super.sendMessage(phoneNo, messageContent);
    }

    @Override
    public void listMessages(String phoneNo) {
        super.listMessages(phoneNo);
    }

    @Override
    public void call(String phoneNo) {
        super.call(phoneNo);
    }

    @Override
    public void viewHistory() {
        super.viewHistory();
    }
}