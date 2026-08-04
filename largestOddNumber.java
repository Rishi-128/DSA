public class largestOddNumber {
    public static void main(String args[]){
        String num = "75423511612121222222221";
        // String s = num.substring(1,3);
        System.out.println(num);
        long max = 0;
        // int n = Integer.parseInt(s);
        // System.out.println(s);
        // System.out.println(n%2==0);
        // int i =0;
        // int j =1;
       int len = num.length();
    //     for(int i=0;i<len;i++){
    //         for(int j=i+1;j<=len;j++){
    //         long int_num = Long.parseLong(num.substring(i,j));
    //         if(int_num%2!=0){
    //             if(int_num>max)
    //                 max = int_num;
    //         }
    //     }
    // }
    while(len>0){
        // char ch = num.charAt(len-1);
        if((num.charAt(len-1))%2!=0){
            System.out.println(num.substring(0,len));
            break;
        }
        else
            len--;
    }
    // if(max == 0)
    // System.out.println("");
    // else
    //     System.out.println(String.valueOf(max));
    // }
}
}
