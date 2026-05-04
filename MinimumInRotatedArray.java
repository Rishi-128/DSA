class Solution{
    int search(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[left]<arr[right]){
             return arr[left];
            }
            else if(arr[left]>arr[mid]) {
               right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return arr[right];
    }
}
class MinimumInRotatedArray {
    public static void main(String[] args) {
         Solution s = new Solution();
         int[] arr = {5,1,2};
        int k= s.search(arr);
        System.out.println(k);
         
    }
   

}
