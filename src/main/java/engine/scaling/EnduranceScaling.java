package engine.scaling;

public class EnduranceScaling {
    // Equip Load Scaling
    public static double getEquipLoad(int endurance) {

        double equipLoad;

        if (endurance <= 8) {
            equipLoad = 45.0;
        } else if (endurance <= 25) {
            equipLoad = 45 + 27 * ((endurance - 8) / 17.0);
        } else if (endurance <= 60) {
            equipLoad = 72 + 48 * Math.pow((endurance - 25) / 35.0, 1.1);
        } else {
            equipLoad = 120 + 40 * ((endurance - 60) / 39.0);
        }

        equipLoad = Math.floor(equipLoad * 10) / 10.0;

        return equipLoad;
    }
}
