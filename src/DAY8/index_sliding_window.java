package DAY8;

import java.util.Arrays;

public class index_sliding_window {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 7, 3, 4, 6};
        int target = 13;
        int k = 3;//window size
        int ws = 0;
        boolean found = false;


        for(int i=0;i<k;i++){
            ws+=arr[i];
            if(ws==target){
                found=true;
                while(found){
                    System.out.println(ws);
                    int [] res={i-2,i};
                    System.out.println(Arrays.toString(res));
                    break;
                }
            }
        }
        for (int i = k; i < arr.length; i++) {
            ws += arr[i] - arr[i - k];
            if(ws==target){
                found=true;
                while(found){
                    int [] res={i,i-1,i-2};
                    System.out.println(Arrays.toString(res));
                    break;
                }
            }
        }

    }
}
