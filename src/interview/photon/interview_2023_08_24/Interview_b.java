package interview.photon.interview_2023_08_24;

// Write functional interfaces - Function, Predicate, Consumer, Supplier

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Interview_b {

    public String doSomething(String str) {
        String result = str;


        return result;
    }

    public static void main(String[] args) {
        Interview_b solution = new Interview_b();

        String str1 = "Hello World!";
        System.out.println(solution.doSomething(str1));

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("Function interface");
        // Function interface

        // The Function interface consists of the following 4 methods:
        //      - apply()
        //      - andThen()
        //      - compose()
        //      - identity()

        // Function which takes in a number and returns half of it.
        Function<Integer, Double> functionHalf1 = a -> a / 2.0;

        // functionHalf2 + 100 to the output of functionHalf1 function
        Function<Integer, Double> functionHalf2 = functionHalf1.andThen(a -> 100 + a);

        // functionHalf3 + 100 the value given to functionHalf1 function
        Function<Integer, Double> functionHalf3 = functionHalf1.compose(a -> 100 + a);

        // Applying the functions to get the results
        System.out.println(functionHalf1.apply(10));
        System.out.println(functionHalf2.apply(10));
        System.out.println(functionHalf3.apply(10));

        // identity() method
        Function<String, String> functionIdentity = Function.identity();
        System.out.println(functionIdentity.apply("Nick"));

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("Predicate interface");
        // Predicate interface

        // The functional interface Predicate improves manageability of code, helps in unit-testing them separately, and contain some methods like:
        //      - isEqual(Object targetRef)
        //      - and(Predicate other)
        //      - or(Predicate other)
        //      - negate()
        //      - test(T t)

        // Create a predicate
        Predicate<Integer> predicateLowerThan18 = i -> i < 18;
        // Create second predicate
        Predicate<Integer> predicateGreaterThan10 = i -> i > 10;
        // Create third predicate
        Predicate<Integer> predicateGreaterThan65 = i -> i > 65;

        // Calling Predicate methods
        System.out.println(predicateLowerThan18.test(12));
        System.out.println(predicateGreaterThan10.and(predicateLowerThan18).test(12));
        System.out.println(predicateGreaterThan10.and(predicateLowerThan18).negate().test(12));

        System.out.println(predicateGreaterThan10.and(predicateGreaterThan65).negate().test(12));
        System.out.println(predicateGreaterThan10.and(predicateGreaterThan65).negate().and(predicateGreaterThan65).test(12));

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("Consumer interface");
        // Consumer interface

        // The Consumer interface consists of the following 2 methods:
        //      - accept()
        //      - andThen()

        // Consumer to display a number
        Consumer<Integer> consumerDisplay = a -> System.out.println(a);

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> consumerMultiply2ToList = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer>> consumerDisplayList = list -> list.stream()
                .forEach(a -> System.out.print(a + " "));

        // Consumer to display a list of numbers that more than 5
        Consumer<List<Integer>> consumerDisplayListMoreThan5 = list -> list.stream()
                .filter(x -> x > 5)
                .forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(5);

        // Implement Consumers using accept()
        consumerDisplay.accept(10);
        consumerMultiply2ToList.accept(list); // No printing
        consumerDisplayList.accept(list);
        System.out.println(); // new line
        consumerDisplayListMoreThan5.accept(list);
        System.out.println(); // new line

        // Using addThen()
        consumerMultiply2ToList.andThen(consumerDisplayList).accept(list);
        System.out.println(); // new line

        System.out.println("---------- ---------- ---------- ---------- ----------");
        System.out.println("Supplier interface");
        // Supplier interface

        // The Supplier interface consists of the following 1 methods:
        //      - get()

        // This function returns a random value.
        //Supplier<Double> supplierRandomValue = () -> Math.random();
        Supplier<Double> supplierRandomValue = Math::random;

        // Print the random value using get()
        System.out.println(supplierRandomValue.get());

        System.out.println("---------- ---------- ---------- ---------- ----------");
    }
}


