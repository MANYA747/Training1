package DAY3;
import java.util.Scanner;
public class fibonacci {
    static void series(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            c = a + b;

            a = b;
            b = c;
        }
    }
        public static void main (String[] args)
        {
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the length of series");
            int n=sc.nextInt();
            series(n);

        }
    }

