
/*Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs 
in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
 */
import java.util.*;

public class InsertionSort {
    static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int empID[] = { 45, 12, 89, 33, 10 };
        System.out.println("Before Sorting: " + Arrays.toString(empID));
        insertionSort(empID);
        System.out.println("After Sorting: " + Arrays.toString(empID));
    }
}
