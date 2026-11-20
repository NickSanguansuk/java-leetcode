package interview.photon.interview_2023_08_24;

// Count occurrence of characters in a string using Stream Api
// https://www.javatpoint.com/java-program-to-count-occurrences-of-each-character

import java.util.*;
import java.util.stream.Collectors;

public class Interview_a {

    public Map<Character, Long> countOccurrenceOfChars(String str) {
        //// Testing 1
        //str.chars()
        //        .forEach(System.out::println);

        //// Testing 2
        //str.chars()
        //        .mapToObj(x -> (char) x)
        //        .forEach(System.out::println);

        return str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
    }

    //public Map<String, Long> countOccurrenceOfChars(String str) {
    //    ////IntStream intStream = str.chars();
    //    //IntStream intStream = str.codePoints();
    //    ////Stream<Character> streamCharacter = intStream.mapToObj(x -> (char) x);
    //    ////Stream<String> streamString = streamCharacter.map(x -> String.valueOf(x));
    //    //Stream<String> streamString = intStream.mapToObj(x -> String.valueOf((char) x));
    //    //streamString = streamString.map(x -> x.toLowerCase());
    //    //Map<String, Long> map = streamString.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
    //    //return map;
    //
    //    return str.chars()
    //            .mapToObj(x -> String.valueOf((char) x))
    //            .map(String::toLowerCase)
    //            .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
    //}

    //public Map<String, Long> countOccurrenceOfChars(String str) {
    //    return Arrays.stream(str.split(""))
    //            .map(String::toLowerCase)
    //            .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
    //}

    //public Map<String, Long> countOccurrenceOfChars(String str) {
    //    return Arrays.stream(str.split(""))
    //            .map(x -> x.toLowerCase())
    //            .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
    //}

    //public Map<String, Long> countOccurrenceOfChars(String str) {
    //    Stream<String> stream = Arrays.stream(str.split(""));
    //    stream = stream.map(x -> x.toLowerCase());
    //
    //    //List<String> list = stream.collect(Collectors.toList());
    //    //System.out.println(list);
    //
    //    Map<String, Long> map = stream.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
    //    return map;
    //}

    //public Map<String, Long> countOccurrenceOfChars(String str) {
    //    Stream<String> stream = Arrays.stream(str.split(""));
    //    stream = stream.map(x -> x.toLowerCase());
    //
    //    // Testing 1
    //    //List<String> list = stream.collect(Collectors.toList());
    //    //System.out.println(list);
    //
    //    // Testing 2 (Need to comment out the below lines)
    //    //stream.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
    //    //        .forEach((k, v) -> System.out.println(k + " = " + v + " times"));
    //    //return null;
    //    Map<String, Long> map = stream.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
    //    return map;
    //}

    public static void main(String[] args) {
        Interview_a solution = new Interview_a();

        String str1 = "SKGEHSLKDYLD";
        // {s=2, k=2, g=1, e=1, h=1, l=2, d=2, y=1}
        Map<Character, Long> map1 = solution.countOccurrenceOfChars(str1);
        //Map<String, Long> map1 = solution.countOccurrenceOfChars(str1);
        System.out.println(map1);

    }
}


