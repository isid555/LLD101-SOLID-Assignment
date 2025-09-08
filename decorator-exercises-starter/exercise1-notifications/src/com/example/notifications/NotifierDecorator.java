public class NotifierDecorator implements Notifier{

    public final Notifier notifier;

    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    public void notify(String message){
        notifier.notify(message);
    }
}