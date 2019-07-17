package ThreadMethod;


import others.StopWatch;

public class test {
    public static void main(String[] args) {
        String abc= "as";


        Hero mangsen = new Hero();
        mangsen.setAttackSpedd(0.5);
        mangsen.setName("李青");
        mangsen.setHP(1000);

        Hero shizigou = new Hero();
        shizigou.setAttackSpedd(0.33);
        shizigou.setName("狮子狗");
        shizigou.setHP(750);



        Thread t1 = new Thread(){

            public void run(){

                while (!mangsen.isNoNp()){

                    mangsen.castADuGe();
                    if(mangsen.isNoNp()){
                        System.out.println(mangsen.getName()+"没NP啦");
            break;
                    }

                }
            }
        };
        t1.start();
    }
}
