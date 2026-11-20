package practice.stream.practice_6;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {

    // Helper Inner Class representing the Student data structure
    public static class Student {
        private final String name;
        private final String grade; // e.g., "A", "B", "C"

        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public String getGrade() {
            return grade;
        }
    }

    /**
     * Groups a list of students into a map where the key is the grade,
     * and the value is a list of ONLY student names (Strings) who earned that grade.
     *
     * @param students a list of Student objects
     * @return a map where keys are grades and values are lists of student names
     */
    public Map<String, List<String>> groupStudentNamesByGrade(List<Student> students) {
        // Your code here
        // Guard clause for defensive programming
        if (students == null || students.isEmpty()) {
            return Collections.emptyMap();
        }

        return students.stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.mapping((Student::getName), Collectors.toList())));
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Mock Data
        List<Student> students = List.of(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Emma", "B")
        );

        System.out.println("Result: " + practice.groupStudentNamesByGrade(students));
        // Expected Output: {A=[Alice, Charlie], B=[Bob, Emma], C=[David]}
    }
}
