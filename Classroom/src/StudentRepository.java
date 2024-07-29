import java.util.HashMap;
import java.util.Map;

class StudentRepository {
    private Map<String, Student> students;

    public StudentRepository() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }
}
