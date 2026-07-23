package model.enums;

public enum StartingClass {

    // It uses enums to define the initial attribute of each class, respectively.

    HERO(
            "Hero",
            14, 9, 12, 16, 9, 7, 8, 11
    ),

    BANDIT(
            "Bandit",
            10, 11, 10, 9, 13, 9, 8, 14
    ),

    ASTROLOGER(
            "Astrologer",
            9, 15, 9, 8, 12, 16, 7, 9
    ),

    WARRIOR(
            "Warrior",
            11, 12, 11, 10, 16, 10, 8, 9
    ),

    PRISONER(
            "Prisoner",
            11, 12, 11, 11, 14, 14, 6, 9
    ),

    CONFESSOR(
            "Confessor",
            10, 13, 10, 12, 12, 9, 14, 9
    ),

    WRETCH(
            "Wretch",
            10, 10, 10, 10, 10, 10, 10, 10
    ),

    VAGABOND(
            "Vagabond",
            15, 10, 11, 14, 13, 9, 9, 7
    ),

    PROPHET(
            "Prophet",
            10, 14, 8, 11, 10, 7, 16, 10
    ),

    SAMURAI(
            "Samurai",
            12, 11, 13, 12, 15, 9, 8, 8
    ),

    HEAVY_KNIGHT(
            "Heavy Knight",
            14, 8, 17, 15, 11, 7, 8, 9
    ),

    IDUS_KNIGHT(
            "Idus Knight",
            10, 12, 11, 13, 15, 8, 11, 6
    );

    private final String name;

    private final int vigor;
    private final int mind;
    private final int endurance;
    private final int strength;
    private final int dexterity;
    private final int intelligence;
    private final int faith;
    private final int arcane;


    StartingClass(String name,
                  int vigor,
                  int mind,
                  int endurance,
                  int strength,
                  int dexterity,
                  int intelligence,
                  int faith,
                  int arcane) {

        this.name = name;
        this.vigor = vigor;
        this.mind = mind;
        this.endurance = endurance;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.faith = faith;
        this.arcane = arcane;
    }


    public String getName() {
        return name;
    }

    public int getVigor() {
        return vigor;
    }

    public int getMind() {
        return mind;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getFaith() {
        return faith;
    }

    public int getArcane() {
        return arcane;
    }

    public int getLevel() {
        return vigor + mind + endurance + strength +
                dexterity + intelligence + faith + arcane - 79;
    }
}