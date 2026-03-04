package DAY6;
class mythread1 extends Thread{
    public void run(){
        try{
            System.out.println("sleeping");
             Thread.sleep(10000);//
            System.out.println("awake");
        }
        catch(Exception e){

        }
    }
}
public class waiting_blocked {
    public static void main(String[] args) {
        mythread1 t2 = new mythread1();
        t2.start();

    }
}
