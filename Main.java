
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;

class Main {
    public static int sort(int[] arr, int low, int high) {
        int p = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            // System.out.print(j);
            // System.out.println(arr[i]);
            // System.out.println(p);
            while (i <= high && arr[i] < p) {
                i++;
            }
            while (j >= low && arr[j] > p) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        // System.out.println(p);
        // System.out.println(arr[p]);
        return j;
    }

    public static void quick(int[] arr, int low, int high) {
        if (low < high) {

            int p = sort(arr, low, high);
            // System.out.print(p);
            quick(arr, low, p - 1);
            quick(arr, p + 1, high);
        }
        // quick(arr,low,pivot-1);
        // quick(arr,pivot+1,high);

    }

    public static void main(String[] args) {
        int[] a = {9, 4, 6, 2, 5, 7, 8, 1, 3 };
        int low = 0;
        int high = a.length - 1;
        quick(a, low, high);
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}