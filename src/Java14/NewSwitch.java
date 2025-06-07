package Java14;

import java.util.EnumMap;

public class NewSwitch {
    public static void main(String[] args) {
        // previous switch operator
        Days day = Days.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Sup, I am monday");
                break;
            case FRIDAY:
                System.out.println("Sup, I am friday");
                break;
        }


        // now we have switch expression
        Days day2 = Days.FRIDAY;
        var str = switch (day2) {
            case FRIDAY -> "It's Friday, pal";
            default -> {
                String s = day2.toString();
                int res = s.length();
                yield res; // returns result
            }
        };
        System.out.println(str);
    }

    private enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }
}
