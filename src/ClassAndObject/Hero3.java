package ClassAndObject;

public class Hero3 {
     String name ;
    float hp ;
    float mp;

    Hero3(String name){
        this.name = name;
        System.out.println("this is a teemo");

    }
    Hero3(String name, float hp,float mp ){
            this.name = name;
            this.hp = hp;
            this.mp = mp;
    }

    public static void main(String[] args) {
        Hero3 a1 = new Hero3("ti");
        Hero3 a2 = new Hero3("mo");
        System.out.println(a1==a2);
    }


}
