package DAY4;
class human{
    void eat(){
        System.out.println("humans like panipuri");
    }
}
class shaktiman extends human{
    void saveworld(){
        System.out.println("saving the world");
    }
}
class earn extends human {
    void money(){
        System.out.println("human works in office" +
                " ");
    }
}
public class heirarchial {
    public static void main(String[] args) {
        shaktiman ob=new shaktiman();
        ob.eat();
        ob.saveworld();
        earn ob1 =new earn();
        ob1.money();
    }
}
