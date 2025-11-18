/*Problem Statement:
A university needs to sort students’ exam scores in ascending order. Implement Selection Sort 
to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
 */

public class SelectionSort {

    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int scores[] = { 40, 10, 50, 20, 30 };

        selectionSort(scores);

        for (int x : scores) {
            System.out.print(x + " ");
        }
    }
}
