package DAY4;

public class avengers {
    String name;
    avengers(String name){
        this.name=name;
    }

    void display(){
        System.out.println("iron man:"+name);
    }

    public static void main(String[] args) {
        avengers a1=new avengers("tony shark");

        a1.display();
    }

}
