package trytry;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class test {

    public static Hero getHero(String filepath){
        File file =new File(filepath);

        Hero h2=null;

        try (FileReader f =new FileReader(file)){

            char[] content = new char[(int)file.length()];
            f.read(content);
            String classname = new String(content);
            try {
                Class c =Class.forName(classname);
                Constructor cc =c.getConstructor();
                /**
                 * 这里为什么要强制转型
                 */
                 h2 =(Hero) cc.newInstance();
                h2.name ="反射类";
                System.out.println(h2+h2.name);


            } catch (Exception e) {
                e.printStackTrace();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return h2;

    }
    //"E:\\idea\\JavaRevive\\reflect\\file\\hero.config"
    public static void main(String[] args) {
        Hero h3;
        Hero h4 =new Hero();
//        try {
//            h3= getHero("E:\\idea\\JavaRevive\\reflect\\file\\hero.config");
//            Field f1 =h3.getClass().getField("name");
//            f1.set(h3,"修改后");
//            System.out.println(h3.name);
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
        try {
            Method m =h4.getClass().getMethod("setName", String.class);
            m.invoke(h4,"调用改名");
            System.out.println(h4.name);
        } catch (Exception e) {
            e.printStackTrace();

    }
}
}
