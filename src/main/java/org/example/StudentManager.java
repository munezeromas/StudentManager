package org.example;

import java.util.*;

public class StudentManager {

    public void addStudent(Map<Integer, String> students, int studentId, String name) {
        try {
            if (studentId <= 0) {
                throw new IllegalArgumentException("Student ID must be positive.");
            }
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be empty.");
            }
            students.put(studentId, name);
            System.out.println("Student added: ID = " + studentId + ", Name = " + name);
        } catch (NullPointerException e) {
            System.out.println("Error: Student map is null.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void sortStudents(Map<Integer, String> students) {
        try {
            TreeMap<Integer, String> sorted = new TreeMap<>(students);
            System.out.println("Sorted students:");
            for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
                System.out.println("ID = " + entry.getKey() + ", Name = " + entry.getValue());
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot sort null map.");
        }
    }

    public void searchStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.containsKey(studentId)) {
                System.out.println("Student found: ID = " + studentId + ", Name = " + students.get(studentId));
            } else {
                System.out.println("Student with ID " + studentId + " not found.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot search in null map.");
        }
    }

    public void removeStudent(Map<Integer, String> students, int studentId) {
        try {
            if (students.containsKey(studentId)) {
                students.remove(studentId);
                System.out.println("Student removed: ID = " + studentId);
            } else {
                System.out.println("Student with ID " + studentId + " does not exist.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot remove from null map.");
        }
    }

    public void findStudentWithHighestId(Map<Integer, String> students) {
        try {
            if (students.isEmpty()) {
                System.out.println("No students available.");
                return;
            }
            Integer highestId = Collections.max(students.keySet());
            System.out.println("Student with highest ID: ID = " + highestId + ", Name = " + students.get(highestId));
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot find in null map.");
        }
    }

    public void findStudentWithLowestId(Map<Integer, String> students) {
        try {
            if (students.isEmpty()) {
                System.out.println("No students available.");
                return;
            }
            Integer lowestId = Collections.min(students.keySet());
            System.out.println("Student with lowest ID: ID = " + lowestId + ", Name = " + students.get(lowestId));
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot find in null map.");
        }
    }
}

