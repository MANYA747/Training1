package DAY1;
import java.util.Scanner;
public class armstrong
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter  a number");
        int n= sc.nextInt();
        int org1=n;
        int org=n;
        int c=0;
        while(n>0){
            n/=10;
            c ++;
        }
        double sum=0;
        while(org>0)
        {
            int r=org%10;
            sum=sum+Math.pow(r,c);
            org/=10;
        }

        if(org1==sum)
        System.out.println("armstrong");
        else System.out.println("not armstrong");
    }
}
