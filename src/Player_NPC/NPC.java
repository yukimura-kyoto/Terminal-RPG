package Player_NPC;
import java.util.Random;

public class NPC {

    // Parte de Criação de NPC só seguir oq ta abaixo e seja feliz

    // Player_NPC.NPC
    // Player_NPC.stats = name, health, stamina, armor, dodge
    public static Stats[] npcs = {
            new Stats("Jaspian", 100, 50, 5, 10),
            new Stats("Raziel", 250, 125, 15, 15)
    };

    public static Random rd = new Random();

    public static Stats getRandomNPC() {
        return npcs[rd.nextInt(npcs.length)];
    }
}