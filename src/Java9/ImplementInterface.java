package Java9;

public class ImplementInterface implements InterfaceWithDefaultMethods{
    @Override
    public void initialize(String firstParam, int secondParam) {
        System.out.println("Инициализация с параметрами: " + firstParam + ", " + secondParam);
    }

    public static void main(String[] args) {
        ImplementInterface obj = new ImplementInterface();
        // Using default
        obj.initialize(); // Returns initialize("I can do this", 100)
        // Non default
        obj.initialize("Пример", 42);
    }
}
