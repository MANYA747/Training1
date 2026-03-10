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
/*
ways of  GC
1.Nullifying the object
2. reassigning the value;
3. inside a block;
4. annonymous object
5.island of isolation

 */
