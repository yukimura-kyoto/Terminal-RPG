package stats;

import com.fasterxml.jackson.annotation.JsonIgnore;
import stats.scaling.EnduranceScaling;
import stats.scaling.MindScaling;
import stats.scaling.VigorScaling;
import enums.RollType;

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
    // todo Change all runes to PlayerData
    private int currentRunes;

    public void setRunes(int currentRunes){ // Max runes that player can hold is 999,999,999
        int maxRunes = 999_999_999;
        this.currentRunes = validateCurrent(currentRunes, maxRunes); }

    public int getRunes(){ return currentRunes; }

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
    @JsonIgnore
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

    // Update Values
    public static void updateDerivedStats(Attributes player, DerivedAttributes stats) {

        int oldMaxHp = stats.getMaxHp();
        int oldMaxFp = stats.getMaxFp();

        int newMaxHp = VigorScaling.getHP(player.getVigor());
        int newMaxFp = MindScaling.getFP(player.getMind());

        stats.setMaxHp(newMaxHp);
        stats.setMaxFp(newMaxFp);

        stats.setCurrentHp(
                stats.getCurrentHp() + (newMaxHp - oldMaxHp)
        );

        stats.setCurrentFp(
                stats.getCurrentFp() + (newMaxFp - oldMaxFp)
        );

        stats.setMaxEquipLoad(
                EnduranceScaling.getEquipLoad(player.getEndurance())
        );
    }
}
