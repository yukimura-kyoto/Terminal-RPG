package Menu;

import Player_NPC.NPC;
import Player_NPC.Player;
import Player_NPC.Stats;

import static Menu.Combat.*;

public class Events {

    public static boolean jogoRodando = true;


    public static Stats randomNPC(){

        Stats npc = NPC.getRandomNPC();
        System.out.println("Você encontrou: " + npc.name);
        return npc;
    }

    public static void combat(Player player, Stats npc){
        while (npc.health > 0 && player.health > 0) {

            if (!turno) {
                turnoPlayer(player, npc);
            } else {
                turnoNPC(player, npc);
            }

        }
    }

    public static void eventoPausa() {

        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ ⏸️  O TEMPO PAROU...        │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ Tudo fica em silêncio.");
        System.out.println("│ Algo estranho está no ar...");
        System.out.println("└─────────────────────────────┘");
    }

    public static void randomEvent(Player player) {
        double chance = Math.random();

        if (chance < 0.5) {
            while (jogoRodando) {

                int evento = (int) (Math.random() * 2) + 1;
                if (player.health > 0) {
                    switch (evento) {

                        case 1:
                            System.out.println("⚔️ Combate!");
                            Stats npc = NPC.getRandomNPC();

                            Combat.startCombat(player, npc);

                            break;

                        case 2:
                            Events.eventoPausa();

                            break;
                    }
                }
            }
        }
    }

}
