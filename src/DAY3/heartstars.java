package DAY3;

public class heartstars {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=15;j++){
                if((i==1 && j%2==0) ||(i==2&& j%2==1) ||(i==3&&j%2==0)||(i==4&&j%4==3)){
                    System.out.print("*");
                }
                System.out.print("  ");
            }
            System.out.println("  ");
        }
    }
}
