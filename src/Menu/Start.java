package Menu;


import Player_NPC.Player;

import java.util.Scanner;

public class Start {

    // Literalmente o Inicio
    public static String inicio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao RPG ===");
        System.out.print("Digite o nome do seu personagem: ");

        String nome = scanner.nextLine(); // le o nome completo digitado
        System.out.println("Ola, " + nome + ", vamos comecar sua jornada\n");

        return nome; // retorna o nome digitado
    }

    // Print dos Status
    public static void printStatus(Player player) {
        System.out.println("===================================");
        System.out.println("          STATUS DO PLAYER         ");
        System.out.println("===================================");
        System.out.println("Nome: " + player.name);
        System.out.println("Nível: " + player.level + "    XP: " + player.xp);
        System.out.println("Vida: " + player.health);
        System.out.println("Stamina: " + player.stamina);
        System.out.println("Armadura: " + player.armadura);

        System.out.println("===================================\n");
    }


    // mensagem de ataque
    public static void printAtaque(String atacante, int dano, String alvo) {
        System.out.println(atacante + " causou " + dano + " de dano em " + alvo + "!");
    }

}