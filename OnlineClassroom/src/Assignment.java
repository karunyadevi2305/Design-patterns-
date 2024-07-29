public class Assignment {
    private String details;
    private boolean submitted;
    private Student submittedBy;

    // Constructor
    public Assignment(String details) {
        this.details = details;
        this.submitted = false;
        this.submittedBy = null;
    }

    // Getters and Setters
    public String getDetails() {
        return details;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public Student getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmitted(boolean submitted, Student submittedBy) {
        this.submitted = submitted;
        this.submittedBy = submittedBy;
    }
}
