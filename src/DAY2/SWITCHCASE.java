package DAY2;
import java.util.Scanner;
public class SWITCHCASE {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int a;
        System.out.println("enter a number");
        a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");break;
            default:
                System.out.println("invalid nummber");
                break;
        }
    }
}
