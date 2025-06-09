package Java16;

public class instanceOfCompare {
    public static void main(String[] args) {
        // previous compare for instanceof and using cast
        Object o = new String("var1");
        if (o instanceof String) {
            String str = (String) o;
            System.out.println(str.repeat(2));
        }

        // now we can create variable right after instanceof
        Object o1 = new String("var2");
        if (o1 instanceof String str) {
            System.out.println(str);
        }
    }
}
