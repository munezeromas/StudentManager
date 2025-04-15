package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Map<Integer, String> students = new HashMap<>();
        manager.addStudent(students, 1, "Aline");
        manager.addStudent(students, 2, "IGABE");
        manager.addStudent(students, -3, "Tristan");
        manager.addStudent(students, 4, "");
        manager.addStudent(null, 5, "Teta");

        manager.sortStudents(students);

        manager.searchStudent(students, 1);
        manager.searchStudent(students, 10);

        manager.searchStudent(null, 2);
        manager.removeStudent(students, 2);
        manager.removeStudent(students, 5);
        manager.removeStudent(null, 1);
        // Null map
        manager.findStudentWithHighestId(students);
        manager.findStudentWithLowestId(students);

        Map<Integer, String> emptyMap = new HashMap<>();
        manager.findStudentWithHighestId(emptyMap);
        manager.findStudentWithLowestId(emptyMap);
    }
}
