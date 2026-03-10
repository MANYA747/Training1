package DAY7;
import java.util.Scanner;
import java.util.Arrays;
public class rotateby_n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number the rotations :");
        int n=sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        while(n>0) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            n--;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("final array:"+Arrays.toString(arr));
    }
}
