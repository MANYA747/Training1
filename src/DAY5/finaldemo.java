package DAY5;
class change{
//    final void run(){
//        System.out.println("running");
//    }
}
class modify extends change
{
   // @Override
    void run(){
        System.out.println("modify running");
    }
}

public class finaldemo {
    public static void main(String[] args) {
        final int A=15;//final variables are written in uppercase
        System.out.println(A);
        //A+=10; FINAL variables can't be updated;
        modify m=new modify();
        m.run();
    }
}
/*final variable->can't be updated
finals method->can't be overridden
final class ->can't be extended
 */