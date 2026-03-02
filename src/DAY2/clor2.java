package DAY2;
import java.util.Scanner;
public class clor2 {
    public static void main(String[] args)
    {
        {
            Scanner sc= new Scanner (System.in);
            char ch;
            System.out.println("enter a character in lower case");
            ch=sc.next().charAt(0);
            String color = " vb he";
            switch (ch) {
                case 'v' -> color= "violet";
                case 'i' -> color="indigo";
                case 'b' -> color="blue";
                case 'g' -> color="green";
                case 'y' -> color="yellow";
                case 'o' -> color="orange";
                case 'r' -> color="red";
                default -> System.out.println("invalid choice");
            }
            System.out.println(color);
        }


    }
}
