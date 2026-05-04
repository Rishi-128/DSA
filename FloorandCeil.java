public class FloorandCeil {
    public static void main(String[] args) {
        int floor=0;
        int ceil=0;
        int[] arr ={1,2,3,4,5,6,7};
        int x = 5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                floor = ceil = x;
                break;
            }
            else if(arr[i]<x){
                floor = arr[i];
            }
            else{
                ceil = arr[i];
                break;
            }
        }
        System.out.println(floor+" "+ceil);
    }
}
