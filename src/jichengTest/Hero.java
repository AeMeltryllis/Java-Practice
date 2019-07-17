package jichengTest;

public class Hero {
    public  Hero(String name){
        this.name = name;
    }
    public String name ;
    public int HP;
    public int NP;
    public double attackSpeed = 0.5;

    public void getInfo(Hero hero){
        System.out.printf("英雄名字是 %s ,他的HP为 %d ,NP为%d%n",this.name,this.HP,this.NP);
    }

}
