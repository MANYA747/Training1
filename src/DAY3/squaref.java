package DAY3;
import java.util.Scanner;
public class squaref {
    static int square (int a)
    {
        return a*a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //squaref ob =new squaref();
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(square(n));
    }
}