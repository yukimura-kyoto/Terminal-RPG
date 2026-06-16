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
        this.vigor = validadeAttribute(vigor);
    }

    // Mind
    private int mind;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = validadeAttribute(mind);
    }

    // Endurance
    private int endurance;
    // stamina + equip load

    public int getEndurance(){return endurance;}

    public void setEndurance(int endurance){
        this.endurance = validadeAttribute(endurance);
    }

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

    // HP
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

    // FP

    private int maxFp;
    private int currentFp;

    public void setCurrentFp(int currentFp) {
        if (currentFp < 0) {
            this.currentFp = 0;

        } else if (currentFp > maxFp) {
            this.currentFp = maxFp;

        } else {
            this.currentFp = currentFp;
        }
    }

    public int getMaxFp() {
        return maxFp;
    }

    public void setMaxFp(int maxFp) {
        this.maxFp = maxFp;
    }

    public int getCurrentFp() {
        return currentFp;
    }

    // Equip Load

    private int maxStamina;
    private int currentStamina;

    private double equipLoad;

    // Validação de Atributo
    private int validadeAttribute(int value){
        if (value < 1){
            return 1;
        }
        if (value > 99){
            return 99;
        }
        return value;
    }
}
