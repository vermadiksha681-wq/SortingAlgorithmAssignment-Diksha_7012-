/*Problem Statement:
A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in 
ascending order.
Hint:
Traverse through the array multiple times.
Compare adjacent elements and swap if needed.
Repeat the process until no swaps are required.
 */
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {

        int marks[] = {45, 12, 78, 34, 23};

        for (int i = 0; i < marks.length - 1; i++) {

            for (int j = 0; j < marks.length - 1 - i; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }
}
