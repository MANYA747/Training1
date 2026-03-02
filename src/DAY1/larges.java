package DAY1;
import java.util.Scanner;
public class larges {
    public static void main(String[] args)
    {
        Scanner sc  =new Scanner (System.in);
        int a,b,c;
        System.out.println("enter the number a:");
        a=sc.nextInt();
        System.out.println("enter the number b:");
        b=sc.nextInt();
        System.out.println("enter the number c");
        c=sc.nextInt();


        if(a>b){
            if(a>c){
                System.out.println(a);
            }
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}