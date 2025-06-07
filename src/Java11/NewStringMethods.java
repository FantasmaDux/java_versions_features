package Java11;

public class NewStringMethods {
    public static void main(String[] args) {
        var str = "For my father!\nfsfsd";
        var str2 = " ";
        System.out.println("String has only spaces: " + str.isBlank());
        System.out.println("String is empty: " + str.isEmpty());
        System.out.println("String2 has only spaces: " + str2.isBlank());
        System.out.println(str.repeat(4));
        System.out.println(str.lines().toList());
        System.out.println(str.strip());

    }
}
