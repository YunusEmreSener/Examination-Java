package MMO;

import java.util.ArrayList;

public class Character implements repairItem {


    private String name = "";
    private String gender = "";
    private int level;
    private int experience;
    private String CharacterClass;
    private int attackpower;
    private int attack1;
    private int attack2;
    private int armor;
    private int hitpoint;
    private int mana;
    private boolean alive;

    private ArrayList<CharacterItems> equipedItems = new ArrayList<>();
    private ArrayList<Character> friendList;


    public Character(int classes, int attackpower, String name, String gender,
                     int level, int experience, String characterClass, int attack,
                     int armor, int hitpoint, int mana) {
        this.name = name;
        this.gender = gender;
        this.level = level;
        this.experience = experience;
        this.CharacterClass = characterClass;
        this.attackpower = attackpower;
        this.attack1 = attack;
        this.attack2 = attack;
        this.armor = armor;
        this.hitpoint = hitpoint;
        this.mana = mana;
        this.alive = true;

        if (classes == 0) {
            Warrior warrior = new Warrior();
            armor = warrior.getArmor();
            hitpoint = warrior.getHitpoints();
            mana = warrior.getMana();
            attack1 = warrior.Slash(attackpower);
            attack2 = warrior.Charge(mana);

            CharacterClass = "Warrior";
        }
        if (classes == 1) {
            Rogue rogue = new Rogue();
            armor = rogue.getArmor();
            hitpoint = rogue.getHitpoints();
            mana = rogue.getMana();
            attack1 = rogue.Backstab(attackpower);
            attack2 = rogue.Stealth(mana);
            CharacterClass = "Rogue";
        }
        if (classes == 2) {
            Wizard wizard = new Wizard();
            armor = wizard.getArmor();
            hitpoint = wizard.getHitpoints();
            mana = wizard.getMana();
            attack1 = wizard.Fireblast(attackpower);
            attack2 = wizard.Teleport(mana);
            CharacterClass = "Rogue";
        }


        //this.itemsEquipped = new ArrayList<characterItems>();
        //this.goldBag = new ArrayList<characterItems>();
        //this.bag = new ArrayList();
    }


    public Character() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCharacterClass() {
        return CharacterClass;
    }

    public void setCharacterClass(String characterClass) {
        CharacterClass = characterClass;
    }

    public int getAttackpower() {
        return attackpower;
    }

    public void setAttackpower(int attackpower) {
        this.attackpower = attackpower;
    }

    public int getAttack1() {
        return attack1;
    }

    public void setAttack1(int attack1) {
        this.attack1 = attack1;
    }

    public int getAttack2() {
        return attack2;
    }

    public void setAttack2(int attack2) {
        this.attack2 = attack2;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public ArrayList<Character> getFriendList() {
        return friendList;
    }

    public void setFriendList(ArrayList<Character> friendList) {
        this.friendList = friendList;
    }

    public ArrayList<CharacterItems> getEquipedItems() {
        return equipedItems;
    }

    public void setEquipedItems(ArrayList<CharacterItems> equipedItems) {
        this.equipedItems = equipedItems;
    }

    @Override
    public int repairItem(EquipableItems item) {
        return 0;
    }
}

