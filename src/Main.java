import Player_NPC.NPC;
import Player_NPC.stats;

public class Main {
    public static void main(String[] args) {

        stats jaspian = NPC.Jaspian; // puxa o Player_NPC.NPC Jaspian

        System.out.println("Vida do Inimigo: "+jaspian.health);

        int dano = Attacks.rajadaCaotica();

        jaspian.health = jaspian.health-dano;

        System.out.println("O jogador causou " + dano + " de dano!");
        System.out.println("Vida do " +jaspian.name +" agora: " + jaspian.health);
    }
}