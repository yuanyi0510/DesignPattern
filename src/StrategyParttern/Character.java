package StrategyParttern;

public abstract class Character {
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    WeaponBehavior weaponBehavior;
    public abstract void fight();

}
