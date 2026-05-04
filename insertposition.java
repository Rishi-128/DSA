public class insertposition {
    public static void main(String[] args) {
        int[] arr ={1,3};
        int x =3;
        int low =0;
        int pos=-1;
        int high = arr.length-1;
        int mid =-1;
        //int pos;
        while(low<=high){
            
            mid= (low+high)/2;
            if(arr[mid]==x){
                pos=mid;
                break;
            }
            if(x<arr[mid]){
                if(arr[low]<x){
                    pos=mid;
                    low++;
                    high = mid-1;
                }
                else{
                    pos=low;
                    break;
                }
            }
             if(x>arr[mid]){
                if(arr[high]>x){
                    pos=mid+1;
                    high--;
                    low=mid+1;
                }
                else{
                    if(x==arr[high])
                    pos=high;
                    else
                    pos=high+1;
                    break;
                }
            }
        } 
        System.out.println(pos);
    }
}
