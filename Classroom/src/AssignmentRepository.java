import java.util.HashMap;
import java.util.Map;

class AssignmentRepository {
    private Map<String, Assignment> assignments;

    public AssignmentRepository() {
        this.assignments = new HashMap<>();
    }

    public void addAssignment(Assignment assignment) {
        assignments.put(assignment.getDetails(), assignment);
    }

    public Assignment getAssignment(String details) {
        return assignments.get(details);
    }
}
