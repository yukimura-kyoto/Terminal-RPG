package model.entities;

import model.enums.StartingClass;
import model.stats.Attributes;
import model.stats.DerivedAttributes;

public class Player {

    private String name;

    private Attributes attributes;
    private DerivedAttributes derivedAttributes;

    public Player(String name, StartingClass startingClass) {

        this.name = name;

        attributes = new Attributes();
        derivedAttributes = new DerivedAttributes();

        DerivedAttributes.updateDerivedStats(attributes, derivedAttributes);

        attributes.setVigor(startingClass.getVigor());
        attributes.setMind(startingClass.getMind());
        attributes.setEndurance(startingClass.getEndurance());
        attributes.setStrength(startingClass.getStrength());
        attributes.setDexterity(startingClass.getDexterity());
        attributes.setIntelligence(startingClass.getIntelligence());
        attributes.setFaith(startingClass.getFaith());
        attributes.setArcane(startingClass.getArcane());
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
}