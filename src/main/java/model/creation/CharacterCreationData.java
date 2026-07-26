package model.creation;

import model.enums.KeepSake;
import model.enums.StartingClass;

public class CharacterCreationData {

    private String name = "";

    private StartingClass startingClass;

    private KeepSake keepsake = KeepSake.NONE;

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
}