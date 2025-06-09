package Java21;

import java.util.List;

public class SwitchOperatorNew {
    public static void main(String[] args) {
        Object o1 = "Hello";
        process(o1);

        Object o2 = 534534;
        process(o2);

        Object o3 = 534.543;
        process(o3);

        System.out.println("\n\nEvaluate");

        // method evaluate
        Object o_ev_1 = "Java";
        evaluate(o_ev_1);

        Object o_ev_2 = 54353;
        evaluate(o_ev_2);

        Object o_ev_3 = List.of(1, 2, 3);
        evaluate(o_ev_3);

        Object o_ev_4 = List.of(1);
        evaluate(o_ev_4);
    }

    // Now we can check type of the object (pattern matching)
    public static void process(Object o) {
        switch (o) {
            case String s -> System.out.println("String " + s);
            case Integer i -> System.out.println("Integer " + i);
            case Double d -> System.out.println("Double " + d);
            default -> System.out.println("Unknown type");
        }
    }

    // Now we can check type of the object and with "when" check different conditions (pattern matching)
    public static void evaluate(Object o) {
        switch (o) {
            case String s when s.length() > 5 -> System.out.println("Long String " + s);
            case String s -> System.out.println("Short String " + s);
            case Integer i when i > 100 -> System.out.println("Large Integer " + i);
            case Integer i -> System.out.println("Small Integer " + i);
            case List<?> l when l.size() > 2 -> System.out.println("Large List " + l);
            case List<?> l -> System.out.println("Small List " + l);
            default -> System.out.println("Unknown type");
        }
    }
}
