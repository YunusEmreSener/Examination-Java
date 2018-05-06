package MMO;


public class Rogue extends Character {
    private int Armor;
    private int AttackPower;
    private int Hitpoints;
    private int Mana;

    public Rogue() {
        super();

        this.Armor = 20;
        this.AttackPower = 100;
        this.Hitpoints = 500;
        this.Mana = 500;
    }

    public int getArmor() {
        return Armor;
    }

    public int getAttackPower(){
        return AttackPower;
    }

    public int getHitpoints() {
        return Hitpoints;
    }

    public int getMana() {
        return Mana;
    }

    public int Backstab(int attackPower){
        return attackPower *2;
}

    public int Stealth(int mana){
        return mana;
    }
}

