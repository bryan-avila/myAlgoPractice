import java.util.Arrays;

public class InsertionSort {
    // BEST CASE: O(n)  |  WORST CASE: O(n^2)

    // insertionSort takes an array and, starting from the first number, compares it against the sorted side (left most)
    // An iterator 'j' is used to check all previously sorted numbers and find if any are larger than the current value
    // If a number in the sorted side is greater than the current value, then we shift the sorted side to the right and make space
    // This algorithm searches the sorted side of the array.
    public static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++) {

            int currentValue = array[i]; // As an example, {3,1,8,6,2} means this holds value of 1.

            int j = i - 1; // For the very first iteration, j will be 0.

            while(j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;

            }

            // For the first iteration of {3,1,8,6,2}, j will be - 1 after the while loop . Thus, -1 + 1 = 0, swapping array[0] and array[1].
            array[j + 1] = currentValue;

        }

    }

    // Main function holds the array.
    public static void main(String[] args) {
        int[] array = {3,1,8,6,2};
        System.out.println("Before insertion sort: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("After insertion sort: " + Arrays.toString(array));
    }
}
