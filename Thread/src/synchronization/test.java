package synchronization;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    /**
     * 一个返回当前时间的方法
     * @return
     */
    public String now() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp  =1000;

        System.out.printf("盖伦的初始血量是 %.0f%n",gareen.hp);

        int n =1000;

        Thread[] addThread =new Thread[n];
        Thread[] reduceThread =new Thread[n];

        for (int i = 0; i <n ; i++) {
            Thread t =new Thread(){
                @Override
                public void run() {

//                    synchronized (gareen){gareen.recover();}        //同步线程代码块
                    gareen.recover();
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start(); //为啥这里要开始一个进程
            addThread[i] = t; //为什么要这样的顺序

        }
        for (int i = 0; i <n ; i++) {
            Thread t =new Thread(){
                @Override
                public void run() {
//                    synchronized (gareen){
//                        gareen.hurt();
//                    }//同步线程代码块

                    gareen.hurt();

                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start(); //为啥这里要开始一个进程
            reduceThread[i] = t; //为什么要这样的顺序
        }

        for (Thread t:addThread
             ) {
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        for (Thread t:reduceThread
        ) {
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了 %.0f%n",n,n,gareen.hp);
    }
}
