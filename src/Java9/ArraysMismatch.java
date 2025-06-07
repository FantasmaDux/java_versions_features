package Java9;
import java.util.*;

public class ArraysMismatch {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 5, 7, 8};
        int[] arr2 = new int[] {1, 2, 5, 8, 7};
        System.out.println(Arrays.mismatch(arr1, arr2)); // find mismatch index
    }
}
