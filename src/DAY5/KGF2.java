package DAY5;
//STATIC VARIABLE,METHOD,BLOCK
public class KGF2 {
    static String hero = "ROCKING STAR";
//static block
    static {
        System.out.println("prashant neil");
    }//executed before main method

    static void dialogue() {
        System.out.println("powerful people come from powerful places");
        System.out.println("I am already deathed chinna.....");

    }

    public static void main(String[] args)
    {
        System.out.println("hero name:" + KGF2.hero);
        dialogue();
    }
}
