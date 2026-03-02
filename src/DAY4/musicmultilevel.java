package DAY4;
class songs{
    void display(){
        System.out.println("multi language");
    }
}
class ipop extends songs {
    void display1() {
        System.out.println("hindi");
    }
}
class arijith extends ipop {
    void display2() {
        System.out.println("bollywood");
    }
}
public class musicmultilevel {
    public static void main(String[] args) {
        arijith m=new arijith();
        m.display();
        m.display1();
        m.display2();
    }
}
