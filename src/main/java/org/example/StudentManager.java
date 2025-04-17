package org.example;

import java.util.*;

public class StudentManager {

    public void addStudent(Map<Integer, String> students, int studentId, String name) {
        if (students == null) {
            System.out.println("No student list found.");
            return;
        }
        if (studentId <= 0 || name == null || name.trim().isEmpty()) {
            System.out.println("Invalid student info.");
            return;
        }
        students.put(studentId, name);
        System.out.println("Added: ID = " + studentId + ", Name = " + name);
    }

    public void sortStudents(Map<Integer, String> students) {
        if (students == null) {
            System.out.println("No student list to sort.");
            return;
        }
        TreeMap<Integer, String> sorted = new TreeMap<>(students);
        System.out.println("Sorted students:");
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            System.out.println("ID = " + entry.getKey() + ", Name = " + entry.getValue());
        }
    }

    public void searchStudent(Map<Integer, String> students, int studentId) {
        if (students == null) {
            System.out.println("No student list to search.");
            return;
        }
        if (students.containsKey(studentId)) {
            System.out.println("Found: ID = " + studentId + ", Name = " + students.get(studentId));
        } else {
            System.out.println("ID " + studentId + " not found.");
        }
    }

    public void removeStudent(Map<Integer, String> students, int studentId) {
        if (students == null) {
            System.out.println("No student list to remove from.");
            return;
        }
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            System.out.println("Removed: ID = " + studentId);
        } else {
            System.out.println("ID " + studentId + " not found.");
        }
    }

    public void findStudentWithHighestId(Map<Integer, String> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        int maxId = Collections.max(students.keySet());
        System.out.println("Highest ID: " + maxId + ", Name = " + students.get(maxId));
    }

    public void findStudentWithLowestId(Map<Integer, String> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        int minId = Collections.min(students.keySet());
        System.out.println("Lowest ID: " + minId + ", Name = " + students.get(minId));
    }
}


