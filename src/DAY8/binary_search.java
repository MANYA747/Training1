package DAY8;
public class binary_search
{
    public static void main(String[] args)
    {
        int target = 8;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mid = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low < high)
        {
            mid = high+((low-high) / 2);//mid=low+(high-low)/2;
            if(target ==arr[mid]){
                break;
            }
           else if (target >= arr[mid])
           {
                low = mid+1;
           }
           else if (target <= arr[mid])
           {
                high = mid-1;
           }
        }
        System.out.println("target found at:" + mid);
    }
}