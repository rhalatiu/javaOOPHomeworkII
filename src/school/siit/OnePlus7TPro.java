package school.siit;

public class OnePlus7TPro extends OnePlus{

    public OnePlus7TPro(String imei){
        batteryLifeHours = 98;

        this.material = "Metal";
        this.color = "Haze Blue";
    }

    @Override
    public void sendMessage(String phoneNo, String messageContent) {
        super.sendMessage(phoneNo, messageContent);
    }

    @Override
    public void call(String phoneNo) {
        super.call(phoneNo);
    }
}
