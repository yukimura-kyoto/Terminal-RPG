package model.save;

import model.enums.KeepSake;
import model.enums.StartingClass;
import model.stats.Attributes;
import model.stats.DerivedAttributes;

public class PlayerData {

    private String name;
    private int runes;
    private int level;

    private StartingClass startingClass;
    private KeepSake keepsake;

    private Attributes attributes;
    private DerivedAttributes derivedAttributes;

    public PlayerData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StartingClass getStartingClass() {
        return startingClass;
    }

    public void setStartingClass(StartingClass startingClass) {
        this.startingClass = startingClass;
    }

    public KeepSake getKeepsake() {
        return keepsake;
    }

    public void setKeepsake(KeepSake keepsake) {
        this.keepsake = keepsake;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public DerivedAttributes getDerivedAttributes() {
        return derivedAttributes;
    }

    public void setDerivedAttributes(DerivedAttributes derivedAttributes) {
        this.derivedAttributes = derivedAttributes;
    }

    public int getRunes() {
        return runes;
    }

    public void setRunes(int runes) {
        this.runes = runes;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
