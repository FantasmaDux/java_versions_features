package Java11;

import java.util.HashMap;
import java.util.Map;

public class NewVariableCreating {
    public static void main(String[] args) {
        // previous declare
        Map<String, Integer> map = new HashMap<>();

        // new declare (after java 11)
        var map1 = new HashMap<>();

        // we can declare different variables
        var number = 4;
        var string = "Hi there!";

        // we can't overwrite var with different type
        // mistake:
        // number = 3.4;
    }
}
