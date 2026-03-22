package Inventory;

public class Rituals {

    // Magias basicamente, copia e cola e altera o dano min e o max
    // dica: se baseie em dados para colocar o dano

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
