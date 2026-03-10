package DAY7;

import java.util.Scanner;

public class minelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter th length of an array ");
        int n= sc.nextInt();
        int [] arr=new int [n];
        System.out.println("enter the elments");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is:"+min);
    }
}
