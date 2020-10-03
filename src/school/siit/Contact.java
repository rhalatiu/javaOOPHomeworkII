package school.siit;

import java.util.ArrayList;

public class Contact {
    private String contactNo;
    private String phoneNo;
    private String firstName;
    private String lastName;
    ArrayList<String> messagesReceived = new ArrayList<String>();
    ArrayList<String> callHistory = new ArrayList<String>();

    public Contact(){}

    public Contact(String contactNo, String phoneNo, String firstName, String lastName){
        this.contactNo = contactNo;
        this.phoneNo = phoneNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<String> getMessagesReceived() {
        return messagesReceived;
    }

    public void sendMessage(String newMessage) {
        this.messagesReceived.add(newMessage);
    }

    public ArrayList<String> getCallHistory() {
        return callHistory;
    }

    public void callContact(ArrayList<String> callHistory) {
        this.callHistory = callHistory;
    }
}
