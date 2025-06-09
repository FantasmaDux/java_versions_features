package Java21;

// simplified syntax and fast transformations
public class RecordMatching {
    public static void main(String[] args) {
        Programmer pr1 = new Programmer("Ed", 3);
        Programmer pr2 = new Programmer("Monika", 12);

        printProgrammerInfo(pr1);
        printProgrammerInfo(pr2);
        printProgrammerInfo("fsf");
    }

    public static void printProgrammerInfo(Object obj) {
        switch (obj) {
            case Programmer(String name, int experience) when experience >= 6 -> System.out.println(name + " is senior");
            case Programmer(String name, int experience) when experience >= 3 -> System.out.println(name + " is middle");
            case Programmer(String name, int experience) -> System.out.println(name + " is junior");
            default -> System.out.println("Who the hell are " + obj);
        }
    }

    public record Programmer(String name, int experience) {

    }
}
