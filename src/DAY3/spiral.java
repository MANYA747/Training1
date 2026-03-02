package DAY3;
import java.util.Scanner;
public class spiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;

//        while (top <= bottom && left <= right) {
//
//            // Left → Right
//            for (int i = left; i <= right; i++) {
//                matrix[top][i] = num++;
//            }
//            top++;
//
//            // Top → Bottom
//            for (int i = top; i <= bottom; i++) {
//                matrix[i][right] = num++;
//            }
//            right--;
//
//            // Right → Left
//            if (top <= bottom) {
//                for (int i = right; i >= left; i--) {
//                    matrix[bottom][i] = num++;
//                }
//                bottom--;
//            }
//
//            // Bottom → Top
//            if (left <= right) {
//                for (int i = bottom; i >= top; i--) {
//                    matrix[i][left] = num++;
//                }
//                left++;
//            }
//        }
//
//        // Print the matrix
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
       while(top<=bottom && left<=right){
           for(int i=left;i<=right;i++){
               matrix[top][i]=num++;
           }
           top++;
           for(int i =top;i<=bottom;i++){
               matrix[i][right]=num++;
           }
           right --;
           if(top<=bottom) {
               for (int i = right; i >= left; i--) {
                   matrix[bottom][i] = num++;
               }
               bottom--;
           }
           if(left<=right){
               for(int i=bottom;i>=top;i--){
                   matrix[i][left]=num++;
               }
               left++;


           }


       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(matrix[i][j]+"\t");
           }
           System.out.println();
       }
    }
}


