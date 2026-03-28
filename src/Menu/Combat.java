package Menu;

import Player_NPC.NPC;
import Player_NPC.Player;
import Player_NPC.Stats;
import Skills.Skills;
import Skills.Usavel;

import java.util.Scanner;

public class Combat {

    public static Scanner sc = new Scanner(System.in);
    public static boolean turno = true;

    public static void TurnoPlayer(Player player, Stats npc){

        // Era pra ser diferente, so que ai eu mandei meu codigo e o chat me bateu
        int escolha = sc.nextInt();

        if (escolha > 0 && escolha <= player.Player_Moveset.size()) {

            Usavel skill = player.Player_Moveset.get(escolha - 1);

            int dano = skill.usar(player);

            npc.health -= dano;

            IO.println("┌─────────────────────────────┐");
            IO.println("│ ⚔️  " + skill.getName() + "!");
            IO.println("├─────────────────────────────┤");
            IO.println("│ 💥 Dano causado: " + dano);
            IO.println("└─────────────────────────────┘");

        } else {
            IO.println("Escolha inválida");
        }
    }

    public static void TurnoNPC(Stats npc){
        IO.println("six seven"+npc.health);
    }

    public static void InCombat(Player player, Stats npc){

        while (player.health >0 && npc.health >0){
            if (turno){
                Menu.decisaoPlayer(player);
                TurnoPlayer(player,npc);
            }else if (!turno){
                TurnoNPC(npc);
            }
            turno = !turno;
        }
    }

}
