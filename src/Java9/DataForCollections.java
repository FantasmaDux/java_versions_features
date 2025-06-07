package Java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

// we can initialize list with objects right after creating list. Method List.of(elements)
// Generics should be similar.
// In result we got unmodifiable collection
public class DataForCollections {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "I", "have", "a", "List");
        Set <Double> set = Set.of(4.242, 654.53543, 5.754);
        Map<String, Integer> map = Map.of("key", 1, "key2", 2);
    }
}
