package school.siit;

public class HuaweiP30 extends Huawei{

    public HuaweiP30(String imei){
        batteryLifeHours = 60;

        this.material = "Glass";
        this.color = "Aurora";
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