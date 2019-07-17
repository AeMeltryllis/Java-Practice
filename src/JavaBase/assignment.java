package JavaBase;
import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天是周几？：");
        int input;
        try {
             input = sc.nextInt();
        }
        catch (Exception e){
            System.out.println("输入不合法,请重新输入");

            return ;

        }
//        String ouput = input <= 5 ? "今天是工作日":"今天是周末";
//        System.out.println(ouput);
        switch (input){
            case '1': case '2':
                System.out.println("123");
                break;

            default:
                System.out.println(321);



        }
    }


}
