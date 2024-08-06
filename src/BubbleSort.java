import java.util.Arrays;

public class BubbleSort {
    // BEST CASE: O(n)*  |  WORST CASE: O(n^2)
    // NOTE: Best case is only O(n) if you have some way to check that a swap has occurred.

    // Given an array and two index numbers, swap positions of numbers in an array.
    public static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;

    }

    // bubbleSort will iterate through the given array,
    // starting with the outer loop that goes through each number in the array.
    // The inner loop will check if the number
    // in the jth position of the array is less than the number in the ith position of the array.
    // Swap if that is true, putting the smallest number in the ith position (left most).
    public static void bubbleSort(int[] array) {

        // Outer Loop
        for(int i = 0; i < array.length - 1; i++) {
            // Inner Loop
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    swap(array, i, j);
                }

            }

        }

    }

    // Main function holds the array to be sorted.
    public static void main(String[] args) {

        int[] numbers = {6,5,3,1,8,7,2,4};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("After bubble sort: " + Arrays.toString(numbers));


    }
}
