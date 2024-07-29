import java.util.HashMap;
import java.util.Map;

class ClassroomRepository {
    private Map<String, Classroom> classrooms;

    public ClassroomRepository() {
        this.classrooms = new HashMap<>();
    }

    public void addClassroom(Classroom classroom) {
        classrooms.put(classroom.getName(), classroom);
    }

    public Classroom getClassroom(String name) {
        return classrooms.get(name);
    }
}