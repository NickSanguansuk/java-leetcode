package interview.coforge.interview_2023_07_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interview {

    //public String reverseString(String str) {
    //    String result = "";
    //
    //    for (int i = 0; i < str.length(); i++) {
    //        result = str.charAt(i) + result;
    //    }
    //
    //    return result;
    //}

    // This one has trim()
    //public String reverseString(String str) {
    //    String result = "";
    //
    //    StringBuilder stringBuilder = new StringBuilder(str);
    //    result = stringBuilder.reverse().toString().trim();
    //
    //    return result;
    //}

    public String reverseString(String str) {
        String ans = Stream.of(str)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining());

        return ans;
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        System.out.println("----------");
        // Reverse a string

        String str = "Hello World Nick Sang ";

        System.out.println(solution.reverseString(str));

        System.out.println("----------");
        // Using Stream API with Lambda to get a list of ... from the original list

        List<String> letters = new ArrayList<>(Arrays.asList("aEa", "aMa", "aZa", "aCa", "aXa", "aAa"));
        System.out.println(letters);

        List<String> secondLettersHigherThanGList = letters
                .stream()
                .filter(x -> x.charAt(1) > 'G')
                .collect(Collectors.toList());

        System.out.println(secondLettersHigherThanGList);

        System.out.println("----------");

        /*

        // Select the third-highest salaries in the company

        // ---------- Answer 2
            ('Orel Eraki', 80),
            ('Prateek Chaudhary', 80),

        SELECT *
        FROM `employee`
        WHERE `Salary` = (SELECT DISTINCT `Salary`
     	        FROM `employee`
     	        ORDER BY `Salary` DESC
                LIMIT 1 OFFSET 2)
        ;

        */

    }
}

/*

Select the third-highest salaries in the company
	('Bill Gates', 100),
    ('Dennis Ritchie', 90),
    ('Brian Kernighan', 90),
    ('Orel Eraki', 80),
    ('Prateek Chaudhary', 80),
    ('John Snow', 75)

// ---------- Answer 1
    ('Dennis Ritchie', 90),
    ('Brian Kernighan', 90),

SELECT *
FROM `employee`
WHERE `Salary` = (SELECT `Salary`
     	FROM `employee`
     	ORDER BY `Salary` DESC
        LIMIT 1 OFFSET 2)
;

// ---------- Answer 2
    ('Orel Eraki', 80),
    ('Prateek Chaudhary', 80),

SELECT *
FROM `employee`
WHERE `Salary` = (SELECT DISTINCT `Salary`
        FROM `employee`
     	ORDER BY `Salary` DESC
        LIMIT 1 OFFSET 2)
;

https://www.db-fiddle.com/f/kypbSttwBuXHzC7AFEfmMJ/1

CREATE TABLE employee (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `FullName` VARCHAR(20) NULL NULL,
  `Salary` DECIMAL NULL NULL,
  PRIMARY KEY (`Id`)
);

INSERT INTO employee
    (`FullName`, `Salary`)
VALUES
	('Bill Gates', 100),
    ('Dennis Ritchie', 90),
    ('Brian Kernighan', 90),
    ('Orel Eraki', 80),
    ('Prateek Chaudhary', 80),
    ('John Snow', 75)
;

*/
