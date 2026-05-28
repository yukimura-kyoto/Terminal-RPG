package Old.System;

import Old.Entity.npc.NPC;
import Old.Entity.player.Player;
import Old.Skills.base.Usavel;

import java.util.Random;
import java.util.Scanner;

import static Old.System.Complement.checkLevelUp;
import static Old.System.Menu.*;

public class Combat {

    public static Scanner sc = new Scanner(System.in);
    public static boolean turno = true;
    public static Random rd = new Random();

    public static void TurnoPlayer(Player player, NPC npc){

        int escolha = sc.nextInt();

        if (escolha > 0 && escolha <= player.moveset.size()) {

            Usavel skill = player.moveset.get(escolha - 1);

            if (npc.estaEsquivando) {
                npc.estaEsquivando = false;
                IO.println("┌─────────────────────────────┐");
                IO.println("│ 💨 " + npc.name + " esquivou!");
                IO.println("└─────────────────────────────┘");
                pause(2000);
                Clear();
                return;
            }

            int dano = skill.usar(player);
            npc.health -= dano;

            IO.println("┌─────────────────────────────┐");
            IO.println("│ ⚔️  " + skill.getName() + "!");
            IO.println("├─────────────────────────────┤");
            IO.println("│ 💥 Dano causado: " + dano);
            IO.println("└─────────────────────────────┘\n");

        } else {
            IO.println("Escolha inválida");
        }
        pause(2000);
        Clear();
    }

    public static void TurnoNPC(NPC npc, Player player){
        Usavel skill = npc.escolherSkill(player);

        int dano = skill.usar(npc);
        player.health -= dano;
        npc.health += npc.curaPassiva;

        IO.println("┌─────────────────────────────┐");
        IO.println("│ 👹 " + npc.name + " ataca!");
        IO.println("├─────────────────────────────┤");
        IO.println("│ 💀 " + skill.getName() + "!");
        IO.println("├─────────────────────────────┤");
        IO.println("│ 🩸 Dano sofrido: " + dano);
        IO.println("└─────────────────────────────┘\n");
        pause(3000);

        AtaquesDiferenciados(player, npc);

        Clear();
    }

    public static void InCombat(Player player, NPC npc){
        while (player.health > 0 && npc.health > 0){
            if (turno){
                Menu.printStatusPlayer(player);
                Menu.decisaoPlayer(player);
                TurnoPlayer(player, npc);
            } else {
                printStatusNPC(npc);
                TurnoNPC(npc, player);
            }
            turno = !turno;
        }

        if (player.health<=0){
            IO.println("Voce Morreu para o "+npc.name);
        }else if (npc.health<=0&&player.health>0){
            pause(1000);
            IO.println("Voce Venceu do "+npc.name);
            pause(1000);
            player.xp = player.xp+ npc.xpDrop;
            IO.println("XP Ganho");
            pause(1000);
            IO.println(npc.xpDrop);
            pause(1000);
            checkLevelUp(player);
            turno=true;
        }
    }

    public static void AtaquesDiferenciados(Player player, NPC npc){

        // Succ te suga e joga de novo porq ele pode
        if (npc.Sugando) {
            IO.println("┌─────────────────────────────┐");
            IO.println("│ 💨 " + npc.name + " te Sugou com força!");
            IO.println("│ "+npc.name+" vai atacar novamente");
            IO.println("└─────────────────────────────┘");
            turno = !turno;
            npc.Sugando=false;
            pause(3000);
            Clear();
            return;
        }
    }

}
