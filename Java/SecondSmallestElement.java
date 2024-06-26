import java.util.Arrays;

public class SecondSmallestElement {
    public static int findSecondSmallest(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        // Return the second element
        return arr[1];
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 2, 8};

        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Second smallest element in the array: " + secondSmallest);
    }
}
