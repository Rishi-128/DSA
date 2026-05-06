import java.math.*;
class Solution{
    public int root(int n, int k)
    {
        if(n==1) return 1;
        if(n<8) return -1;
        int low = 0; 
        int high = n/k;
        int p,mid;
        while(low<=high){
            mid = (low+high)/2;
            p = (int)Math.pow(mid,k);
            if(p==n) return mid;
            else if(p>n) high = mid-1;
            else low=mid+1; 
        }
        return -1;
    }
}
public class NthRoot {
    
    public static void main(String[] args) {
        Solution obj = new Solution();

       int k = obj.root(32, 5);
       System.out.println(k);
        
    }
}
