package structural.facade;

/*
Facade design pattern provide a unified interface to a set of interfaces in a subsystem.
Facade defines a higher-level interface that makes the subsystem easier to use.
 */
public class Main
{
    public static void main(String[] args) throws Exception
    {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

        reportGeneratorFacade.generateReport(ReportType.HTML, null, null);

        reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
    }
}