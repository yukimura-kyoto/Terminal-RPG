package Menu;

import Player_NPC.NPC;
import Player_NPC.Player;
import Player_NPC.Stats;

public class Events {

    public static Stats randomNPC(){

        Stats npc = NPC.getRandomNPC();
        System.out.println("Você encontrou: " + npc.name);
        return npc;
    }

    public static void eventoPausa() {

        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ ⏸️  O TEMPO PAROU...        │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ Tudo fica em silêncio.");
        System.out.println("│ Algo estranho está no ar...");
        System.out.println("└─────────────────────────────┘");
    }

}
