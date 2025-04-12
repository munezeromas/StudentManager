package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Map<Integer, String> students = new HashMap<>();

        // Valid input
        manager.addStudent(students, 1, "Aline");
        manager.addStudent(students, 2, "IGABE");

        // Invalid input
        manager.addStudent(students, -3, "Tristan"); // Invalid ID
        manager.addStudent(students, 4, "");          // Empty name

        // Null map (invalid)
        manager.addStudent(null, 5, "Teta");

        // Sorting
        manager.sortStudents(students);

        // Searching
        manager.searchStudent(students, 1); // Valid
        manager.searchStudent(students, 10); // Not found
        manager.searchStudent(null, 2); // Null map

        // Removing
        manager.removeStudent(students, 2); // Valid
        manager.removeStudent(students, 5); // Not found
        manager.removeStudent(null, 1);     // Null map

        // Highest and Lowest
        manager.findStudentWithHighestId(students);
        manager.findStudentWithLowestId(students);

        // Edge case: Empty map
        Map<Integer, String> emptyMap = new HashMap<>();
        manager.findStudentWithHighestId(emptyMap);
        manager.findStudentWithLowestId(emptyMap);
    }
}
