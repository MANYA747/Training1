package DAY4;//oop practice question 3
class person{
    String name;
    person(String name){
        this.name=name;
    }
    void walk(){
        System.out.println(name+" is walking");
    }
}
class student extends person{
    student(String name){
        super(name);//to call constructor of parent class
    }
    void study(){
        System.out.println(name+" is studying ");
    }
}
class proff extends person{
    proff(String name){
        super(name);//argument should me same as the constructor argument
    }
    void teach(){
        System.out.println(name+" is a proffesor");
    }
}
public class clg {
    public static void main(String[] args) {
        student s=new student("nikhil");
        s.walk();
        s.study();
        proff p=new proff("gcs");
        p.teach();
    }
}
