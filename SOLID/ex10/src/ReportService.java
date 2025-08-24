public class ReportService {
//    void generate(){
//        ConsoleLogger logger = new ConsoleLogger();
//        logger.log("Generating daily report...");
//        System.out.println("Report contents...");
//    }


    private Ilogger ilogger;
    public ReportService(Ilogger ilogger){
        this.ilogger = ilogger;
    }

    void generate(){
        ilogger.log("Generating daily report ...");
        System.out.println("Report contents");
    }

}