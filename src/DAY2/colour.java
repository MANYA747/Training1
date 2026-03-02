package DAY2;
import java.util.Scanner;
public class colour {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        char ch;
        System.out.println("enter a character in lower case");
        ch=sc.next().charAt(0);
        switch (ch) {
            case 'v' -> System.out.println("violet");
            case 'i' -> System.out.println("indigo");
            case 'b' -> System.out.println("blue");
            case 'g' -> System.out.println("green");
            case 'y' -> System.out.println("yellow");
            case 'o' -> System.out.println("orange");
            case 'r' -> System.out.println("red");
            default -> System.out.println("invalid choice");
        }
    }
}
