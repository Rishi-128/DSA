public class LowerBound {
    public static void upperbound(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ub = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            // if(arr[mid]==x){
            //     lb = mid;
            //     break;
            // }
            if(arr[mid]<=x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
                ub = mid;
            }
        }
        System.out.println(ub);
    }
    public static void lowerbound(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        int lb = arr.length;
        while(low<=high){
            int mid = (low+high)/2;
            // if(arr[mid]==x){
            //     lb = mid;
            //     break;
            // }
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>=x){
                high = mid-1;
                lb = mid;
            }
        }
        System.out.println(lb);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};
        int x = 9;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x){
                System.out.println(i);
                break;
            }
        }
        lowerbound(arr, x);
        upperbound(arr, x);
    }

}
