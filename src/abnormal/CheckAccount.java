package abnormal;


public class CheckAccount extends  ComprehensiveAnomaly{
    double overdrafrProtection;

        CheckAccount(double balance){
        }
    CheckAccount(double balance, double protect){
            this.balance = balance;
            this.overdrafrProtection = protect;
    }

    @Override
    void withdraw(double money) throws OverdraftException {
        if ((overdrafrProtection+balance - money) < 0) throw new  OverdraftException("你连支票透支余额都用完了",(overdrafrProtection+balance - money));
        else if (balance - money< 0){
            System.out.println("你已经透支了 " +(balance - money)   );
            System.out.println("仍然可以透支 " + (overdrafrProtection+balance - money));
            balance-=money;
        }
        else balance-=money;

    }



    public static void main(String[] args) {
        CheckAccount b = new CheckAccount(500, 100);
        try {
            b.withdraw(700);
            System.out.println("取钱成功，余额为： " + b.balance);
        }
        catch (OverdraftException e){
            System.out.println("余额不足，还差 "+ e.getDeficit() + "元" );
            //输出
            System.out.println("123"+e.getMessage());
            //printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因
            e.printStackTrace();
        }
        finally {
            System.out.println("操作完毕");
        }
    }



}
