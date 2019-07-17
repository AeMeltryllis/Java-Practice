package abnormal;

public  class ComprehensiveAnomaly {

           private int id;
           double balance;
    ComprehensiveAnomaly(){

        }
    ComprehensiveAnomaly(int id){
            this.id = id;
        }

        double getBalance(){
            return balance;

        }
        void deposit(double money){
            balance += money;
              System.out.println("you have deposit " + money) ;
          }
          void withdraw(double money)throws OverdraftException {

              if (balance - money < 0) throw new  OverdraftException("透支了",(balance - money));
              else balance-=money;

          }



    class OverdraftException extends Exception{
        private  double deficit;
        OverdraftException(){

        }
        OverdraftException(String message){
            super(message);

        }
        OverdraftException(String message,double deficit){

            super(message);
            this.deficit = deficit;
        }
        double getDeficit(){

            return deficit;
        }

    }
    public static void main(String[] args) {
        ComprehensiveAnomaly a = new ComprehensiveAnomaly(114514);
            a.deposit(500);
        System.out.println(a.getBalance());
        try {
            a.withdraw(300);
            System.out.println("取钱成功，余额为： " + a.balance);
        }
        catch (OverdraftException e){
            System.out.println("余额不足，差 "+ Math.abs(e.getDeficit()) + "元" );
        }
        finally {
            System.out.println("操作完毕");
        }
    }

}



