public class Demo10 {
    public static void main(String[] args) {
    //        new ReportService().generate();
        Ilogger console = new ConsoleLogger();
        ReportService reportService = new ReportService(console);
        reportService.generate();
    }
}
