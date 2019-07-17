package PCquestion;

public class test {
    public static void main(String[] args) {
        ThreadStack list = new ThreadStack();
        Producer p =new Producer();

        Thread produce1 = new Thread(){
            @Override
            public void run() {
                while (true){
                char yuansu = p.produce();
                list.push(yuansu);
                System.out.println("produce1：压入:"+yuansu);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            } }
        };
        produce1.setPriority(Thread.MAX_PRIORITY);
        produce1.start();


        Thread produce2 = new Thread(){
            @Override
            public void run() {
                while (true){
                char yuansu = p.produce();
                list.push(yuansu);
                System.out.println("produce2：压入:"+yuansu);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
            }}
        };
        produce2.setPriority(Thread.MAX_PRIORITY);
        produce2.start();

        Thread consumer1 = new Thread(){
            @Override
            public void run() {
                while (true){
               char tanchu =  (char)list.pop();
                System.out.println("consumer1:弹出"+tanchu);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
            }}
        };
        consumer1.start();

        Thread consumer2 = new Thread(){
            @Override
            public void run() {
                while (true){
                    char tanchu =  (char)list.pop();
                    System.out.println("consumer2:弹出"+tanchu);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }}
        };
        consumer2.start();

        Thread consumer3 = new Thread(){
            @Override
            public void run() {
                while (true){
                    char tanchu =  (char)list.pop();
                    System.out.println("consumer3:弹出"+tanchu);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }}
        };
        consumer3.start();
    }




}
