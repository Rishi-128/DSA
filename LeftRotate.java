public class LeftRotate {
    public static void Left_Rotate(int[] arr, int n, int rotate) {
        rotate = rotate%n;
        int[] temp = new int[rotate];
       for(int i=0;i<rotate;i++){
        temp[i] = arr[i];
       }
       for(int i=rotate;i<n;i++){
        arr[i - rotate] = arr[i];
       }
       for(int i=n-rotate;i<n;i++){
       arr[i] = temp[i-(n-rotate)];
       }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverse(int[] arr, int first , int last){
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void rotate(int[] arr,int n,int rotate){
        reverse(arr,0,rotate-1);
          
         reverse(arr,rotate,n-1);
        //   for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        reverse(arr,0,n-1);
          for (int i : arr) {
            System.out.print(i + " ");
        }
        //  for (int i : arr) {
        //     System.out.print(i + " ");
        // }
    }
    public static void Right_Rotate(int[] arr, int n, int rotate) {

        for (int i = n - 1; i >= rotate; i--) {
            int t = arr[i];
            arr[i] = arr[i - rotate];
            arr[i - rotate] = t;

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rotate = 3;
      //  Left_Rotate(arr, arr.length, rotate);
        // Right_Rotate(arr, arr.length, rotate);
        rotate(arr,arr.length,rotate);
    }
}
