package DAY4;
class car{
    void display(){
        System.out.println("parent class:car");
}
}
class tata extends car{
    void display1(){
        System.out.println("company name:tata");
    }
}
class curvy extends tata{
    void display2(){
        System.out.println(
                "model name:curvy"
        );
    }
}
public class multilevel {
    public static void main(String[] args) {
        curvy c=new curvy();//create the object of last class
        c.display();
        c.display1();
        c.display2();
    }
}
