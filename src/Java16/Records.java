package Java16;

import java.util.Objects;

public class Records {
    public static void main(String[] args) {
        Programmer2 p2 = new Programmer2("Jack");
        System.out.println(p2.name());
    }

    // creating immutable class
    static final class Programmer{
        private final String language;

        public Programmer(String l) {
            language = l;
        }

        public String getLanguage() {
            return language;
        }

        // for use it in hashmap override methods
        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Programmer that = (Programmer) o;
            return Objects.equals(language, that.language);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(language);
        }
    }

    // now we can do it by record. Record means that class has a final field, constructor.
    // Also, it has override equals and hashcode, getter
    record Programmer2(String name) {

    }
}
