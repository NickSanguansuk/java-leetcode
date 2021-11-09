package easy.solution_1656;

// 1656. Design an Ordered Stream

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    String[] list;
    int index;

    public OrderedStream(int n) {
        this.list = new String[n + 2];
        this.index = 1;
    }

    public List<String> insert(int idKey, String value) {
        // Assign value int the idKey location
        this.list[idKey] = value;

        // Create "result" list
        List<String> result = new ArrayList<>();

        // Create while loop, if the value in the index location not null, then add the value to the result list
        // Also move index one location
        while (this.list[this.index] != null) {
            result.add(this.list[this.index]);
            this.index++;
        }

        // Return result
        return result;
    }

    /**
     * Your OrderedStream object will be instantiated and called as such:
     * OrderedStream obj = new OrderedStream(n);
     * List<String> param_1 = obj.insert(idKey,value);
     */
    public static void main(String[] args) {
        OrderedStream obj = new OrderedStream(5);
        List<String> param_1 = obj.insert(3, "ccccc");
        System.out.println(param_1);
        List<String> param_2 = obj.insert(1, "aaaaa");
        System.out.println(param_2);
        List<String> param_3 = obj.insert(2, "bbbbb");
        System.out.println(param_3);
        List<String> param_4 = obj.insert(5, "eeeee");
        System.out.println(param_4);
        List<String> param_5 = obj.insert(4, "ddddd");
        System.out.println(param_5);
    }
}
