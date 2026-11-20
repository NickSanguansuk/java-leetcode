package practice.stream.practice_5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Practice {

    // Helper Inner Class representing the data structure
    public static class Customer {
        private final int id;
        private final List<Double> deposits;

        public Customer(int id, List<Double> deposits) {
            this.id = id;
            this.deposits = deposits;
        }

        public List<Double> getDeposits() {
            return deposits;
        }
    }

    /**
     * Flattens customer deposits, extracts high-value unique transactions,
     * and sorts them from highest to lowest.
     *
     * @param customers a list of customer profiles containing deposit lists
     * @return a single list of unique high-value deposits (>= 1000.0) sorted descending
     */
    public List<Double> getHighValueDeposits(List<Customer> customers) {
        // Your code here
        return customers.stream()
                .flatMap(customer -> customer.getDeposits().stream())
                .filter(deposit -> deposit >= 1000.0)
                .distinct()
                //.sorted((a, b) -> (int) (b - a))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // Mock Data
        Customer c1 = new Customer(101, List.of(500.0, 1200.0, 5000.0));
        Customer c2 = new Customer(102, List.of(5000.0, 950.0, 2500.50));
        Customer c3 = new Customer(103, List.of(1500.0, 1200.0));

        List<Customer> customers = List.of(c1, c2, c3);

        System.out.println("Result: " + practice.getHighValueDeposits(customers));
        // Expected Output: [5000.0, 2500.5, 1500.0, 1200.0]
    }
}
