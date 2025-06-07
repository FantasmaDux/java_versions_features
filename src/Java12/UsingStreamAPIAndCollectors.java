package Java12;

import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamAPIAndCollectors {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);

        // previous we did it by collector. Working with one stream, but get two different result:
        var sum = nums.stream().collect(Collectors.summingInt(Integer::intValue));
        var avg = nums.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Sum " + sum + " average " + avg);

        // new method collector. We join result in one string right here
        var result = nums.stream().collect(Collectors.teeing(
                Collectors.summingInt(Integer::intValue),
                Collectors.averagingInt(Integer::intValue),
                (summary, average) -> "Sum " + summary + " average " + average));
        System.out.println(result);
    }
}
