package PCquestion;

public class Producer extends Thread {
    public char produce (){
        int num = (int)Math.round((Math.random()*26)-1);//若随机数是26，会转换成 [
        //Math.round() 四舍五入，最后一定是一个1-26的整数
//        int j =(int)'A'+num;
//        char zimu = (char)j;
        char zimu =(char)('A'+num);
        return  zimu;
    }


    //    public static void main(String[] args) {
//        Producer p =new Producer();
//
////        System.out.println(p.produce());
//
//        for (int i = 0; i <26 ; i++) {
//            System.out.println((char)('A'+i));
//        }
//    }


}
