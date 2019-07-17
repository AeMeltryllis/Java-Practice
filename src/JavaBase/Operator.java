package JavaBase;
import java.util.Scanner;


public class Operator {

    public static void main(String[] args) {
//        Scanner s  =new Scanner(System.in);
//
//        System.out.println("请输入第一个整数：");
//        int a = s.nextInt();
//
//        System.out.println("请输入第二个整数：");
//        int b = s.nextByte();
//
//        int ab = a+b;
//        System.out.println("结果为：" + ab);
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;
        System.out.println(i);
        System.out.println(j);
    }
}
