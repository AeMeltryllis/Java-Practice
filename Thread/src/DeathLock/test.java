package DeathLock;

public class test {
    public static void main(String[] args) {
        final Hero guhuoniao = new Hero();
        final Hero wangliang = new Hero();
        final Hero kuanggu = new Hero();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (guhuoniao){
                    System.out.println("正试图验证t1");}
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("现在要去占用另一个对象");
                synchronized (wangliang){
                    System.out.println("做啥好呢");
                }
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (kuanggu){
                    System.out.println("正在占用");
                }
            }
        };
        t1.start();


        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (wangliang){
                    System.out.println("正试图验证t2");}
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("现在要去占用另一个对象");
                synchronized (kuanggu){
                    System.out.println("做啥好呢");
                }
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (guhuoniao){
                    System.out.println("正在占用");
                }
            }
        };
        t2.start();


        Thread t3 = new Thread(){
            @Override
            public void run() {
                synchronized (kuanggu){
                    System.out.println("正试图验证t3");}
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("现在要去占用另一个对象");
                synchronized (guhuoniao){
                    System.out.println("做啥好呢");
                }
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (wangliang){
                    System.out.println("正在占用");
                }
            }
        };
        t3.start();
    }


}
