import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Classroom {
    private String name;
    private List<Student> students;
    List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public String getName() {
        return name;
    }
}