package Old.System;
import Old.Entity.npc.NPC;
import Old.Entity.player.Player;
import Old.Skills.Skills;
import Old.Skills.Weapons;
import Old.Skills.base.Usavel;

import java.util.Scanner;

import static Old.System.Combat.rd; // tomanocu kkkkkkkkkkk

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    // Literalmente o Inicio
    public static String inicio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao RPG ===");
        System.out.print("Digite o nome do seu personagem: ");

        String nome = scanner.nextLine(); // le o nome completo digitado
        System.out.println("Ola, " + nome + ", vamos comecar sua jornada\n");

        return nome; // retorna o nome digitado
    }

    // Printa 50 linhas em branco so pra dar a sensacao que limpo
    public static void Clear(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // cara nem sei porq criei isso é muita preguiça pro ser humano né kkkkk
    public static int opcaoInvalida(Scanner sc){
        System.out.println("Opção Invalida");
        return sc.nextInt();
    }

    // Print dos Status
    public static void printStatusPlayer(Player player) {
        System.out.println("===================================");
        System.out.println("          STATUS DO PLAYER         ");
        System.out.println("===================================");
        System.out.println("Nome: " + player.name);
        System.out.println("Nível: " + player.level + "    XP: " + player.xp);
        System.out.println("Vida: " + player.health);
        System.out.println("Stamina: " + player.stamina);
        System.out.println("Armadura: " + player.armadura);
        System.out.println("Arma equipada: " + player.currentWeapon.name);

        System.out.println("===================================\n");
    }

    // Print dos stats do NPC
    public static void printStatusNPC(NPC npc) {
        System.out.println("===================================");
        System.out.println("         STATUS DO INIMIGO         ");
        System.out.println("===================================\n");

        System.out.println("Nome: " + npc.name);
        System.out.println("Arma equipada: " + npc.currentWeapon.name+"\n");

        System.out.println("===================================\n");
    }

    // Sabour Moveset do Player
    public static void decisaoPlayer(Player player){
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│     ⚔️  SUAS HABILIDADES    │");
        System.out.println("└─────────────────────────────┘");
        for (int i = 0; i < player.moveset.size(); i++) {
            System.out.println((i + 1) + " - " + player.moveset.get(i).getName());
        }
        System.out.print("Escolha: ");
    }

    // um mini pause que o chat me deu pra deixar mais bonito
    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Chat fez isso pra deixar aura+ego o Diabo
    public class GlitchEffect {

        public static void playGlitch() throws InterruptedException {

            String[] lines = {
                    "█▓▒░ ERROR: CHOICE_NOT_FOUND ░▒▓█",
                    "",
                    "> validating decision...",
                    "> validating decision...",
                    "> validating decision...",
                    "",
                    "✖ result: FALSE",
                    "",
                    "> rewriting outcome...",
                    "",
                    "█▒░▌▌▌▌▌▌▌▌▌░▒█",
                    "▒█>>> D3S1R3_D3T3CT3D",
                    "▒█>>> P4CT_L1NK_3ST4BL1SH3D",
                    "▒█>>> OV3RR1D3: FR33_W1LL",
                    "",
                    "...",
                    "",
                    "> you cannot refuse",
                    "",
                    "...",
                    "",
                    "█▓▒░ CONNECTION PERSISTENT ░▒▓█"
            };

            for (String line : lines) {
                typeLine(line, 10);
                Thread.sleep(100);
            }
        }

        private static void typeLine(String text, int delay) throws InterruptedException {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                Thread.sleep(delay);
            }
            System.out.println();
        }
    }

    // aaahhh menu pra comecar o jogo
    public static Player StartGame(){
        Player Jogador = null;
        System.out.println("===================================\n"+
                "1 - Novo Jogo\n"+
                "2 - Carregar Jogo\n"+
                "3 - Sair\"");
        int m = sc.nextInt();
        sc.nextLine(); // limpa o \n do buffer
        // isso nao faz sentido mas se funcionar é good game

        switch (m){
            case 1:
                // Isso pega o nome do jogador
                System.out.println("Qual seu nome Jogador?");
                String P_Name = sc.nextLine();

                // tenho q resolver os stats depois mano ta muito desbalanceado
                Jogador = new Player(P_Name, 99999, 40, 5, 5, 1, 0,50);
                Jogador.equipWeapon(Weapons.Weapons_List.get(0)); // Arma Inicial e um soco lol
                Jogador.moveset.add(Skills.moveset.get(0)); // Primeira Skill e um ataque leve lol

                // Gracias Chat, mas de acordo com oq ele diz ele pega uma skill aleatoria pra ser a segunda
                // e a skill nunca vai ser igual a skill inicial
                Usavel segundaSkill;
                do {
                    segundaSkill = Skills.moveset.get(rd.nextInt(Skills.moveset.size()));
                } while (Jogador.moveset.contains(segundaSkill));
                Jogador.moveset.add(segundaSkill);
                SaveSystem.salvarPlayer(Jogador); // salva logo ao criar
                printStatusPlayer(Jogador);
                break;
            case 2:
                // Isso carrega o save do txt
                Jogador = SaveSystem.carregarPlayer();
                printStatusPlayer(Jogador);
                break;
            case 3:
                System.out.println("é sério isso cara?");
                pause(2500);
                System.exit(1);
                break;
            default: opcaoInvalida(sc);
        }

        return Jogador;
    }


}