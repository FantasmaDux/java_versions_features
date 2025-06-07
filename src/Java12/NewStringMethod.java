package Java12;

import java.util.*;

// it get function. String will pe the parameter. It returns everything we did with string.
// Usually we use it with lambda or streams
public class NewStringMethod {
    public static void main(String[] args) {
        var str = "Hello there";
        var new_str = str.transform(s -> s + " 1");
        System.out.println(new_str);

        var upper = "hello".transform(String::toUpperCase);
        System.out.println(upper);
    }
}
