package model.entities;

public class BaseStats {

    public String name;

    public int vigor;
    // Health

    public int endurance;
    // stamina + equip load

    public int strength;
    // Influences player physical/strike/slash/pierce defense and provides Attack Power
    // scaling for weapons that utilize the stat
    // Attribute required to wield heavy armaments.

    public int dexterity;
    // Also boosts attack power of dexterity-scaling armaments, reduces
    // casting time of Spells.

    public int intelligence;
    // Attribute required to perform todo glintstone Sorceries.
    // Also boosts the power of intelligence-scaling Sorceries
    // and improves Magic Resistance.

    public int faith;
    // Attribute required to perform sacred Incantations.
    // Also boosts the power of faith-scaling Incantations.

    public int arcane;
    // Influences player holy defense and death resistance
    // provides AP scaling for weapons that utilize the stat
    // increases item discovery (linearly)
    // and provides scaling for poison, bleed, sleep, and madness buildup.

    public int health;
    public int stamina;
    public int equipLoad;

    // equipment
    // todo public Weapons_Stats currentWeapon;

    public BaseStats(String name) {
        this.name = name;
    }

    public static int getHP(int vigor) {

        if (vigor <= 23)
            return 300 + (vigor * 19); // 737

        if (vigor <= 40)
            return 737 +(vigor*42); // 1451

        if (vigor <=60)
            return 1451+(vigor*22); // 1891

        if (vigor<=90)
            return 1891+(vigor*6); // 2071

        if (vigor<=99)
            return 2071+(vigor*4); // 2107

        return 1900 + (vigor - 60) * 10;
    }
}
