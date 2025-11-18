/*Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort
to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger 
ones are on the right.
Recursively apply Quick Sort on left and right partitions.
 */

public class QuickSort {

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int prices[] = {50, 10, 40, 90, 30, 70};

        quickSort(prices, 0, prices.length - 1);

        for (int x : prices) {
            System.out.print(x + " ");
        }
    }
}


