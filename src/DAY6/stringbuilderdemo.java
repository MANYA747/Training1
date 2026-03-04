package DAY6;
import java.util.Scanner;
public class stringbuilderdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        //1.append->adds at the last
        sb.append(" alien force");
        System.out.println("apennd method: "+sb);
        //2.insert(index number,value)->adds value at specific index
        sb.insert(0,"hi ");
        System.out.println("insert method:"+sb);
        //3.delete(string index,ending index)
        sb.delete(1,6);
        System.out.println(sb);
        //4.replace(starting index,ending value ,value)
        sb.replace(6,11,"ultimate alien");
        System.out.println(sb);
        //5.reverse()
        sb.reverse();
        System.out.println(sb);

    }
}
