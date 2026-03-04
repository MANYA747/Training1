package DAY6;

public class checkuncheck {
    public static void main(String[] args) {
        System.out.println("checked/compile time exception");

        System.out.println("FileNotFoundException");
        System.out.println("IOException");
        System.out.println("SQLException");
        System.out.println("ClassNotFoundException");
        System.out.println("InterruptedException");
        System.out.println("InstantiationException");//trying to create object of abstract class
        System.out.println("NoSuchMethodException");
        System.out.println("NoSuchFiledException");
        System.out.println("ParseException"); //when using buffer to take input

        System.out.println("unchecked /run time exception");
        System.out.println("ArithmeticException");
        System.out.println("NullPointerException");//when object is not having a reference
        System.out.println("ArrayIndexOutOfBoundException");
        System.out.println("StringIndexOutOfBoundException");
        System.out.println("NumberFormatException");
        System.out.println("IllegalArgumentsException");
        System.out.println("IllegalStateException");//
        System.out.println("ClassCastException");//type casting
    }
}
