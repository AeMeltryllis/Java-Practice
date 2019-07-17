package ClassAndObject;

public class Hero {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    private Hero(){

    }

    private Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    private void revive(Hero h){
        h = new Hero("提莫",383);
    }
    private static Hero hero = new Hero();

    public  static Hero getInstance( ){
        return hero;
    }

    public static void main(String[] args) {
//        Hero teemo =  new Hero("提莫",383);
//
//        //受到400伤害，挂了
//        teemo.hp = teemo.hp - 400;
//        teemo.revive(teemo);
//        System.out.println(teemo.hp);
//        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？

   Hero h1 = Hero.getInstance();
   Hero h2 = Hero.getInstance();
   Hero h3 = Hero.getInstance();
        System.out.println(h1==h2);
        System.out.println(h2==h3);
    }


}
