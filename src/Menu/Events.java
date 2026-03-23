package Menu;

import Player_NPC.NPC;
import Player_NPC.Player;
import Player_NPC.Stats;

import static Menu.Combat.*;

public class Events {


    public static void randomNPC(){

        Stats npc = NPC.getRandomNPC();
        System.out.println("Você encontrou: " + npc.name);
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

}
