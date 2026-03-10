package DAY7;
import java.util.Arrays;
public class reversearray {
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int arr1[] =new int[5];
        int j=0;
        for(int i=4;i>=0;i--)
        {
            arr1[j]= arr[i];
            System.out.print(arr1[j]+"  ");
            j++;
        }
    }
}
