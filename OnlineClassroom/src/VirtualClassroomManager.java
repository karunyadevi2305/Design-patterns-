import java.util.HashMap;
import java.util.Map;

public class VirtualClassroomManager {
    private Map<String, Classroom> classrooms;
    private Map<String, Student> students;

    // Constructor
    public VirtualClassroomManager() {
        this.classrooms = new HashMap<>();
        this.students = new HashMap<>();
    }

    // Add a classroom
    public void addClassroom(String name) {
        Classroom classroom = EntityFactory.createClassroom(name);
        classrooms.put(name, classroom);
        System.out.println("Classroom " + name + " has been created.");
    }

    // Add a student to a classroom
    public void addStudent(String id, String className) {
        Student student = EntityFactory.createStudent(id);
        students.put(id, student);
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(student);
            System.out.println("Student " + id + " has been added to classroom " + className + ".");
        } else {
            System.out.println("Classroom not found.");
        }
    }

    // Schedule an assignment for a classroom
    public void scheduleAssignment(String className, String details) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Assignment assignment = EntityFactory.createAssignment(details);
            classroom.scheduleAssignment(assignment);
            System.out.println("Assignment scheduled for classroom " + className + " with details: " + details);
        } else {
            System.out.println("Classroom not found.");
        }
    }

    // Submit an assignment for a student in a classroom
    public void submitAssignment(String studentId, String className, String details) {
        Student student = students.get(studentId);
        Classroom classroom = classrooms.get(className);
        if (student != null && classroom != null) {
            if (classroom.submitAssignment(student, details)) {
                System.out.println("Assignment submitted by student " + studentId + " for classroom " + className + " with details: " + details);
            } else {
                System.out.println("Assignment not found or not scheduled for this class.");
            }
        } else {
            System.out.println("Student or classroom not found.");
        }
    }

    // Delete a classroom
    public void deleteClassroom(String className) {
        if (classrooms.containsKey(className)) {
            classrooms.remove(className);
            System.out.println("Classroom " + className + " has been deleted.");
        } else {
            System.out.println("Classroom not found.");
        }
    }

    // Update the submission status of an assignment for a student
    public void updateAssignmentStatus(String studentId, String className, String details, boolean status) {
        Classroom classroom = classrooms.get(className);
        Student student = students.get(studentId);
        if (classroom != null && student != null) {
            classroom.updateAssignmentStatus(student, details, status);
        } else {
            System.out.println("Classroom or student not found.");
        }
    }

    // Display details of all classrooms
    public void displayClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms found.");
        } else {
            for (String className : classrooms.keySet()) {
                System.out.println("Classroom: " + className);
            }
        }
    }

    // Display details of all students along with their class names
    public void displayStudents() {
        boolean noStudents = true;
        for (String className : classrooms.keySet()) {
            Classroom classroom = classrooms.get(className);
            if (!classroom.getStudents().isEmpty()) {
                noStudents = false;
                for (Student student : classroom.getStudents()) {
                    System.out.println("Student ID: " + student.getId() + ", Classroom: " + className);
                }
            }
        }
        if (noStudents) {
            System.out.println("No students found.");
        }
    }

    // Display details of all assignments in a specific classroom
    public void displayAssignments(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            System.out.println("Assignments for Classroom: " + className);
            for (Assignment assignment : classroom.getAssignments()) {
                String submittedBy = assignment.isSubmitted() ? assignment.getSubmittedBy().getId() : "None";
                System.out.println("Assignment: " + assignment.getDetails() + ", Submitted: " + assignment.isSubmitted() +
                        ", Submitted By: " + submittedBy);
            }
        } else {
            System.out.println("Classroom not found.");
        }
    }
}
