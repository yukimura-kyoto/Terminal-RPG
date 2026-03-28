package Menu;
import Player_NPC.Player;
import java.util.Scanner;

public class Menu {

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
        System.out.println("Arma equipada: " + player.currentWeapon.name);

        System.out.println("===================================\n");
    }

    // Sabour quase inutil
    public static void decisaoPlayer(Player player){
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│     ⚔️  SUAS HABILIDADES    │");
        System.out.println("└─────────────────────────────┘");
        for (int i = 0; i < player.Player_Moveset.size(); i++) {
            System.out.println((i + 1) + " - " + player.Player_Moveset.get(i).getName());
        }
        System.out.print("Escolha: ");
    }



}