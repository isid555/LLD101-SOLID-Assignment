public class SlackDecorator implements NotifierDecorator{
    private final String channel;

    public SlackDecorator(Notifier wrapped, String channel) {
        super(wrapped);
        this.channel = channel;
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        System.out.println("💻 Sending Slack message to #" + channel + ": " + message);
    }
}