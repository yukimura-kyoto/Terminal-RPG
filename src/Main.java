import Inventory.Rituals;
import Menu.Start;
import Player_NPC.NPC;
import Player_NPC.Player;
import Player_NPC.Stats;

public class Main {
    public static void main(String[] args) {

        // Criando novo Jogador
        String N_Player = Start.inicio();
        Player Jogador = new Player
                (N_Player,20,10,5,5,1,0);

        // Print dos Status do Player
        Start.printStatus(Jogador);



































//        Stats jaspian = NPC.Jaspian; // puxa o Jaspian la dos NPC
//
//        System.out.println("Vida do Inimigo: "+jaspian.health);
//
//        int dano = Rituals.rajadaCaotica();
//
//        jaspian.health = jaspian.health-dano;
//
//        System.out.println("O jogador causou " + dano + " de dano!");
//        System.out.println("Vida do " +jaspian.name +" agora: " + jaspian.health);
    }
}