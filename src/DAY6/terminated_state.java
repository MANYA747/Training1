package DAY6;
class mythread2 extends Thread{
    public void run(){
        System.out.println("thread finished");
    }
}

public class terminated_state {
    public static void main(String[] args) {
        mythread2 t3= new mythread2();
        t3.start();
        try{
            t3.join();
        } catch (InterruptedException e) {

        }

        System.out.println("state:"+t3.getState());

    }
}
