package I_O;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream {


    public static void main(String[] args) {
        String path = "E:\\idea\\JavaRevive\\document\\abc.txt";

        try{
            File f = new File(path);
            System.out.println(f.exists());

            FileInputStream fout = new FileInputStream(f);
            byte[] b = new byte[(int)f.length()];
            //.read();
            fout.read(b);
            for (byte b1:b
                 ) {
                System.out.print(b1 + " ");
            }
                fout.close();
        }

        catch (IOException e){
            e.getMessage();
        }

    }

}
