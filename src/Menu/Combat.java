package Menu;

import Player_NPC.Player;
import Player_NPC.Stats;

import java.util.Scanner;

public class Combat {

    public static Scanner sc = new Scanner(System.in);
    // Turno do Player
    public static void turnoPlayer(Player player, Stats npc) {

        Start.decisaoPlayer();

        int escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                int dano = Ataques.ataqueLeve(player);
                npc.health -= dano;
                System.out.println("Você usou Ataque Leve e causou " + dano);
                break;

            case 2:
                int dano2 = Ataques.ataqueDuplo(player);
                npc.health -= dano2;
                System.out.println("Você usou Ataque Duplo e causou " + dano2);
                break;

            case 3:
                System.out.println("Você se defendeu!");
                break;

            case 4:
                System.out.println("Você fugiu!");
                Events.randomEvent(player);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        // ao fim do turno do player isso troca pro turno do inimigo
        turno = false;
    }

    // Turno do NPC
    public static void turnoNPC(Player player, Stats npc) {

        int dano = 5;

        System.out.println("NPC causou " + dano);

        // turno volta pro player
        turno = false;

        Start.printStatus(player);
    }

    public static boolean turno = true;

    public static void startCombat(Player player, Stats npc) {

        while (npc.health > 0 && player.health > 0) {

            if (turno) {
                turnoPlayer(player, npc);
            } else {
                turnoNPC(player, npc);
            }

        }
    }

    public static void verifyRoundEnd(Player player, Stats npc){
        if (npc.health <= 0 && player.health > 0) {
            System.out.println("Você venceu!");
        } else if(npc.health > 1){
            System.out.println("Você morreu...");
        }
    }

}
