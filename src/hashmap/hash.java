package hashmap;

import Framework.herobinary.Hero;

import java.net.HttpRetryException;
import java.util.HashMap;
import java.util.ArrayList;

public class hash
{
    public static void main(String[] args) {
        ArrayList<Hero> list = new ArrayList<>();
        for (int i = 0; i <300000 ; i++) {
            Hero hero = new Hero();
            hero.setName("hero "+ Math.random()*1000);
            list.add(hero);
        }


        HashMap<String,Hero> hash = new HashMap<>();
        for (int i = 0; i <300000 ; i++) {
            String tempname = "hero "+ Math.random()*1000;
            Hero hero = new Hero();
            hero.setName(tempname);
            hash.put(tempname,hero);
        }
        long startTime=System.currentTimeMillis();

        for (Hero h:list
             ) {
            if (h.equals("hero 1000") ) {

                System.out.println("找到咯，值为"+h.getName());
                break;
            }

        }
        long endTime=System.currentTimeMillis();
        System.out.println("for循环查找时间："+(endTime-startTime));


        long hstartTime=System.currentTimeMillis();
        if (hash.get("hero 1000")!=null){
            System.out.println("找到咯，值为"+hash.get("hero 1000"));
        }

        long hendTime=System.currentTimeMillis();
        System.out.println("hash循环查找时间："+(hendTime-hstartTime));



    }


}
