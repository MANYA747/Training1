package DAY8;
//slidingwindow_2
public class maxsum_subarray {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,3,4,6};
        int k=3;
        int ms=arr[0];
        int sum=0;
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        ms=Math.max(ms,sum);
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            ms=Math.max(ms,sum);
        }

        System.out.println(ms);
    }
}
