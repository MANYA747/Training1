package DAY5;
interface animal{
    void sound();
    default void wild(){
        System.out.println("animals bite");
    }
}
class cat implements animal{
    @Override
    public void sound()
    {
        System.out.println("meow");
    }
}
public class interfacedemo {
    public static void main(String[] args) {
       // cat c=new cat(); if interface has only abstract method
        animal c=new cat();
        c.sound();
        c.wild();
    }
}
//comstructors are allowed in abstract but not in interface
//to derive a class in abstract class "extends "is used and implements is used in interface.