import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine().trim();
            String[] parts;
            String className;
            if (command.startsWith("add_classroom")) {
                parts = command.split(" ");
                if (parts.length == 2) {
                    className = parts[1];
                    manager.addClassroom(className);
                } else {
                    System.out.println("Invalid command format. Usage: add_classroom <class_name>");
                }
            } else if (command.startsWith("add_student")) {
                parts = command.split(" ");
                if (parts.length == 3) {
                    String studentId = parts[1];
                    className = parts[2];
                    manager.addStudent(studentId, className);
                } else {
                    System.out.println("Invalid command format. Usage: add_student <student_id> <class_name>");
                }
            } else if (command.startsWith("schedule_assignment")) {
                parts = command.split(" ");
                if (parts.length == 3) {
                    className = parts[1];
                    String details = parts[2];
                    manager.scheduleAssignment(className, details);
                } else {
                    System.out.println("Invalid command format. Usage: schedule_assignment <class_name> <details>");
                }
            } else if (command.startsWith("submit_assignment")) {
                parts = command.split(" ");
                if (parts.length == 4) {
                    String studentId = parts[1];
                    className = parts[2];
                    String details = parts[3];
                    manager.submitAssignment(studentId, className, details);
                } else {
                    System.out.println("Invalid command format. Usage: submit_assignment <student_id> <class_name> <details>");
                }
            } else if (command.startsWith("delete_classroom")) {
                parts = command.split(" ");
                if (parts.length == 2) {
                    className = parts[1];
                    manager.deleteClassroom(className);
                } else {
                    System.out.println("Invalid command format. Usage: delete_classroom <class_name>");
                }
            } else if (command.startsWith("update_assignment_status")) {
                parts = command.split(" ");
                if (parts.length == 5) {
                    String studentId = parts[1];
                    className = parts[2];
                    String details = parts[3];
                    boolean status = Boolean.parseBoolean(parts[4]);
                    manager.updateAssignmentStatus(studentId, className, details, status);
                } else {
                    System.out.println("Invalid command format. Usage: update_assignment_status <student_id> <class_name> <details> <status>");
                }
            } else if (command.equals("display_classrooms")) {
                manager.displayClassrooms();
            } else if (command.equals("display_students")) {
                manager.displayStudents();
            } else if (command.startsWith("display_assignments")) {
                parts = command.split(" ");
                if (parts.length == 2) {
                    className = parts[1];
                    manager.displayAssignments(className);
                } else {
                    System.out.println("Invalid command format. Usage: display_assignments <class_name>");
                }
            } else {
                System.out.println("Unknown command.");
            }
        }
    }
}
