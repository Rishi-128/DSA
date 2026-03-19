public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9,11,16,29};
        int low =0;
        int high = arr.length -1;
        int ele = 7;
        int k=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==ele){
                k=mid;
            break;
        }
        else if(arr[mid]<ele){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
        }
        if(k>=0)
            System.out.println(k+1);
        else
            System.out.println(k);
    }
}
