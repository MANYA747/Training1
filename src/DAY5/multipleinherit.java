package DAY5;
//example of multiple inheritance
//multiple inheritance :two parent class one child class
//it is not possible in inheritance so interface is used
interface jobs{
    void role();
}
interface pay{
    void freedom();
}
class humans implements jobs,pay{
    @Override
    public void role(){
        System.out.println("humans work in different roles");
    }
    @Override
    public void freedom(){
        System.out.println("humans have freedom");
    }

}
public class multipleinherit {
    public static void main(String[] args) {
        humans c=new humans();
        c.role();
        c.freedom();

    }
}
