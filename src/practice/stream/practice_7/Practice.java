package practice.stream.practice_7;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice {

    // Helper Inner Class representing the Employee data structure
    public static class Employee {
        private final int id;
        private final String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public String getName() { return name; }
    }

    /**
     * Converts a list of employees into an ID-to-Name lookup Map.
     * If an ID collision happens, preserves the name with the longer character length.
     *
     * @param employees a list of Employee objects
     * @return a map matching employee IDs to their names
     */
    public Map<Integer, String> getEmployeeLookupMap(List<Employee> employees) {
        // Your code here
        if (employees == null || employees.isEmpty()) {
            return Collections.emptyMap();
        }

        return employees.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getName, (a, b) -> a.length() >= b.length() ? a : b));
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Mock Data
        List<Employee> employees = List.of(
                new Employee(101, "Sam"),
                new Employee(102, "Anna"),
                new Employee(103, "Bob"),
                new Employee(101, "Samantha") // 💡 Duplicate ID 101! "Samantha" is longer than "Sam"
        );

        System.out.println("Result: " + practice.getEmployeeLookupMap(employees));
        // Expected Output: {101=Samantha, 102=Anna, 103=Bob}
    }
}
