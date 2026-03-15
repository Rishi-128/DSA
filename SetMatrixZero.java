public class SetMatrixZero {

    public static void brite_force(int[][] arr,int row, int col){
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==0){
                    for(int c=0;c<3;c++){
                        arr[c][j] =-1;
                        arr[i][c] =-1;
                    }
    }
}
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==-1)
                arr[i][j] =0;
                System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
    }
    public static void better(int[][] arr,int n,int m){
         boolean[] rowZero = new boolean[3];
        boolean[] colZero = new boolean[3];

        // First pass: record which rows and columns need to be zeroed
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        // Second pass: zero out rows and columns
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(rowZero[i] || colZero[j]){
                    arr[i][j] = 0;
                }
            }
        }

        // Print the result
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,0,6},{7,8,9}};
        // int l=0;
        // int k=0;
       
        brite_force(arr, 3,3);
        better(arr,3,3);
    }
}
