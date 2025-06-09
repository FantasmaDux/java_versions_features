package Java17;

// That's about inheritance. But what if I want only certain classes to be able to inherit from the parent?
public class SealedClasses {
    public static void main(String[] args) {

    }

    static class Parent {

    }

    static class Child1 extends Parent {

    }

    static class Child2 extends Parent {

    }

    // To do this we need to use sealed on parent. Like below.
    // But all children need to be final
    static sealed class ParentSealed permits ChildSealed1, ChildSealed2 {

    }

    static final class ChildSealed1 extends ParentSealed {

    }

    static final class ChildSealed2 extends ParentSealed {

    }
}
