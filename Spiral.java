import java.util.*;
class Solution{
    public void spiral(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> arr1 = new ArrayList<>();
        int right = n-1; 
        int top= 0;
        int bottom =m -1;
        int left=0;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                arr1.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr1.add(arr[i][right]);
            }
            right--;
             if (top <= bottom) {
            for(int i=right;i>=left;i--){
                arr1.add(arr[bottom][i]);
            }
            bottom--;
        }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                arr1.add(arr[i][left]);
            }
            left++;
        }
        }
        for(Integer i : arr1){
            System.out.println(i);
        }
    }
}
public class Spiral {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        s.spiral(arr);
    }
}
