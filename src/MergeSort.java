import java.util.Arrays;

public class MergeSort {
    // BEST CASE: O(nlogn)  |  WORST CASE: O(nlogn)

    public static void mergeSort(int[] array) {

        // Base Case
        if(array.length <= 1) {
            return;
        }

        // Find the middle index of the given array.
        int midPoint = array.length / 2;

        // Populate two arrays with the appropriate numbers from the original, given array.
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[array.length - midPoint];

        for(int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }

        for(int j = midPoint; j < array.length; j++) {
            rightArray[j - midPoint] = array[j];
        }

        // Divide and conquer by continually splitting arrays into halves around midpoints
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the result of dividing arrays and sort them appropriately.
        merge(array, leftArray, rightArray);

    }


    public static void merge(int[] array, int[] leftArray, int[] rightArray) {

        // Initialize pointers at the start of each respective array.
        int i = 0, j = 0, k = 0;

        // Traverse through the left and right arrays, looking for the smaller number of the two.
        while(i < leftArray.length && j < rightArray.length) {
            if(leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
                k++;
            }
            else if(rightArray[j] <= leftArray[i]) {
                array[k] = rightArray[j];
                j++;
                k++;
            }

        }

        // Fill in remaining numbers from either the left or right array
        while(i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }


    // Main holds the array
    public static void main(String[] args) {

        int[] array = {38,27,43,3,9,82,19};
        System.out.println("Before merge sort: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("After merge sort: " + Arrays.toString(array));
    }
}
