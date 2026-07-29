package enums;

public enum RollType {

    LIGHT("Light Load"),
    MEDIUM("Medium Load"),
    HEAVY("Heavy Load"),
    OVERLOADED("Overloaded");

    private final String name;

    RollType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}