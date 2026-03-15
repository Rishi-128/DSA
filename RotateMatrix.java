public class RotateMatrix {
    public static void brute(int[][] arr,int rows,int cols){
        int [][] arr1 = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[j][rows-1-i] = arr[i][j];
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] optimal(int[][] arr,int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                if(i==j){
                    continue;
                }
                else{
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }

            }
        }
           
        int k=0;
        int ptr1=0;
        int ptr2=cols-1;
        int i=0;
        while(i<cols){
            if(ptr1>=ptr2){
                ptr1=0;
                ptr2=cols-1;
                i++;
            }
            else{
             int temp = arr[i][ptr1];
                    arr[i][ptr1] = arr[i][ptr2];
                    arr[i][ptr2] = temp;
                    ptr1++; 
                    ptr2--;
                   // i++;
            }
        }
         return arr;
       

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{10,11,12,13}};
        int rows = arr.length;
        int cols=arr[0].length;
      // brute(arr, rows, cols);
        arr = optimal(arr, rows, cols);
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
