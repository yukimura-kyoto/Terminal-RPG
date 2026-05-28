package Old.Entity.player;

import Old.Entity.base.Stats;

public class Player extends Stats {

    public int level;
    public double xp;
    public double xpToNext;

    public Player(String name, int health, int stamina, int armadura, int esquiva, int level, double xp, double xpToNext) {
        super(name, health, stamina, armadura, esquiva); // Stats cuida disso
        this.level = level;
        this.xp = xp;
        this.xpToNext = xpToNext;
    }
}