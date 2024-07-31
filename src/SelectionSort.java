import java.util.Arrays;

public class SelectionSort {
    // BEST CASE: O(n^2)  |  WORST CASE: O(n^2)

    // Given an array and two index numbers, swap positions of numbers in an array.
    public static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;

    }

    // selectionSort has an outer loop that, each iteration, has a new "minimum" (i, i+1, i+2, i+3....).
    // The inner loop, which goes through the entire array, checks if any
    // number in the array (from i+1 position and above) is less than the number before it.
    // When a new minimum is found, store that number and its position in the array into variables.
    // At the end of the inner loop, swap the ith element with the current minimum number.
    public static void selectionSort(int[] array) {

        // Outer Loop
        for(int i = 0; i < array.length - 1; i++) {
            int current_min_number = array[i];
            int min_number_pos = i;

            // Inner Loop
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < current_min_number) {
                    current_min_number = array[j];
                    min_number_pos = j;
                }
            }

            swap(array, i, min_number_pos);

        }
    }


    // Main function holds the array to be sorted
    public static void main(String[] args) {

        int[] numbers = {6,5,3,1,8,7,2,4};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        selectionSort(numbers);

        System.out.println("After selection sort: " + Arrays.toString(numbers));


    }
}
