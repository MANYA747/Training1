package DAY4;
class employee{
    private String name;
    private  double salary ;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setsalary(double salary){
        if(salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("invalid salary");
        }
    }
    public double getsalary(){
        return salary;
    }
}
public class encaps {
    public static void main(String[] args) {
        employee emp=new employee();
        emp.setname("peter");
        emp.setsalary(15000);
        System.out.println(emp.getname());
        System.out.println(emp.getsalary());
        emp.setsalary(100000);
        System.out.println(emp.getsalary());


        emp.setsalary(-1000);
        System.out.println(emp.getsalary());
    }
}
