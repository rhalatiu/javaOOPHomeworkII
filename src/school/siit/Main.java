package school.siit;

public class Main {
    public static void main(String[] args) {

        //Phone phone= new Samsung(); // shouldn't compile
        Phone phone = new OnePlus7TPro();

        phone.addContact("1", "0758962453", "first name", "last name");
        phone.addContact("2", "phone number", "first name", "last name");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage(phone.getContact("1").getPhoneNo(), "message content");
        phone.listMessages("phone number");

        // send a message to the second contact from the previous listed
        phone.call("phone number");
        phone.viewHistory();

    }
}
