package model.stats;

import engine.scaling.LevelScaling;
import model.enums.StartingClass;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Attributes {

    // Health
    private int vigor;

    public int getVigor() {
        return vigor;
    }

    // Validation for invalid stats
    public void setVigor(int vigor) {
        this.vigor = validateAttribute(vigor);
    }

    // Mind
    private int mind;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = validateAttribute(mind);
    }

    // Endurance
    private int endurance;
    // stamina + equip load

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = validateAttribute(endurance);
    }


    // Strength
    private int strength;
    // Influences player physical/strike/slash/pierce defense and provides Attack Power
    // scaling for weapons that utilize the stat
    // Attribute required to wield heavy armaments.

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = validateAttribute(strength);
    }


    // Dexterity
    private int dexterity;
    // Also boosts attack power of dexterity-scaling armaments, reduces
    // casting time of Spells.

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = validateAttribute(dexterity);
    }


    // Intelligence
    private int intelligence;
    // Attribute required to perform todo glintstone Sorceries.
    // Also boosts the power of intelligence-scaling Sorceries
    // and improves Magic Resistance.

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = validateAttribute(intelligence);
    }


    // Faith
    private int faith;
    // Attribute required to perform sacred Incantations.
    // Also boosts the power of faith-scaling Incantations.

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = validateAttribute(faith);
    }


    // Arcane
    private int arcane;
    // Influences player holy defense and death resistance
    // provides AP scaling for weapons that utilize the stat
    // increases item discovery (linearly)
    // and provides scaling for poison, bleed, sleep, and madness buildup.

    public int getArcane() {
        return arcane;
    }

    public void setArcane(int arcane) {
        this.arcane = validateAttribute(arcane);
    }

    public Attributes(){}

    // Level
    // Add up all the attributes and subtract 79, this generates the current level.
    @JsonIgnore
    public int getLevel() {
        return vigor +
                mind +
                endurance +
                strength +
                dexterity +
                intelligence +
                faith +
                arcane - 79;
    }

    public static boolean spendRunesToLevelUp(Attributes player, DerivedAttributes derived) {

        int cost = LevelScaling.getRuneCost(player.getLevel());

        if (derived.getRunes() >= cost) {
            derived.setRunes(derived.getRunes() - cost);
            return true;
        }

        System.out.println("Not enough runes!");
        return false;
    }

    // Attributes constructor

    public Attributes(StartingClass startingClass) {

        this.vigor = startingClass.getVigor();
        this.mind = startingClass.getMind();
        this.endurance = startingClass.getEndurance();
        this.strength = startingClass.getStrength();
        this.dexterity = startingClass.getDexterity();
        this.intelligence = startingClass.getIntelligence();
        this.faith = startingClass.getFaith();
        this.arcane = startingClass.getArcane();
    }

    // Validação de Atributo
    private int validateAttribute(int value) {
        if (value < 1) {
            return 1;
        }

        if (value > 99) {
            return 99;
        }

        return value;
    }
}