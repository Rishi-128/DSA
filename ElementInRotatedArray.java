public class ElementInRotatedArray {
    public static int element(int[] arr,int k,int left, int right){
        int pos =-1;
        while(left<=right){
            int mid =  (left+right)/2;
           
            if(arr[mid]==k){
                pos = mid;
                return pos;
            }
            else if(arr[left]==k){
                return left;
            }
            else if(arr[right]==k){
                return right;
            }
            else if(arr[mid]<k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return pos;
    }
   
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4};
        int k = 2;
        int right=arr.length-1;
        int left=0;
        int pos = -1;
        int mid = (left+right)/2;
        if(left==right){
            if(arr[left] == k)
                pos =0;
        }
        else if(arr[left]<arr[right]){
            pos = element(arr, k, left, right);
        }
       else if(k>=arr[left] && k<=arr[mid]){
            pos = element(arr, k, left, mid+1);
        }
        else if (k>=arr[left] && k>arr[mid]){
            pos = element(arr, k, left, mid+1);
        }
        else{
            pos = element(arr, k, mid, right);
        }

        // while(left<=right){
        //     int mid = (left+right)/2;
        //     if(arr[mid]== k){
        //        pos=mid;
        //         break;
        //     }
        //       else if(arr[mid]>arr[right] && arr[right]>=k)
        //     {
        //         left = mid+1;
        //     }
        //     else if(arr[mid]<arr[right] && arr[right]>=k)
        //     {
        //         left = mid+1;
        //     }
        //     else if(arr[mid]<arr[left] && arr[left]<=k)
        //     {
        //         right=mid-1;
        //     }
        //     else if(arr[mid]<k)
        //     {
        //         left=mid+1;
        //     }
        //     else if(arr[mid]>arr[left] && arr[left]<=k)
        //     {
        //         right=mid-1; 
        //     }
           
        //     else if(arr[mid]>k){
        //         right=mid-1;
        //     }
        // }
        System.out.println(pos);

    }
}
