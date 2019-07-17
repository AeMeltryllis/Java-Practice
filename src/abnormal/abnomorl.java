package abnormal;
import java.util.*;


public class abnomorl {
  static   Scanner sc  = new Scanner(System.in);

    private static void test1(){
        try {
            System.out.println("请输入：");
            int input = sc.nextInt();
            int ouput = 5/input;
            throw new  Exception("没问题");

        }

        catch (Throwable e){
            System.out.println(e);



        }

    }

//    private static void test2()throws Exception{
//        System.out.println("请输入：");
//            int input = sc.nextInt();
//            int ouput = 5/input;
//    }

    public static void main(String[] args) {
        abnomorl.test1();



    }




    }

