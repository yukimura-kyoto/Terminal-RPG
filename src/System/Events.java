package System;

import Entity.npc.NPC;
import Entity.npc.npcs.NPCRegistry;
import Entity.player.Player;

import java.util.Scanner;
import System.Menu.GlitchEffect;
import Skills.base.Usavel;
import Skills.Weapons;
import Skills.Skills;

import static System.Combat.rd;
import static System.Complement.typeText;
import static System.Menu.*;

public class Events {

    public static Scanner sc = new Scanner(System.in);
    public static int DesicaoCapeta;
    public static boolean valido = false;

    public static NPC randomNPC() {
        Clear();
        NPC npc = NPCRegistry.getRandomNPC();
        System.out.println("Um inimigo aparece nas sombras...");
        pause(1500);
        System.out.println("É... " + npc.name + "!");
        pause(2000);
        return npc;
    }

    public static void eventoPausa() {

        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ ⏸️  O TEMPO PAROU...        │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ Tudo fica em silêncio.");
        System.out.println("│ Algo estranho está no ar...");
        System.out.println("└─────────────────────────────┘");
        pause(2500);
    }

    public static void Hexatombe(Player player){
        boolean respostaValida = false;

        System.out.println("Voce ve uma figura vermelha, sorrindo em sua direção");
        pause(2500);
        System.out.println("Ele era alto, diferente de qualquer humano já visto");
        pause(2500);
        System.out.println("O Sorriso dele era contagioso, quanto mais você olhava, mais queria sorrir junto dele");
        pause(2500);
        System.out.println("O Diabo: Eu vim te oferecer um pacto.");
        pause(2500);
        System.out.println("1 - Recusar o Pacto com O Diabo");
        System.out.println("2 - Aceitar");
        // Esperar pela decisao do player
        System.out.print("Escolha: ");
        DesicaoCapeta = sc.nextInt();
        System.out.println();

        while (!respostaValida){
            switch (DesicaoCapeta){
                case 1:

                    System.out.println("O Diabo observa você em silêncio por alguns segundos.");
                    pause(2500);
                    System.out.println("O sorriso dele… não some. Só cresce.\n");
                    pause(2000);
                    System.out.println("O Diabo: Ah… então você recusou.");
                    pause(2500);
                    System.out.println("O Diabo: Você já quis. Já desejou. Eu sei bem disso");
                    pause(2500);
                    System.out.println("O Diabo: EU ouvi.");
                    pause(2500);
                    System.out.println("O Diabo: Mas tudo bem.");
                    pause(2500);
                    System.out.println("O Diabo: Tudo bem se voce sair vivo.");
                    pause(2500);
                    try {
                        GlitchEffect.playGlitch();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    NPC npc = NPCRegistry.getBossByIndex(0); // isso puxa o diabo pelo getboss
                    Combat.InCombat(player, npc);


                    respostaValida = true;
                    break;
                case 2:
                    aceitarDiabo(player);
                    respostaValida = true;

                    System.out.println("Eu e meu associado esperamos por voce");
                    pause(2500);
                    break;

                default: opcaoInvalida(sc);
            }
        }
    }

    public static void aceitarDiabo(Player player){
        System.out.println("1 - Arma Aleatoria\n"+
                "2 - Skill Aleatorio\n"+
                "3 - Vida\n"+
                "4 - Stamina\n");
        System.out.println("O Diabo: faca sua escolha garoto(a).");
        System.out.print("Escolha: ");
        int i = sc.nextInt();
        System.out.println();
        switch (i){
            case 1:
                // Isso troca a arma atual por uma arma aleatoria
                player.equipWeapon(Weapons.Weapons_List.get(rd.nextInt(Weapons.Weapons_List.size())));
                player.health = player.health-(player.health/5);
                break;
            case 2:
                // Gracias chat por fazer isso por mim
                player.stamina = player.stamina - (player.stamina / 5);

                Usavel novaSkill;
                do {
                    novaSkill = Skills.moveset.get(rd.nextInt(Skills.moveset.size()));
                } while (player.moveset.contains(novaSkill));

                System.out.println("O Diabo: Eu lhe concedo... " + novaSkill.getName() + ".\n");
                pause(2000);

                // 👇 VERIFICA LIMITE
                if (player.moveset.size() < 4) {

                    player.moveset.add(novaSkill);
                    System.out.println("Você aprendeu " + novaSkill.getName() + "!");

                } else {

                    System.out.println("============================================");
                    System.out.println("O Diabo: Qual skill voce deseja substituir?");

                    for (int j = 0; j < player.moveset.size(); j++) {
                        System.out.println((j + 1) + " - " + player.moveset.get(j).getName());
                    }

                    int escolha = sc.nextInt();

                    if (escolha > 0 && escolha <= player.moveset.size()) {
                        player.moveset.set(escolha - 1, novaSkill);
                        System.out.println("O Diabo: " + novaSkill.getName() + " agora e seu.");
                    } else {
                        System.out.println("Escolha invalida.");
                    }
                }

                break;

            case 3: //
                System.out.println("O Diabo: Quanta Stamina voce gostaria de Sacrificar para a sua Gloria?");

                while (true) {
                    int a = sc.nextInt();

                    if (a > 0 && player.stamina >= a) {
                        player.health += a;
                        player.stamina -= a;
                        break;
                    } else {
                        System.out.println("Valor invalido.");
                    }
                }
                break;

            case 4: //
                System.out.println("O Diabo: Quanto de sua Vida voce gostaria de Sacrificar para a sua Graça?");
                while (true) {
                    int b = sc.nextInt();

                    if (b > 0 && player.health >= b) {
                        player.stamina += b;
                        player.health -= b;
                        break;
                    } else {
                        System.out.println("Valor invalido.");
                    }
                }
                break;

                }
    }

    // todo aaahhh tenho q resolver isso depois
    public static void Hospital(Player player){
        typeText("Você encontra um hospital abandonado.\n" +
                "\n" +
                "As luzes piscam.\n" +
                "O silêncio é pesado demais para um lugar assim.\n" +
                "\n" +
                "O cheiro de desinfetante ainda está no ar...\n" +
                "Mas algo não parece certo.",100);

        System.out.println("1 - Entrar\n" +
                "2 - Ir embora");

        int a = sc.nextInt();

        switch (a){
            case 1:
                break;
            case 2:
                break;
            default: opcaoInvalida(sc);

        }
    }

    public static void gameRandomEvent(Player player){
        int gameEvent = rd.nextInt(3)+1;

        switch (gameEvent){
            case 1:
                NPC npc = randomNPC();
                Combat.InCombat(player, npc);
                break;
            case 2:
                eventoPausa();
                break;
            case 3:
                Hexatombe(player);
                break;
        }

        SaveSystem.salvarPlayer(player);
    }
}
