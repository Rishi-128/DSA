public class TwoSum {
    public static int[] brute_fore(int[] arr,int n,int target){
        int[] a = new int[2];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                sum = arr[i] +arr[j];
                if(sum==target){
                    a[0] = i;
                    a[1] =j;

                    return a;
                }
            }
        }
        return a;
    }
    // public static int[] optimal(int[] arr,int n,int target){
        
    // }
    public static void main(String[] args) {
        int[] arr = {9,1,5,8,11,2};
        int target = 12;
        int[] arr1 = brute_fore(arr, arr.length, target);
        System.out.println(arr1[0] +" " + arr1[1]);
    }
}
