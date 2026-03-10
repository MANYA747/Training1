package DAY7;

public class summarray {
    public static void main(String[] args) {
        int [] arr={1,3,2,4,5};
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
