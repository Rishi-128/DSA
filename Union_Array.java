import java.util.*;

public class Union_Array {
    // public static int[] optimal(int[] arr1, int[] arr2, int n) {
    // int[] arr = new int[n];
    // int i = 0;
    // int j = 0;
    // int k = 0;
    // while (i < n-1 && j < n-1) {
    // if (arr1[i] <= arr2[j]) {
    // if (arr1[i] == arr2[j]) {
    // j++;
    // }
    // arr[k++] = arr1[i];
    // i++;

    // } else if (arr2[j] <= arr1[i]) {
    // if (arr1[i] == arr2[j]) {
    // i++;
    // }
    // arr[k++] = arr2[j];
    // j++;
    // }
    // // else{
    // // i++;
    // // j++;
    // // }
    // }

    // return arr;
    

    public static <T> Object[] optimal(T[] arr1, T[] arr2) {

        Set<T> unionSet = new HashSet<>();
        unionSet.addAll(Arrays.asList(arr1));
        unionSet.addAll(Arrays.asList(arr2));
        return unionSet.toArray();
    }

    public static int[] brute_force(int[] arr1, int[] arr2) {
        // TC -> O(n1log(n) + n2log(n) ) + O(n1+n2)
        // SC -> O(n1+ n2)
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
            // s.add(arr2[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            s.add(arr2[i]);
        }
        int[] arr = new int[s.size()];
        int j = 0;
        for (int i : s) {
            arr[j] = i;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 1, 2, 3, 4, 4, 5 };
        Integer[] arr2 = { 0, 1, 2, 3, 5, 6, 7 };
        // int[] arr3 = brute_force(arr1, arr2);
        // int max = Math.max(arr1.length, arr2.length);
        Object[] arr3 = optimal(arr1, arr2);
        for (Object i : arr3) {
            System.out.print(i + " ");
        }

    }
}
