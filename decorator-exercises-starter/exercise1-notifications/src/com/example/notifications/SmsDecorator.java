public class SmsDecorator implements NotifierDecorator{
    public final String phone;
    public SmsDecorator(Notifier notifier , String phone){
        super(notifier);
        this.phone = phone;
    }


    public void notify(String message){
        super.notify(message);
        System.out.println("📱 Sending SMS to " + phone + ": " + message);
    }
}