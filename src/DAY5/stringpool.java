package DAY5;
//==and.equals()
public class stringpool {
    public static void main(String[] args) {
        String s1="RCB";//stored string pool memory
        String s2="RCB";
        String s3=new String("RCB");//stored in heap memory
        String s4=new String("RCB");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        /*
        == compares the stored address
        .equals() compares values
         */
        //intern()
        String s5=s3.intern();
        System.out.println(s1==s5);
        /*
        intern->forces the variable stored in heap memory to be moved to string pool
         */
    }

}
