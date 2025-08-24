public class ConsoleLogger  implements  Ilogger{
    public void log(String msg){
        System.out.println("[LOG] " + msg); 
    }
}