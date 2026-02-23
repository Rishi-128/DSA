import java.io.*;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 6, 8, 9, 11 };
        int smallest = arr[0];
        int second_smallest = 123456789;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < second_smallest) {
                second_smallest = arr[i];
            }

        }
        if (second_smallest == -1)
            System.out.println("No secomd smallest element ");
        else
            System.out.println(second_smallest);

    }

}
