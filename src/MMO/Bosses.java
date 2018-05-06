package MMO;

public class Bosses extends Npc {
    private String name;
    private int attack;
    private int armor;
    private int hitpoint;
    private String type;

    public Bosses(String Name, int basePower, int baseArmor, int baseHp, String Type) {
        this.name = Name;
        this.attack = 50;
        this.armor = 65;
        this.hitpoint = 500;
        this.type = Type;
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
        return armor;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public int attack(int Power) {
        return Power;
    }

    public int special(int Power) {
        return Power * 3;
    }

    public String BossOptions(String dungeon) {
        String Type = "";
        if (dungeon == "1") {
            Type = "Yeti";
        } else if (dungeon == "2") {
            Type = "Demon";
        } else if (dungeon == "3") {
            Type = "Gargantuan";
        } else if (dungeon == "4") {
            Type = "Dragon";
        }
        return Type;

    }
}
