package DAY8;
import java.util.Arrays;
public class partition_using_swap {
    public static void main(String[] args) {
        int [] arr={3,8,5,10,7,12};
        int right =arr.length-1;
        int left=0;
        while(left<right){
            while(arr[left]%2==0){
             left++;
            }
            while(arr[right]%2!=0){
                right--;
            }
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
