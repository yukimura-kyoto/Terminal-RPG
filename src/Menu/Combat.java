package Menu;

import Entity.player.Player;
import Entity.base.Stats;
import Skills.Usavel;

import java.util.Random;
import java.util.Scanner;

public class Combat {

    public static Scanner sc = new Scanner(System.in);
    public static boolean turno = true;
    public static Random rd = new Random();

    public static void TurnoPlayer(Player player, Stats npc){

        // Era pra ser diferente, so que ai eu mandei meu codigo e o chat me bateu
        int escolha = sc.nextInt();

        if (escolha > 0 && escolha <= player.moveset.size()) {

            Usavel skill = player.moveset.get(escolha - 1);

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

    public static void TurnoNPC(Stats npc,Player player){
        Usavel skill = npc.moveset.get(rd.nextInt(npc.moveset.size()));

        System.out.println(npc.name + " usou " + skill.getName());

        int dano = skill.usar(player);
        System.out.println("Causou " + dano + " de dano!");
    }

    public static void InCombat(Player player, Stats npc){

        while (player.health >0 && npc.health >0){
            if (turno){
                Menu.decisaoPlayer(player);
                TurnoPlayer(player,npc);
            }else if (!turno){
                TurnoNPC(npc, player);
            }
            turno = !turno;
        }

        if (player.health<=0){
            IO.println("Voce Morreu para o "+npc.name);
        }else if (npc.health<=0&&player.health>0){
            IO.println("Voce Venceu do "+npc.name);
        }
    }

}
