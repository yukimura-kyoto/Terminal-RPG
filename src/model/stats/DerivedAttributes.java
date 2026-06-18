package model.stats;

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

    // Equip Load

    private double currentEquipLoad;
    private double maxEquipLoad;

    public void setCurrentEquipLoad(double currentEquipLoad){
        this.currentEquipLoad = validateCurrent(currentEquipLoad,maxEquipLoad);
    }

    public double getMaxEquipLoad(){ return maxEquipLoad;}
    public void setMaxEquipLoad(double maxEquipLoad){ this.maxEquipLoad = maxEquipLoad; }
    public double getCurrentEquipLoad(){ return currentEquipLoad;}


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
