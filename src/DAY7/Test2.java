package DAY7;
//island of isolaion  -> when we have multiple objects take one instance variable  and make it point to all the objects
public class Test2 {
    Test2 ref;//instance variable
    public static void main(String[] args) {
        Test2 t1= new Test2();
        Test2 t2= new Test2();
        System.out.println(t1+" "+t2);

        t1.ref=t2;
        t2.ref=t1;
        System.out.println(t1.ref);
        System.out.println(t2.ref);
        t1= null;
        t2= null;

    }
}
