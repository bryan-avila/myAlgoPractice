import java.util.Arrays;

public class QuickSort {
    // BEST CASE: O(nlogn)  |  WORST CASE: O(n^2)

    // Swap will take two numbers from an array and change their position in that array.
    public static void swap(int[] array, int pos1, int pos2) {

        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static void quickSort(int[] array, int leftPos, int rightPos) {

        // Base Case. Single Element Array.
        if(leftPos >= rightPos) {
            return;
        }

        // Select a pivot to sort around.
        int pivot = array[rightPos];

        // Create pointers that point to the far left and far right numbers of the array.
        int leftPointer = leftPos;
        int rightPointer = rightPos;

        // While the left and right pointers do not cross....
        while(leftPointer < rightPointer) {

            // Move the left pointer to the right as long as you cannot find
            // any numbers that are greater than the pivot.
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Move the right pointer to the left as long as you cannot find
            // any numbers that are less than the pivot.
            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // Swap the numbers in the leftPointer and rightPointer position of the array.
            swap(array, leftPointer, rightPointer);

        }

        // Swap the number in array[leftPointer] with the pivot number.
        swap(array, leftPointer, rightPos);

        // Swapping the pivot with the element in the left pointer
        // has split the array in half: The array to the left of the leftPointer
        // and the array to the right of the leftPointer.
        // Sort both of those halves recursively.
        quickSort(array, leftPos, leftPointer - 1);
        quickSort(array, leftPointer + 1, rightPos);
    }


    // Main function holds the array.
    public static void main(String[] args) {

        int[] array = {1,8,3,9,4,5,7};

        System.out.println("Before quick sort: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("After quick sort:" + Arrays.toString(array));
    }
}
