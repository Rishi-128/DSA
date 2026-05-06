public class PeakElement {
    public static int Solution(int[] arr,int n){
       int low = 1;
       int high = n-2;
       if(n==1) return 0;
       if(arr[0]>arr[1]) return 0;
       if(arr[high]<arr[high+1]) return high+1;
          
        while(low<high){
            int mid = (low+high)/2;
            if((arr[mid-1]<arr[mid]) && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
          }
          return low;
    }
    public static void main(String args[]){
        int[] arr = {1,2,6,5,4,3,2};
       int k= Solution(arr,arr.length);
       System.out.println(k);
    }
}
