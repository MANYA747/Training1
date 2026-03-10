package DAY7;
import java.util.Arrays;
public class prefixsum {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6};
        for  (int i=1;i<5;i++){
           arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}