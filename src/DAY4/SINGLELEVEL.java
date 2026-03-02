package DAY4;
class parent{
    void display(){
        System.out.println("parent class");
    }
}
class child extends parent
{
    void display1()
    {
        System.out.println("child class");
    }
}

public class SINGLELEVEL {
    public static void main(String[] args) {
        child c=new child();
        c.display();
        c.display1();

    }
}
