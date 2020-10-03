package school.siit;

import java.util.ArrayList;

public class Phone implements Telephone{

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
        for (int i = 0; i < contacts.size(); i++)
            if (contacts.get(i).getPhoneNo().equals(phoneNo))
                for (int j = 0; j < contacts.get(i).getMessagesReceived().size(); j++)
                    System.out.println(contacts.get(i).getMessagesReceived().get(j));
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