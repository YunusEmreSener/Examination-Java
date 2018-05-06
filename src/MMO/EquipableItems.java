package MMO;

public class EquipableItems extends CharacterItems implements repairItem {
    private int durability;
    private int stats;
    private int slot;
    private boolean equipped;
    private int maxDurability = 100;

    public EquipableItems(String itemName, String subType, int durability, int stats, int slot, boolean equipped, int maxDurability) {
        super(itemName, subType);
        this.durability = durability;
        this.stats = stats;
        this.slot = slot;
        this.equipped = equipped;
        this.maxDurability = maxDurability;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getStats() {
        return stats;
    }

    public void setStats(int stats) {
        this.stats = stats;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public boolean isEquipped() {
        return equipped;
    }

    public void setEquipped(boolean equipped) {
        this.equipped = equipped;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(int maxDurability) {
        this.maxDurability = maxDurability;
    }

    @Override
    public int repairItem(EquipableItems item) {
        return 0;
    }
}