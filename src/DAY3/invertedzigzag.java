package DAY3;
import java.util.Scanner;
public class invertedzigzag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numb er of columns");
        int c=sc.nextInt();
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=c;j++){
                if((i==1&&j%4==1) || (i==2&&j%2==0) ||(i==3&&j%4==3))
                {
                    System.out.print(" *  ");
                }
                else{
                    System.out.print("    ");
                }

            }
            System.out.println("    ");
        }


    }


}
