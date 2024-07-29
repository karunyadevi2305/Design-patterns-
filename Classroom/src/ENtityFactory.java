/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
class EntityFactory {
    public static Classroom createClassroom(String name) {
        return new Classroom(name);
    }

    public static Student createStudent(String id) {
        return new Student(id);
    }

    public static Assignment createAssignment(String details) {
        return new Assignment(details);
    }
}
