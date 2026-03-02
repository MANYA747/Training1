package DAY2;
import java.util.Scanner;

public class vowelsorconsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("enter a character");
        ch=sc.next().charAt(0);
        char c=Character.toUpperCase(ch);
        switch(ch){

            case 'A', 'E', 'I' ,'O','U':
                System.out.println("the character is a vowel");
                break;
            default:
                System.out.println("the charcter is a consonant");
                break;
        }
    }
}
