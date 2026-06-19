package model.status;

import model.enums.RollType;

public class DerivedAttributes {

    // HP
    private int maxHp;
    private int currentHp;

    public void setCurrentHp(int currentHp) {
        this.currentHp = validateCurrent(currentHp, maxHp);
    }

    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public int getCurrentHp() {
        return currentHp;
    }

    // FP

    private int maxFp;
    private int currentFp;

    public void setCurrentFp(int currentFp) {
        this.currentFp = validateCurrent(currentFp,maxFp);
    }

    public int getMaxFp() {
        return maxFp;
    }
    public void setMaxFp(int maxFp) {
        this.maxFp = maxFp;
    }
    public int getCurrentFp() {
        return currentFp;
    }

    // Runes

    private int currentRunes;

    public void setCurrentRunes(int currentRunes){ // Max runes that player can hold is 999,999,999
        int maxRunes = 999_999_999;
        this.currentRunes = validateCurrent(currentRunes, maxRunes); }

    public int getCurrentRunes(){ return currentRunes; }

    // Equip Load

    private double currentEquipLoad;
    private double maxEquipLoad;

    public void setCurrentEquipLoad(double currentEquipLoad){
        if (currentEquipLoad < 0) {
            this.currentEquipLoad = 0;
        } else {
            this.currentEquipLoad = currentEquipLoad;
        }
    }

    public double getMaxEquipLoad(){ return maxEquipLoad;}
    public void setMaxEquipLoad(double maxEquipLoad){ this.maxEquipLoad = maxEquipLoad; }
    public double getCurrentEquipLoad(){ return currentEquipLoad;}

    // Roll type based on the current weigh
    public RollType getRollType() {

        double percent = (currentEquipLoad / maxEquipLoad) * 100;

        if (percent < 30.0) {
            return RollType.LIGHT;
        } else if (percent < 70.0) {
            return RollType.MEDIUM;
        } else if (percent < 100.0) {
            return RollType.HEAVY;
        } else {
            return RollType.OVERLOADED;
        }
    }


    // Validação

    public int validateCurrent(int current, int max) {
        if (current < 0) {
            return 0;
        } else if (current > max) {
            return max;
        }
        return current;
    }

    public double validateCurrent(double current, double max) {
        if (current < 0) {
            return 0;
        } else if (current > max) {
            return max;
        }
        return current;
    }
}
