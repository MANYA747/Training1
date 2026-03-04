package DAY6;
public class throwinblock {
    public static void main(String[] args) {
        try{
            System.out.println("inside try block");
            throw new ArithmeticException("exception from try ");
        }
        catch(ArithmeticException e){
            System.out.println("exception caught:"+e.getMessage());
            throw new NullPointerException("EXCEPTION FROM CATCH BLOCK");
        }
        finally{
            System.out.println("inside finally block");
            throw new IllegalStateException("exception from finally");//if exception is thrown from finally
        }
    }
}
