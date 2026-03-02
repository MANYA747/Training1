package DAY1;
import java.util.Scanner;
public class divisible
{
    public static void main(String[] args)
    {
     Scanner sc= new Scanner (System.in) ;
     int a;
     System.out.println("enter the number");
     a=sc.nextInt();
     if(a%3==0 && a%5==0)
     {
         System.out.println("the number is divisible by both 3 and 5");
     }
     else
     {
         System.out.println("the number is not divisible ");
     }
    }
}