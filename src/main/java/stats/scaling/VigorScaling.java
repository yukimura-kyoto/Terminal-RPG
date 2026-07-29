package stats.scaling;

public class VigorScaling {

    // HP Scaling
    public static int getHP(int vigor) {

        double hp;

        if (vigor <= 25) {
            hp = 300 + 500 * Math.pow((vigor - 1) / 24.0, 1.5);
        } else if (vigor <= 40) {
            hp = 800 + 650 * Math.pow((vigor - 25) / 15.0, 1.1);
        } else if (vigor <= 60) {
            hp = 1450 + 450 * (1 - Math.pow(1 - ((vigor - 40) / 20.0), 1.2));
        } else {
            hp = 1900 + 200 * (1 - Math.pow(1 - ((vigor - 60) / 39.0), 1.2));
        }

        return (int)hp;

    }
}
