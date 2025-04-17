package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Map<Integer, String> students = new HashMap<>();

        manager.addStudent(students, 1, "Aline");
        manager.addStudent(students, 2, "Igabe");
        manager.addStudent(students, 3, "Tristan");

        manager.sortStudents(students);

        manager.searchStudent(students, 2);
        manager.removeStudent(students, 1);

        manager.findStudentWithHighestId(students);
        manager.findStudentWithLowestId(students);
    }
}
