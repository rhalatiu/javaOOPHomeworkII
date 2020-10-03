package school.siit;

import java.util.ArrayList;

public abstract class Phone implements Telephone{

    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String contactNo, String phoneNo, String firstName, String lastName){
        Contact newContant = new Contact(contactNo, phoneNo, firstName, lastName);
        this.contacts.add(newContant);
    }
    public void listContacts(){}
    public void sendMessage(String phoneNo, String messageContent){
        if (messageContent.length() > 500)
            return;
        for (int i = 0; i < contacts.size(); i++){
            Contact contactAtI = contacts.get(i);
            if (contactAtI.getPhoneNo().equals(phoneNo))
                contactAtI.sendMessage(messageContent);
        }
    }
    public void listMessages(String phoneNo){
        
    }
    public void call(String phoneNo){}
    public void viewHistory(){}

    public Contact getContact(String contactNo) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contactAtI = contacts.get(i);
            if (contactAtI.getContactNo().equals(contactNo))
                return contactAtI;
        }
        return new Contact();
    }
}