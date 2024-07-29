import java.util.logging.Logger;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        EntityFactory entityFactory = new EntityFactory();
        ClassroomRepository classroomRepository = new ClassroomRepository();
        StudentRepository studentRepository = new StudentRepository();
        AssignmentRepository assignmentRepository = new AssignmentRepository();

        Classroom classroom = entityFactory.createClassroom("Classroom 1");
        classroomRepository.addClassroom(classroom);

        Student student = entityFactory.createStudent("Student 1");
        studentRepository.addStudent(student);

        Assignment assignment = entityFactory.createAssignment("Assignment 1");
        assignmentRepository.addAssignment(assignment);

        classroom.addStudent(student);
        classroom.addAssignment(assignment);

        // Logging classroom details
        logger.info("Classroom Information:");
        logger.info("Classroom Name: " + classroom.getName());

        // Logging student details
        logger.info("Students in " + classroom.getName() + ":");
        for (Student s : classroom.students) {
            logger.info("Student ID: " + s.getId());
        }

        // Logging assignment details
        logger.info("Assignments in " + classroom.getName() + ":");
        for (Assignment a : classroom.assignments) {
            logger.info("Assignment Details: " + a.getDetails());
        }
    }
}