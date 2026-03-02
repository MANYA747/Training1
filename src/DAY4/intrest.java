package DAY4;
class bank{
    int getintrestrate(){
        int r=11;
        return r;
    }
}
class savingbank extends bank{
    @Override
    int getintrestrate()
    {
        int r1=5;
        return r1;
    }
}
public class intrest {
    public static void main(String[] args) {
        bank ob=new savingbank();
        System.out.println(ob.getintrestrate()+"%");
    }
}


