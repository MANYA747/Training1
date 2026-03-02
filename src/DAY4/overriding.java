package DAY4;
class vehicle{

    void run(){
        System.out.println("vehicle is running");
    }
}
class bus extends vehicle{
    @Override//overrides parent class method,to show overriding
    void run(){
        System.out.println("bus is running ");
    }
}

public class overriding {
    public static void main(String[] args) {
        vehicle ob=new bus();//child class object is created with ref of parent class
        ob.run();

    }
}
