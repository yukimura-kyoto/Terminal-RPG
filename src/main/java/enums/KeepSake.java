package enums;

public enum KeepSake {

    NONE(
            "None",
            "No keepsake. The past has been well and truly left behind.",
            "-"
    ),

    CRIMSON_AMBER_MEDALLION(
            "Crimson Amber Medallion",
            "A medallion inlaid with crimson amber. Slightly increases maximum HP.",
            "While equipped, increases maximum HP by 6%."
    ),

    LANDS_BETWEEN_RUNE(
            "Lands Between Rune",
            "The gold of grace shining in the eyes of the people of the Lands Between.",
            "Use to gain 3000 Runes."
    ),

    GOLDEN_SEED(
            "Golden Seed",
            "A golden seed washed ashore from the Lands Between.",
            "Grants one additional Sacred Flask charge."
    ),

    FANGED_IMP_ASHES(
            "Fanged Imp Ashes",
            "The ashes of small, diminutive golems. Ashes are said to hold spirits within.",
            "Summons two Fanged Imps to fight by your side."
    ),

    CRACKED_POT(
            "Cracked Pot",
            "Three strange cracked pots that somehow mend themselves.",
            "Used to craft Throwing Pots."
    ),

    STONESWORD_KEY(
            "Stonesword Key",
            "Two stone keys shaped like swords.",
            "Unlocks one Imp Statue."
    ),

    BEWITCHING_BRANCH(
            "Bewitching Branch",
            "Five sacred branches charged with beguiling power.",
            "Charms an enemy for a short duration."
    ),

    BOILED_PRAWN(
            "Boiled Prawn",
            "Five pieces of boiled prawn.",
            "Boosts Physical Damage Negation for 60 seconds."
    ),

    SHABRIRIS_WOE(
            "Shabriri's Woe",
            "The crazed likeness of a noble whose eyes have been gouged out.",
            "Constantly attracts enemy aggression while equipped."
    );

    private final String name;
    private final String description;
    private final String effect;

    KeepSake(String name, String description, String effect) {
        this.name = name;
        this.description = description;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getEffect() {
        return effect;
    }
}