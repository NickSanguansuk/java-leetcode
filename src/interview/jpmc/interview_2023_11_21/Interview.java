package interview.jpmc.interview_2023_11_21;

// Find a list of Contacts that Phone A has but Phone B doesn't have.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Interview {

    //public Set<Contact> checkDiff(Contact[] phoneA, Contact[] phoneB) {
    //
    //    Set<Contact> ans = new HashSet<>();
    //    Set<Contact> setB = new HashSet<>();
    //
    //    for (int i = 0; i < phoneB.length; i++) {
    //        setB.add(phoneB[i]);
    //    }
    //
    //    for (int i = 0; i < phoneA.length; i++) {
    //        if (!setB.contains(phoneA[i])) {
    //            ans.add(phoneA[i]);
    //        }
    //    }
    //
    //    return ans;
    //}

    public Set<Contact> checkDiff(Contact[] phoneA, Contact[] phoneB) {

        Set<Contact> setA = new HashSet<>(Arrays.asList(phoneA));
        Set<Contact> setB = new HashSet<>(Arrays.asList(phoneB));

        setA.removeAll(setB);

        return setA;
    }

    public static void main(String[] args) {
        Interview solution = new Interview();

        Contact a = new Contact("A", "1111");
        Contact b = new Contact("B", "2222");
        Contact c = new Contact("C", "3333");
        Contact d = new Contact("D", "4444");
        Contact e = new Contact("E", "5555");

        Contact[] phoneA = {a, c, d};
        Contact[] phoneB = {a, e};

        System.out.println(solution.checkDiff(phoneA, phoneB));
    }
}
