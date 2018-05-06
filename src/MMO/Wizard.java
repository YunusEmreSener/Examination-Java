package MMO;

public class Wizard {
    private int Armor;
    private int AttackPower;
    private int Hitpoints;
    private int Mana;

    public Wizard() {
        super();

        this.Armor = 100;
        this.AttackPower = 75;
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

    public int Fireblast(int attackPower){
        return attackPower *4;
    }

    public int Teleport(int Mana){
        return Mana;
    }
}
