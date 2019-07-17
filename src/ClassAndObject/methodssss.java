package ClassAndObject;

public class methodssss {
   private static String name = "zhw";
    float hp;
    float armor;
    int moveSpeed;


    public  methodssss(String name, float hp){
        this.name = name;
        this.hp = hp;
        System.out.println(this.name);
    }
    methodssss(){
        System.out.println("什么都没有");
    }

    public static void main(String[] args) {
        methodssss hero = new methodssss("abc", 555);
        methodssss hero1 =new methodssss();
        System.out.println(name);
    }


}
