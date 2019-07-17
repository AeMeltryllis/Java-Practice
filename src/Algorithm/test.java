package Algorithm;

public final class test {

    String name ;
    int id ;

    public static void main(String[] args) {
    test a1 = new test();
        test a2 = new test();

        a1.name  = "abc";
        a2.name = "cba";
        a1.name  = "hhh";
        System.out.println(a1.name + " "+a2.name) ;

        a1 = a2;
        System.out.println(a1.name + " "+a2.name) ;
    }
}
