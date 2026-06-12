package model.entities;

public class BaseStats {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Health
    private int vigor;

    public int getVigor() {
        return vigor;
    }

    // Validation for invalid stats
    public void setVigor(int vigor) {
        if (vigor < 1) {
            this.vigor = 1;
        } else if (vigor > 99) {
            this.vigor = 99;
        } else {
            this.vigor = vigor;
        }
    }

    private int endurance;
    // stamina + equip load

    private int strength;
    // Influences player physical/strike/slash/pierce defense and provides Attack Power
    // scaling for weapons that utilize the stat
    // Attribute required to wield heavy armaments.

    private int dexterity;
    // Also boosts attack power of dexterity-scaling armaments, reduces
    // casting time of Spells.

    private int intelligence;
    // Attribute required to perform todo glintstone Sorceries.
    // Also boosts the power of intelligence-scaling Sorceries
    // and improves Magic Resistance.

    private int faith;
    // Attribute required to perform sacred Incantations.
    // Also boosts the power of faith-scaling Incantations.

    private int arcane;
    // Influences player holy defense and death resistance
    // provides AP scaling for weapons that utilize the stat
    // increases item discovery (linearly)
    // and provides scaling for poison, bleed, sleep, and madness buildup.

    // equipment
    // todo public Weapons_Stats currentWeapon;

    public BaseStats(String name) {
        this.name = name;
    }

    // Stats

    private int maxHp;
    private int currentHp;

    public void setCurrentHp(int currentHp) {

        if (currentHp < 0) {
            this.currentHp = 0;

        } else if (currentHp > maxHp) {
            this.currentHp = maxHp;

        } else {
            this.currentHp = currentHp;
        }
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    private int maxStamina;
    private int currentStamina;

    private double equipLoad;
}
