package StrategyParttern;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println(this.getClass().getName()+"开始攻击了");
        getWeaponBehavior().useWeapon();
    }

}
