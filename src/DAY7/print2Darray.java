package DAY7;
import java.util.Scanner;
public class print2Darray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length");
        int n= sc.nextInt();
        int [] [] arr =new int [n][n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the elements are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +"   ");
            }
            System.out.println();
        }
    }
}
