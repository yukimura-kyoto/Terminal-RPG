package model.entities;

import model.stats.Attributes;
import model.stats.DerivedAttributes;

public class Player {

    private String name;

    private Attributes attributes;
    private DerivedAttributes stats;

    public Player(String name) {
        this.name = name;
        this.attributes = new Attributes();
        this.stats = new DerivedAttributes();
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public DerivedAttributes getStats() {
        return stats;
    }

    public void updateStats() {
        DerivedAttributes.updateDerivedStats(attributes, stats);
    }

    public String getName() {
        return name;
    }
}