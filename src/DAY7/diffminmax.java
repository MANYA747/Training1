package DAY7;

import java.util.Scanner;

public class diffminmax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter th length of an array ");
        int n= sc.nextInt();
        int [] arr=new int [n];
        System.out.println("enter the elments");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //minimum
//        int min=arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("Minimum element:"+min);
//        //maximum array
//        int max=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Maximum element is :"+max);
//        System.out.println("Difference between maximum and minimum element is:"+(max-min));
          int max=arr[0];
          int min=arr[0];
          for(int i=1;i<n;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
              if(arr[i]<min) {
                  min=arr[i];
              }
          }
        System.out.println("Diferenece:"+(max-min));
    }
}
