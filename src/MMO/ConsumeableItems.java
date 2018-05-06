package MMO;


public class ConsumeableItems extends CharacterItems {
    private String healthPotion;
    private String manaPotion;

    public ConsumeableItems(String itemName, String subtype, String healthPotion, String manaPotion){
        super(itemName, subtype);
        this.healthPotion = healthPotion;
        this.manaPotion = manaPotion;
    }

    public String getHealthPotion() {
        return healthPotion;
    }

    public String getManaPotion() {
        return manaPotion;
    }

    public void setHealthPotion(String healthPotion) {
        this.healthPotion = healthPotion;
    }

    public void setManaPotion(String manaPotion) {
        this.manaPotion = manaPotion;
    }

}
