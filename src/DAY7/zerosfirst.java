package DAY7;
import java.util.Arrays;
public class zerosfirst {
    public static void main(String[] args) {
        int [] arr={1,0,4,0,0,5,0,7,0};
        int n=arr.length;
        int j=n-1;
        for(int i=n-1;i>0;i--){
            if(arr[i]!=0){
              arr[j]=arr[i];
              j--;
            }
        }
        while(j>=0){
            arr[j]=0;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
