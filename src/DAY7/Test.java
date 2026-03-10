package DAY7;
//object created inside a method locally
public class Test
{
   static  void display()
   {
        Test t= new Test();
        System.out.println(t);
   }
    public static void main(String[] args) {
        System.out.println("output");
        display();
        //System.out.println(t);
        Test t= new Test();
        System.out.println(t);
        display();
//case 4 anonymous object
        //created a object in heap memory but not stored the address in stack memory
        new Test();

    }
}
