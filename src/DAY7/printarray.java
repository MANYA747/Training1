package DAY7;
import java.util.Scanner;
public class printarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr= new int[5];
        System.out.println("enter the elemnts");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i] +", ");
        }
    }
}