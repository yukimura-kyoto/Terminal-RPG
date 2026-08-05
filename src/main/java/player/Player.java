package player;

import player.creation.CharacterCreationData;
import enums.KeepSake;
import enums.StartingClass;
import save.PlayerData;
import stats.Attributes;
import stats.DerivedAttributes;
import world.AreaId;

public class Player {

    private String name;
    private int runes;

    private int level;

    private Attributes attributes;
    private DerivedAttributes derivedAttributes;

    private AreaId currentArea;

    // Criação de personagem
    private StartingClass startingClass;
    private KeepSake keepsake;

    // Isso é usado na criação de personagem 67
    public Player(CharacterCreationData data) {

        this.name = data.getName();
        this.runes = 0;
        this.level = data.getStartingClass().getLevel();

        this.attributes = new Attributes();
        this.derivedAttributes = new DerivedAttributes();

        this.startingClass = data.getStartingClass();
        this.keepsake = data.getKeepsake();

        this.attributes.setVigor(startingClass.getVigor());
        this.attributes.setMind(startingClass.getMind());
        this.attributes.setEndurance(startingClass.getEndurance());
        this.attributes.setStrength(startingClass.getStrength());
        this.attributes.setDexterity(startingClass.getDexterity());
        this.attributes.setIntelligence(startingClass.getIntelligence());
        this.attributes.setFaith(startingClass.getFaith());
        this.attributes.setArcane(startingClass.getArcane());

        DerivedAttributes.updateDerivedStats(attributes, derivedAttributes);
    }

    // Isso tu usa pra carregar o player com a data atual
    public Player(PlayerData data) {

        this.name = data.getName();
        this.runes = data.getRunes();
        this.level = data.getLevel();

        this.startingClass = data.getStartingClass();
        this.keepsake = data.getKeepsake();

        this.attributes = data.getAttributes();
        this.derivedAttributes = data.getDerivedAttributes();

        this.currentArea = data.getCurrentArea();
    }

    public String getName() {
        return name;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public DerivedAttributes getDerivedAttributes() {
        return derivedAttributes;
    }

    public KeepSake getKeepsake() {
        return keepsake;
    }

    public StartingClass getStartingClass() {
        return startingClass;
    }

    public int getRunes() {
        return runes;
    }

    public int getLevel() {
        return level;
    }

    public AreaId getCurrentArea() {
        return currentArea;
    }

    public void setCurrentArea(AreaId currentArea) {
        this.currentArea = currentArea;
    }

    // nao tem como adicionar −67 milhoes de runas
    public void addRunes(int amount) {
        if (amount <= 0) {
            return;
        }
        runes += amount;
    }

    public boolean spendRunes(int amount) {
        if (runes < amount) {
            return false;
        }
        runes -= amount;
        return true;
    }

    // Debug
    public void setRunes(int runes) {
        this.runes = runes;
    }
}