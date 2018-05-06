package MMO;

public class Warrior {
    private int Armor;
    private int Hitpoints;
    private int Mana;
    private int AttackPower;


    public Warrior() {
        super();

        this.Armor = 100;
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

    public int Slash(int attackPower){
        return attackPower *2;
    }

    public int Charge(int mana){
        return mana;
    }
}

