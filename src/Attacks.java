public abstract class Attacks {

    public static int socoLeve() {
        int danoMin = 5;
        int danoMax = 10;
        int dano = danoMin + (int)(Math.random() * (danoMax - danoMin + 1));
        return dano;
    }

    public static int socoPesado() {
        int danoMin = 10;
        int danoMax = 20;
        int dano = danoMin + (int)(Math.random() * (danoMax - danoMin + 1));
        return dano;
    }

    public static int Descarnar() {
        int danoMin = 6;
        int danoMax = 48;
        int dano = danoMin + (int)(Math.random() * (danoMax - danoMin + 1));
        return dano;
    }

    public static int rajadaCaotica() {
        int danoMin = 8;
        int danoMax = 64;
        int dano = danoMin + (int)(Math.random() * (danoMax - danoMin + 1));
        return dano;
    }
}