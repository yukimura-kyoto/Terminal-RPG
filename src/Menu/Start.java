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

    public static void printAtaquePlayer(Player player){

        int dano = Ataques.ataqueLeve(player); // precisa disso

        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ ⚔️  " + player.name + " atacou com " + player.currentWeapon.name);
        System.out.println("│                             │");
        System.out.println("│ 💥 Dano causado: " + dano);
        System.out.println("└─────────────────────────────┘");
    }

}