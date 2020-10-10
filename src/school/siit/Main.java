package school.siit;

public class Main {
    public static void main(String[] args) {

        //Phone phone= new Samsung(); // shouldn't compile
        Phone phone = new OnePlus7TPro("");

        phone.addContact("1", "0758962453", "Radu", "Radulescu");
        phone.addContact("2", "0762593456", "Constantin", "Constantinescu");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage(phone.getContact("1").getPhoneNo(), "Salut,\nce faci prietene?");
        phone.listMessages(phone.getContact("1").getPhoneNo());

        // send a message to the second contact from the previous listed
        phone.call(phone.getContact("2").getPhoneNo());
        phone.viewHistory();
    }
}
