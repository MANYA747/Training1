package DAY3;
public class tribonacci
{
    static void tri(int n){
        int a=0,b=1,c=2,d=0;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
    public static void main(String[] args) {
        int n=15;
        tri(n);
    }
}
