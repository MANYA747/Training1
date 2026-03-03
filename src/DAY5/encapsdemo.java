package DAY5;
//if constructor are used in encapsulation it should be declared as publlic class becz member variables are declared as private
class students{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setage(int age){
        if(age>0) {
            this.age = age;
        }
        else {
            System.out.println("invalid age");
        }
    }
    public int getage(){
        return age;
    }
}
public class encapsdemo {
    public static void main(String[] args) {
        students st=new students();//whenever a object is created,default constructor gets called but here we are not using it;
        st.setName("Mark");
        st.setage(20);
        System.out.println("Name:"+st.getName());
        System.out.println("Age:"+st.getage());
    }
}
