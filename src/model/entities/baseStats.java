package model.entities;

public class baseStats {

    int vigor;      // Health

    int endurance;  // stamina + equip load

    int strength;   // Influences player physical/strike/slash/pierce defense and provides Attack Power
                    // scaling for weapons that utilize the stat
                    // Attribute required to wield heavy armaments.

    int dexterity;  // Also boosts attack power of dexterity-scaling armaments, reduces
                    // casting time of Spells.

    int intelligence; // Attribute required to perform todo glintstone Sorceries.
                      // Also boosts the power of intelligence-scaling Sorceries
                      // and improves Magic Resistance.

    int faith;        // Attribute required to perform sacred Incantations.
                      // Also boosts the power of faith-scaling Incantations.

    int arcane;       // Influences player holy defense and death resistance
                      // provides AP scaling for weapons that utilize the stat
                      // increases item discovery (linearly)
                      // and provides scaling for poison, bleed, sleep, and madness buildup.
}
