package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        // === YOUR TASKS ===
        // 1) Create a base decorator class: NotifierDecorator implements Notifier and wraps another Notifier.
        // 2) Create concrete decorators:
        //      - SmsDecorator (adds SMS send)
        //      - WhatsAppDecorator (adds WhatsApp send)
        //      - SlackDecorator (adds Slack send)
        // 3) Compose at runtime to achieve these combinations:
        //      a) Email + SMS
        //      b) Email + WhatsApp
        //      c) Email + Slack
        //      d) Email + WhatsApp + Slack
        //
        // Example (after you implement):
         Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
         smsAndEmail.notify("Build green ✅");
         Notifier EmailWhatsapp = new WhatsappDecorator(base , "user_wa");
         EmailWhatsapp.notify("Email and whatsapp");

         Notifier EmailSlack = new SlackDecorator(base  , "SlackChannel");

         Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");

         /*
         * Here’s what happens step by step:

SlackDecorator.notify is called.

It calls super.notify(message) → goes to NotifierDecorator.notify, which calls the wrapped object’s notify.

That wrapped object is a WhatsAppDecorator, so WhatsAppDecorator.notify is called.

It calls super.notify(message) again → goes to NotifierDecorator.notify, which calls the wrapped object’s notify.

That wrapped object is the base EmailNotifier, so EmailNotifier.notify is called.

Prints the email.

Then control bubbles back up:

WhatsAppDecorator prints the WhatsApp message.

SlackDecorator prints the Slack message.
*
         * */
         full.notify("Deployment completed 🚀");
    }
}
