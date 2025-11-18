/*Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices 
in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements */
import java.util.*;
public class MergeSort {
    static void merge(int arr[], int left, int mid, int right) {

        int i = left;      
        int j = mid + 1;   
        int k = 0;        

        int temp[] = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    static void mergeSort(int arr[], int left, int right) {

        if (left >= right) return;   

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);       
        mergeSort(arr, mid + 1, right); 

        merge(arr, left, mid, right);    
    }

    public static void main(String[] args) {

        int prices[] = {200, 50, 150, 70, 90, 300};

        System.out.println("Original Prices: " + Arrays.toString(prices));

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Prices:   " + Arrays.toString(prices));
    }
}


