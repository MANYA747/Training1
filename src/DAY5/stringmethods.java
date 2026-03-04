package DAY5;
import java.util.Scanner;
public class stringmethods {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.nextLine();
        //1.length
        System.out.println("the length of String is:"+str.length());
        //2.touppercase
        System.out.println("Upper case:"+str.toUpperCase());
        //3.lowercase
        System.out.println("Lower Case:"+str.toLowerCase());
        //4.charAt()
        System.out.println("Character at index:"+str.charAt(4));
        //5.substring(begin,end)
        System.out.println("substring:"+str.substring(1,4));
        //6.concat
        String str1="Alice";
        System.out.println("concat using +:"+"hello"+str1);
        System.out.println("concat using function"+str.concat(str1));
        //7.equals()
        System.out.println("Equals:"+str.equals("BEN 10"));
        //8.equalsIgnoreCase()
        System.out.println("Equals ignore method"+str.equalsIgnoreCase("HELLO WORLD"));
        //9.replace(old,new)
        System.out.println("replace method "+str.replace("h","e"));
        //10.trim()
        String tri="  hellooooo   ";
        System.out.println("trim method "+tri.trim());
        //11.startswith()
        System.out.println("starts with method "+str.startsWith("h"));
        //12.endsWith()
        System.out.println("ends with "+str.endsWith("o"));
        //13.indexof()
        System.out.println("indexof method "+str.indexOf('o'));
        //14.compareTo()
        System.out.println("compare method "+str.compareTo("ben 10"));
        //15.split()
        String [] letters=str.split(" ");
        for(String letter:letters){
            System.out.println(letter);
        }
        //16.isletter()
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                System.out.println(c+" is a letter");
            }
            else if(Character.isDigit(c)){
                System.out.println(c+"is a digit");
            }
            else{
                System.out.println(c+"neither a letter nor a digit");
            }
        }
    }
}
