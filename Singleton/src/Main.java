/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class Main {
    public static void main(String[] args) {
        PrinterSpool spool = PrinterSpool.getInstance();

        spool.addPrintJob(new PrintJob("Job1", "Document1.pdf"));
        spool.addPrintJob(new PrintJob("Job2", "Document2.docx"));
        spool.addPrintJob(new PrintJob("Job3", "Image.jpg"));

        System.out.println("Print job count: " + spool.getPrintJobCount());

        spool.printNextJob();
        spool.printNextJob();
        spool.printNextJob();

        System.out.println("Print job count: " + spool.getPrintJobCount());
    }
}