package DAY7;
import java.util.Arrays;
public class partition {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 3, 8, 10};
        int n = arr.length;
        int j = n - 1;
        int k = 0;
        int[] arrnz = new int[n];
        while (k < j) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    arrnz[k] = arr[i];
                    k++;
                } else {
                    arrnz[j] = arr[i];
                    j--;
                }
            }
            System.out.println(Arrays.toString(arrnz));
        }
    }
}