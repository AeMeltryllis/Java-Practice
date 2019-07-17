package ThreadMethod;

public class Hero {
    private String name ;
    private int HP;
    private int NP =100;
    private double attackSpedd =0.5 ;

    public int ADugefrequency= 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public void setAttackSpedd(double attackSpedd) {
        this.attackSpedd = attackSpedd;
    }

    public double getAttackSpedd() {
        return attackSpedd;
    }



    public void attack(Hero name, int damage){
        name.HP -=damage;
        System.out.println(name.name+"造成了"+damage+"点伤害。" );

        try{
            Thread.sleep(1000*(long)attackSpedd);
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }
        if (name.isDead()){
            System.out.println(name.name+"死啦");
        }
    }

    public void castADuGe(){


        try{
            Thread.sleep(1000);
            System.out.println(name+"释放了"+(ADugefrequency+1)+"次波动拳");
            NP-=10;


            ADugefrequency++;
        }
        catch (InterruptedException e ){
            e.printStackTrace();
        }
        finally {
            if (ADugefrequency==3){
                System.out.println(this.name+"还有"+this.NP+"点NP");
                ADugefrequency=0;
                try {
                    System.out.println("正在进行五秒的充能.");
                    NP+=5;
                    System.out.println();
                    Thread.sleep(5000);

                }catch (InterruptedException  e){e.printStackTrace();}
            }
        }
    }
    public boolean isDead(){
        return 0>=HP?true:false;
    }
    public boolean isNoNp(){return 0>=NP?true:false;}

}
