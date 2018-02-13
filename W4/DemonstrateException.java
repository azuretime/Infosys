package W4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemonstrateException {
    public static void main (String[] args) {
        System.out.println("In DemoExceptions");
        try {
            /*File file = new File("e:\\ubunturef.pdf");
            FileReader fr = new FileReader(file);*/
            checkEx();
        }//Exception handler. does not mean file does not exist
        catch (FileNotFoundException ex){
            System.out.println("File mot found.");
            System.out.println(ex);
        }
        finally {
            System.out.println("In finally");
        }
        System.out.println("Program continues here.");
    }

    public static void checkEx() throws FileNotFoundException{
        File file = new File("e:\\geg.pdf");
        FileReader fr = new FileReader(file);

    }
}

