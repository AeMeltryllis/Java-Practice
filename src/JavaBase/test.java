package JavaBase;

public class test {
    /*求最大公约数*/
    public static int gcd(int p, int q) {

        if (q == 0) return p;

        int r = p % q;
        return gcd(q, r);
    }


    /*判断是否是素数*/
    public static boolean isPrime(int a){
    //在一般领域，对正整数n，如果用2到  之间的所有整数去除，均无法整除，则n为质数。质数大于等于2 不能被它本身和1以外的数整除
        if (a<2) return false;
        for (int i = 2; i*i <= a; i++) {//在一般领域，对正整数n，如果用2到  之间的所有整数去除，均无法整除，则n为质数。质数大于等于2 不能被它本身和1以外的数整除
            if (a % i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /*强制转换*/
//        float a = 14.11F;
////        int b;
////        b=(int) a;
////        System.out.println(b);

//         int abc =   gcd(6, 3);
//         System.out.println(abc);

//           boolean aa = isPrime(6);
//            System.out.println(aa);



    }
}
