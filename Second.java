public class Second {
    public static void main(String[] args) {
        int[] arr = { 100, 8, 2, 1, 3, 4, 6, 8, 9, 11 };
        int l = arr[0];
        int sl = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            }
            else if(arr[i]<l && arr[i] > sl){
            sl = arr[i];
            }

        }
        if(sl!=-1)
        System.out.println(l + " " + sl);
        else
            System.out.println(" No second largest element");
    }
}
