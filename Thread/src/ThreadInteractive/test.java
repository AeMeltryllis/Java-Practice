package ThreadInteractive;

public class test {
    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 1000;

        Thread t1 =new Thread(){
            @Override
            public void run() {
                while (true){
                    gareen.recover();
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();

        Thread t2 =new Thread(){
            @Override
            public void run() {
                while (true){
                    gareen.hurt();
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();

    }
}
