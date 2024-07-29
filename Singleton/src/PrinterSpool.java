
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author KARUNYA DEVI M
 */

public class PrinterSpool {
    private static PrinterSpool instance;
    private List<PrintJob> printJobs;

    private PrinterSpool() {
        printJobs = new ArrayList<>();
    }

    public static PrinterSpool getInstance() {
        if (instance == null) {
            instance = new PrinterSpool();
        }
        return instance;
    }

    public void addPrintJob(PrintJob job) {
        printJobs.add(job);
        System.out.println("Added print job: " + job.getJobName());
    }

    public void printNextJob() {
        if (!printJobs.isEmpty()) {
            PrintJob job = printJobs.remove(0);
            System.out.println("Printing job: " + job.getJobName());
            // Simulate printing
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Print job completed: " + job.getJobName());
        } else {
            System.out.println("No print jobs in the spool");
        }
    }

    public int getPrintJobCount() {
        return printJobs.size();
    }
}