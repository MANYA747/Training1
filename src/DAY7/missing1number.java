package DAY7;
import java.util.Arrays;
public class missing1number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 8, 9};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i - 1] + 1;
                System.out.println("Miisng number :"+arr[i]);
            }
        }
        //System.out.println(Arrays.toString(arr));
    }
}