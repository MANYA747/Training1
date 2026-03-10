package DAY8;

public class sliding_window {
    public static void main(String[] args) {
        int [] arr={1,2,5,7,3,4,6};
        int target=13;
        int k=3;//window size
        int ws=0;
        boolean found=false;
        for(int i=0;i<k;i++){
            ws+=arr[i];
        }
        if (ws==target){
            found=true;
        }
        for(int i=k;i<arr.length;i++){
            ws+=arr[i]-arr[i-k];
        }
        if(ws==target){
            found=true;
        }
        if(found){
            System.out.println("sub array exists");
        }
        else{
            System.out.println("sub array not present");
        }
    }
}
