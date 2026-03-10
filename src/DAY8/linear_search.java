package DAY8;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 3, 74, 15, 45, 87, 78};
        int index=-1;
        int target =78;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            while(arr[i]==target){
                  found=true;
                  index=i;
                  break;
            }
        }
        if(found){
            System.out.println("target present at :"+index);
        }
        else {
            System.out.println("target not present");
        }

    }
}