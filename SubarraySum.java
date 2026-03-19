class Solution{
    public int brute(int[] arr,int k){
        int sum;
        int count=0;;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                System.out.println(sum);
                if(sum==k){
                    count++;
                    
                }
                // if(sum>k){
                //     break;
                // }
            }
        }
        return count;
    }
}


public class SubarraySum {
    public static void main(String[] args) {
        
    Solution s = new Solution();
    
    int[] arr ={1,-1,0};
    int k=0;
    System.out.println(s.brute(arr,k));
    }

}
