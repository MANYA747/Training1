package DAY7;
//ways of garbage collection
//case 1 for garbage  collection is nullifying reference
public class Test1 {
    public static void main(String[] args) {
        Test1 t1 =new Test1();//creating in heap t1 is in stack and pointing towards the address in heap
        System.out.println(t1);
        t1=null;//reference deleted
        System.out.println(t1);
//case 2 is reassigning reference
        t1= new Test1();//same object reference but reassigned
        System.out.println(t1);

    }

}
