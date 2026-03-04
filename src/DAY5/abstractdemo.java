package DAY5;
 abstract class shape{
    abstract void draw(); //abstract method without a method body
    void area(){//non abstarct method
        System.out.println("Area of a shape");
    }
}
class circle extends shape{ //derived class to intialise the abstract method
     @Override//abstract method is overridden;
     void draw(){//non abstarct method;
         System.out.println("drawing a shape");
     }

}
public class abstractdemo {
    public static void main(String[] args) {
        shape s=new circle(); //object creation of abstract class alone is not allowed;object created for derived class with reference to abstract class
        s.draw();
        s.area();
    }
}
