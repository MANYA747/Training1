package DAY7;
import java.io.*;//used in file handlng
public class multilevelducking
//ducking ->throwing an exception back to the caller without handling is known as ducking;
{
    static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
        System.out.println("files opened sucessfully");
    }

    static void processFile()  throws IOException{
        readFile();
    }

    static void handlefile() throws IOException//written inside method signature that this might give an exception helps  if throw block is forgotten
    {
        processFile();
    }

    public static void main(String[] args) {
        try {
            handlefile();
        }
        catch(Exception e){
            System.out.println("caught:"+e.getMessage());
        }
        finally{
            System.out.println("program executed");
        }
    }
}



