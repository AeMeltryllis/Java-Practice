package I_O;

import java.io.*;

public class encode {

    public static void encodeFile(File encodingFile, File encodedFile){
        try(FileReader fr = new FileReader(encodedFile)) {
            char[] all = new char[(int)encodedFile.length()];
            fr.read(all);
            for (int i = 0; i <all.length ; i++) {
//                if (  ) all[i] = 0;


            }

        }
        catch (IOException e){
            e.getMessage();
        }

    }

}
