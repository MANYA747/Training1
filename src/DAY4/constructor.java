package DAY4;

public class constructor {
    String name;
    constructor(){
        this("captain america");//to invoke paramaterized in default
        System.out.println("default constructor gets called");
    }
    constructor(String name){
       //this();//to invoke default to parameterized
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        constructor c1=new constructor();
        c1.display();
    }
}
