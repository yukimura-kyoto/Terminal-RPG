import Inventory.Weapons;

public abstract class Attacks {



    public static int ataqueLeve() {
        int danoMin = 5;
        int danoMax = 10;
        int dano = danoMin + (int)(Math.random() * (danoMax - danoMin + 1));
        return dano;
    }

    public static int ataqueDuplo() {
        int danoMin = 10;
        int danoMax = 20;
        int dano = danoMin + (int)(Math.random() * (danoMax - danoMin + 1));
        return dano;
    }

}