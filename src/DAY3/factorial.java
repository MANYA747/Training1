package DAY3;
import java.util.Scanner;
public class factorial {
    int fact(int n){
        int p=1;
        for(int i=1;i<=n;i++){
             p=p*i;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        factorial ob =new factorial();
        System.out.println(ob.fact(n));
    }
}
