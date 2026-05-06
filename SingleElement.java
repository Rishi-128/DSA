public class SingleElement {
     public static void Solution2(int[] arr){
        int len = arr.length;
        System.out.println(len);
         int ptr1=0, ptr2=1, ptr3=len-2,ptr4=len-1;
         while((ptr1!=arr.length-1) && (ptr4>=0)){
            System.out.println("hello");
            if(arr[ptr1] != arr[ptr2]){
                    System.out.println(arr[ptr1]);
                    break;
                }
            if(arr[ptr3] != arr[ptr4])
                {
                    System.out.println(arr[ptr3]);
                    break;
                }
                ptr1+=2;
                ptr2+=2;
                ptr3-=2;
                ptr4-=2;
         }
     }
    public static void Solution1(int[] arr){
         int ptr1=0, ptr2=1;
            while(ptr1!=arr.length-1){
                 System.out.println("hello");
                if(arr[ptr1] != arr[ptr2]){
                    System.out.println(arr[ptr1]);
                    break;
                }
                ptr1+=2;
                ptr2+=2;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,3,4,5,5,6,6};
           Solution1(arr);
    }
}
