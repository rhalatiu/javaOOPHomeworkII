package school.siit;

public class HuaweiP40Pro extends Huawei{

    public HuaweiP40Pro(String imei){
        batteryLifeHours = 75;

        this.material = "Platinum";
        this.color = "Silver Frost";
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
