/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Nitin
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {
        try {
           /* String e = "Ntin sharmra";
            byte[] buf = e.getBytes();
            OutputStream fo = new FileOutputStream("Nti.txt");
            fo.write(buf);
            fo.close();*/
            InputStream ff = new FileInputStream("Nti.txt");
            BufferedInputStream f = new BufferedInputStream (ff);
do{
            System.out.print( (char) f.read());
  }while(f.available()!=0);
} catch (IOException ex) {
            System.out.println("Nitidfsldfs");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
