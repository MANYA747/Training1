package DAY2;
import java.util.Scanner;
public class CALCI
{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a,b;
        char ch;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter a character");
        ch=sc.next().charAt(0);
        switch (ch) {
/*
            case '+' -> {
                int sum = a + b;
                System.out.println(sum);
            }
            case '-' -> {
                int diff = a - b;
                System.out.println(diff);
            }
            case '*' -> {
                int pro = a * b;
                System.out.println(pro);
            }
            case '/' -> {
                int quo = a / b;
                System.out.println(quo);
            }
*/
            case '+': System.out.println(a+b);break;
            case '-': System.out.println(a-b);break;
            case '*': System.out.println(a*b);break;
            case '/': System.out.println(a/b);break;
            default : System.out.println("invalid choice");
        }
    }
}
