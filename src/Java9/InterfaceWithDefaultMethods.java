package Java9;
// In a result we have something like abstract class. It's not a good idea, but we can do it
public interface InterfaceWithDefaultMethods {
    void initialize(String firstParam, int secondParam);

    // Default method. When we use
    default void initialize() {
        initialize("I can do this", 100);
        // or
        initialize2(); // private
    }

    // Helps only with default and static methods
    private void initialize2() {
        initialize("I can do this", 101);
    }
}
