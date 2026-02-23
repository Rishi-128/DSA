import java.util.*;

public class Intersection {
    public static int[] brute_force(int[] a,int[] b){
        int n = a.length;
        int m = b.length;
         int min = Math.min(a.length, b.length);
        int[] c = new int[min];
        int[] visited = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            visited[i] =0;
            for(int j=i;j<m;j++){
                if(a[i]==b[j] && visited[i]==0){
                    visited[i] =1;
                    c[k++] = a[i];
                    break;
                }
            }
        }
        return c;
    }
    public static int[] intersect(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int min = Math.min(arr1.length, arr2.length);
        ArrayList<Integer> arr = new ArrayList<>();
        while (i < min && j < min) {
            if (arr1[i] == arr2[j]) {
                arr.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int k = 0;
        int[] arr3 = new int[arr.size()];
        for (int q : arr) {
            arr3[k++] = q;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 3, 4, 5, 5 };
        int[] arr2 = { 1, 2, 2, 3, 4, 4, 5, 6, 7 };
      //  int[] arr3 = intersect(arr1, arr2);
         int[] arr3 = brute_force(arr1, arr2);
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
