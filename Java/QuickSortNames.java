import java.util.Arrays;

public class QuickSortNames {

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace"};
        
        System.out.println("Original list of names:");
        System.out.println(Arrays.toString(names));

        quickSort(names, 0, names.length - 1);

        System.out.println("\nSorted list of names (ascending order):");
        System.out.println(Arrays.toString(names));
    }
}
