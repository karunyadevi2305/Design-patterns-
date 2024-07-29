/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class PrintJob {
    private String jobName;
    private String documentName;

    public PrintJob(String jobName, String documentName) {
        this.jobName = jobName;
        this.documentName = documentName;
    }

    public String getJobName() {
        return jobName;
    }

    public String getDocumentName() {
        return documentName;
    }
}