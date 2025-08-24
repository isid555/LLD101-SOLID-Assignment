public class EmailClient {
    void send(String to, String body) {
        System.out.println("[EMAIL to=" + to + "] " + body);
    }

    /*
    * SRP - only one responsiblity to send emails
    * OCP - can be extended , w/o modifying
    *
    * */
}