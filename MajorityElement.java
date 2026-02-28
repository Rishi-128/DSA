import java.util.HashMap;
import java.util.Collections;

public class MajorityElement {
    public static void move_algorithm(int[] arr, int n, int target) {
        int ele = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (ele == arr[i]) {
                count++;
                ;
            } else if (ele != arr[i] && count != 0) {
                count--;
            } else {
                ele = arr[i];
            }
        }
        // TC -> O(n) , SC -> O(1)
        // if they mention that if always their will be max ele then the below step will
        // be eliminated or else // TC -> O(2n) , SC -> O(1)
        int c = 0;
        for (int i : arr) {
            if (i == ele) {
                c++;
            }
        }
        if (c > target)
            System.out.println(ele);
        else
            System.out.println("No element");
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 2, 2, 1, 3, 2, 1, 2 };
        int n = arr.length;
        int target = Math.floorDiv(n, 2);
        // HashMap<Integer,Integer> m = new HashMap<>();
        // int max;
        // int key;
        // for(int num : arr){
        // m.put(num, m.getOrDefault(num, 0) + 1);
        // max = Collections.max(m.values());

        // }
        // if(max>target){
        // System.out.println(m.p;
        // }
        // else{
        // System.out.println("No element!!");
        // }
        move_algorithm(arr, n, target);
    }
}