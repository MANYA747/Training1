package DAY6;
//REQUESTING GARBAGE COLLECTION
public class GCDEMO {
    public static void main(String[] args) {
        GCDEMO c=new GCDEMO();
        c=null;
        System.gc();
        System.out.println("GC requested");
    }
}
