package school.siit;

public class OnePlus8Pro extends OnePlus{

    public OnePlus8Pro(String imei){
        batteryLifeHours = 88;

        this.material = "Plastic";
        this.color = "Glacial Green";
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
