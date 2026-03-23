package Menu;

import Player_NPC.Player;
import Player_NPC.Stats;

public class Combat {

    // Turno do Player
    public static void turnoPlayer(Player player, Stats npc) {

        int dano = Ataques.ataqueLeve(player);
        npc.health -= dano;

        System.out.println("Você causou " + dano);

        turno = true;
    }

    // Turno do NPC
    public static void turnoNPC(Player player, Stats npc) {

        int dano = 5;
        player.health -= dano;

        System.out.println("NPC causou " + dano);

        turno = false;
    }

    public static boolean turno = false;

    public static void startCombat(Player player, Stats npc) {

        while (npc.health > 0 && player.health > 0) {

            if (!turno) {
                turnoPlayer(player, npc);
            } else {
                turnoNPC(player, npc);
            }

        }

        if (npc.health <= 0) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você morreu...");
        }
    }

}
