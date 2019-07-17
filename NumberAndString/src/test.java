import org.omg.PortableInterceptor.INACTIVE;

public class test {
    public static void main(String[] args) {
//        System.out.println(Byte.MAX_VALUE);
////        System.out.println(Byte.MIN_VALUE);

//    int i = 1;
//    byte b = 2;
//
//    Integer ii = i;
//    Byte bb = b;
//
//    Integer ib = (int)b;
//    Byte bi =(byte) i;
//
//        System.out.println(ib);
//        System.out.println(bi);

       /**
       * 测试字符串到浮点数的转换
       * 抛出异常
       */
//        String a ="3.1a4";
//        int b =3;
//
//        double o =Double.parseDouble(a);
//
//        System.out.println(o);
        /**
         * 输出自然常数e
         */
//        double n =1000000000;
//        double e = Math.pow((1+1/n),n);
//        System.out.println(e);
//        System.out.println(Math.E);
/**
 *  字符串的格式化输出
 */
        String a= "zhw";
        String StringFormat = "%s 在这里 %s 吃掉了 %d 元%n";
        System.out.printf(StringFormat,a,a,123);


    }

}
