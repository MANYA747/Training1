package DAY6;
public class libdemo {
    static class GC extends Exception{
        GC(String message){
            super(message);
        }
    }
    static void checkattendence(boolean absent)throws GC{
        if(absent) throw new GC("penalty for absence");
        else{
            System.out.println("good students");
        }
    }
    public static void main(String[] args) {
        try{
            checkattendence(true);
        }
        catch(GC e){
            System.out.println("caught an exception:"+e.getMessage());
        }
        finally{
            System.out.println("don't join SNPSU");
        }
    }
}
