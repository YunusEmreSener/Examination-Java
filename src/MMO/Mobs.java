package MMO;

public class Mobs extends Npc {
    private String name;
    private int attack;
    private int Armor;
    private int hitpoint;
    private String type;

    public Mobs(String Name, int basePower, int baseArmor, int baseHp) {
        this.name = Name;
        this.attack = 35;
        this.Armor = 15;
        this.hitpoint = 120;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return Armor;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public int attack(int Power) {
        return attack;
    }

    public String MobsOptions(String input) {
        String Type = "";
        if (input == "1") {
            Type = "Wolf";
        } else if (input == "2") {
            Type = "Spider";
        } else if (input == "3") {
            Type = "Zombie";
        } else if (input == "4") {
            Type = "Humanoid";
        }
        return Type;


    }
}
