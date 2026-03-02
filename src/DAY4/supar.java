package DAY4;
class apple{
    String brand="Apple";
    apple(){
        System.out.println("apple constructor called");
    }
    void showbrand(){
        System.out.println("brand:"+brand);
    }
}
class iphone extends apple{
    String Brand="IPHONE 17";
    iphone(){
        super();//calling parent class constructor in child class
        System.out.println("iphone construcor gets called");
    }
    void display(){
        System.out.println(Brand);
        System.out.println("company:"+super.brand);//super.brand is used to when we need access to instance variable of parent class
        super.showbrand();//calling parent class method
    }
}
public class supar {
    public static void main(String[] args) {
        iphone i=new iphone();
        i.display();
    }
}
/* super keyword is used
1. to call parent class constructor
2.to call parent class instance variable
3. to call parent class method
 */
