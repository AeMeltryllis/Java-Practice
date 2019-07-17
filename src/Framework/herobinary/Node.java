package Framework.herobinary;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public Node leftnode;
    public Node rightnode;
    public Object values;

    public void add(Hero h){
        if (null ==values ) values = h.getHP();

        else {
            if ((Integer)h.getHP()<=(Integer)values)
            {
                if (null ==leftnode)
                leftnode = new Node();
            leftnode.add(h);
        }
        else {if (null ==rightnode)
            rightnode = new Node();
            rightnode.add(h);
        }
        }
    }
    public List<Object> bianli(){
        List<Object> heroes = new ArrayList< >() ;

        if (null!=leftnode) heroes.addAll(leftnode.bianli());

        heroes.add(values);

        if (null!=rightnode) heroes.addAll(rightnode.bianli());

        return heroes;
}

    public static void main(String[] args) {
        /**
         *  Hero[]数组只是声明了一组引用，在赋值前还要new Hero（）初始化
         * **/
        Hero[] hero = new Hero[10];
        for (int i = 0; i <hero.length ; i++) {
            hero[i] = new Hero();
            hero[i].setName(("hero"+i ));
            hero[i].setHP((int)(Math.random()*1000));
        }
        Node roots =new Node();
        for (Hero hs:hero
        ) {
            roots.add(hs);
        }

        for (Hero hs:hero
             ) {
            System.out.print(hs.getName()+" ");
        }
        System.out.println(roots.bianli());

    }

}
