public class WhatsAppDecorator implements NotifierDecorator{
    public final String username;

    public WhatsAppDecorator(Notifier notifier , String username){
        super(notifier);
        this.username = username;
    }

    public void notify(String message){
        super.notigy(message);
        System.out.println("💬 Sending WhatsApp to " + username + ": " + message);
    }
}