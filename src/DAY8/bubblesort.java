package DAY8;
//time complexity O(n^2)
//space complexity is O(1)->only one variable
import java.util.Arrays;
public class bubblesort {
    static void Bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){//length-i-1 ->in each iteration the last element is excluded
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int []arr ={77,18,45,63,17,10};
        System.out.println(Arrays.toString(arr));
        Bubblesort(arr);
    }
}
