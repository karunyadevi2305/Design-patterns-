import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    // Constructor
    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    // Add a student to the classroom
    public void addStudent(Student student) {
        students.add(student);
    }

    // Schedule an assignment for the classroom
    public void scheduleAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    // Submit an assignment for a student
    public boolean submitAssignment(Student student, String details) {
        for (Assignment a : assignments) {
            if (a.getDetails().equals(details)) {
                if (!a.isSubmitted()) {
                    a.setSubmitted(true, student);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    // Update assignment status
    public void updateAssignmentStatus(Student student, String details, boolean status) {
        for (Assignment a : assignments) {
            if (a.getDetails().equals(details)) {
                a.setSubmitted(status, student);
                System.out.println("Assignment status updated for student " + student.getId() + " with details: " + details);
                return;
            }
        }
        System.out.println("Assignment not found.");
    }

    // Getters for assignments
    public List<Assignment> getAssignments() {
        return assignments;
    }

    // Getters for students
    public List<Student> getStudents() {
        return students;
    }
}
