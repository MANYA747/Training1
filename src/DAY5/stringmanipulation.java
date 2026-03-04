package DAY5;

public class stringmanipulation {
    public static void main(String[] args) {
        String str1="Rocky";
        String str2="Rocky";
        String str3="adhira";
        //equals()
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        //using compareTo()
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str3));
        /*
        comapreTo(string1,string 2)->it returns the difference between the ASCII code of string1 and string 2
        string1-string2;
        "car".compareTo("car")
        c=c
        a=a
        r(114)-t(116)=-2
         */
    }
}
