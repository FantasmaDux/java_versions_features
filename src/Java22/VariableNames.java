package Java22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariableNames {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("123");
        } catch (NumberFormatException e) { // here we are not using e variable
            System.out.println("Not a num");
        }

        Map<String, List<Integer>> map = new HashMap<>();
        map.computeIfAbsent("hi", k -> new ArrayList<>()).add(2);  // here we are using k param

        // But now we can use unnamed variables
        try {
            int number = Integer.parseInt("123");
        } catch (NumberFormatException _) {
            System.out.println("Not a num");
        }

        Map<String, List<Integer>> map2 = new HashMap<>();
        map.computeIfAbsent("hi", _ -> new ArrayList<>()).add(2);
    }
}
