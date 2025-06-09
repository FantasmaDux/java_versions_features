package Java16;

import java.util.List;
import java.util.stream.Collectors;

public class UpgradeStreamAPI {
    public static void main(String[] args) {
        // Created list, did something with it, put it back together in collection
        List<String> strs = List.of(1, 2, 3).stream()
                .map(n -> n + " one")
                .collect(Collectors.toList());

        // Now we can use toList instead of Collector
        List<String> strs2 = List.of(1, 2, 3).stream()
                .map(n -> n + " one").toList();

    }
}
