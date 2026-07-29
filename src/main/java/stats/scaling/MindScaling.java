package stats.scaling;

public class MindScaling {

    public static int getFP(int mind) {

        double fp;

        if (mind <= 15) {
            fp = 50 + 45 * ((mind - 1) / 14.0);
        } else if (mind <= 35) {
            fp = 95 + 105 * ((mind - 15) / 20.0);
        } else if (mind <= 60) {
            fp = 200 + 150 * (1 - Math.pow(1 - ((mind - 35) / 25.0), 1.2));
        } else {
            fp = 350 + 100 * ((mind - 60) / 39.0);
        }

        return (int) Math.floor(fp);
    }
}