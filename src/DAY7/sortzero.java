package DAY7;
import java.util.Arrays;
public class sortzero {
    public static void main(String[] args) {
        int [] arr={1,0,5,0,3,0,7};
        int n=arr.length;
        int [] arrz=new int [n];
        int [] arrnz=new int [n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
              arrnz[j]=arr[i];
              j++;
            }
        }
        System.out.println(Arrays.toString(arrnz));
    }
}
