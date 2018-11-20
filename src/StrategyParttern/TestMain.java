package StrategyParttern;

public class TestMain {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();
        knight.setWeaponBehavior(new BowAndArrowBehavior());
        knight.fight();
        troll.setWeaponBehavior(new AxeBehavior());
        troll.fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();
    }
}
