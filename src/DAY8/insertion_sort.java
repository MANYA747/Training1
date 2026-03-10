package DAY8;
import java.util.Arrays;
public class insertion_sort {
    static void insertionsort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j;
            for(j=i-1;j>=0&& arr[j]>key;j--)
            {
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,23,45,67,65,77};
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
algorithm
1.1st loop(i) starts from 1
2.store the 1st index as key
3.run nested for loop(j) from i-1 to 0 and insert the higher value to higher index
4.come out of 2nd for loop and assign the key value to j+1
 */
