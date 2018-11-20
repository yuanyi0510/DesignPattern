package StrategyParttern;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println(this.getClass().getName()+"开始攻击了");
        getWeaponBehavior().useWeapon();
    }

}
