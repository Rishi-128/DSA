public class Sort {
    public static void main(String[] args) {
        int c =0;
        int[] arr= {1,5,2,3,4,5,6,6,7,7,7,8};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                c =1;
        }
        if(c==1)
            System.out.println("not sorted");
        else
             System.out.println(" sorted");
    }
}
