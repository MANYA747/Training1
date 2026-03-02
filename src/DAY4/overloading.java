package DAY4;

class calci{
    void add(){
        int a=10;
        int b=38;
        System.out.println("sum="+(a+b));
    }
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
}
public class overloading {
    public static void main(String[] args) {
        calci c=new calci();
        c.add();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2.3,5.6));
        System.out.println(c.add(4.5f,6.7f));
    }
}
