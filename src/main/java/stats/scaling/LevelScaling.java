package stats.scaling;

public class LevelScaling {

    public static int getRuneCost(int level) {

        double x = ((level + 81) - 92) * 0.02;

        if (x < 0) {
            x = 0;
        }

        double cost = ((x + 0.1) * Math.pow(level + 81, 2)) + 1;

        return (int) Math.floor(cost);
    }
}