import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = { 1, 2, 3, 4, 1, 5 };

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));

        System.out.println();

        input = new Integer[] { 1, 2, 3, 4, 1, 2, 5, 3 };

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));
    }

    // Write your methods here

    public static int findMax(Integer[] input) {

        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Invalid Array");
        }
        int max = input[0];

        for (int i : input) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new TreeSet<>();

        for (int i : input) {
            if (!seen.add(i)) {
                duplicate.add(i);
            }
        }

        return duplicate.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] input) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> unique = new TreeSet<>();

        for (int i : input) {
            if (seen.add(i)) {
                unique.add(i);
            } else {
                unique.remove(i);
            }
        }

        return unique.toArray(new Integer[0]);
    }

}
