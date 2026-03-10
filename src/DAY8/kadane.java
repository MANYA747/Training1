package DAY8;

public class kadane {
    public static void main(String[] args) {
        int [] arr={-1,-8,5,6,4,8,9,15};
        int cs=arr[0];
        int ms=arr[0];
        for(int i=1;i<arr.length;i++){
            cs=Math.max(arr[i],cs+arr[i]);
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }
}
