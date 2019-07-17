package I_O;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class TestFile {

    long max;
    long min;


    public static void main(String[] args) {
       String path = "E:\\idea\\JavaRevive\\document\\test\\lol2.txt";
       try{
           File f = new File(path);
           f.getParentFile().mkdirs();
           FileOutputStream fos = new FileOutputStream(f);
            byte[] v = {88,89};
            fos.write(v);
            fos.close();
           System.out.println("OK");
       }
       catch (IOException e){
            e.getMessage();

       }


//        File f = new File(path);
//        System.out.println(f);
//        System.out.println(f.exists());
//        String []  aa = f.list();
//        System.out.println(aa);
    }
}
