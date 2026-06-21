import debug.DebugMenu;
import model.entities.Player;

import java.util.Scanner;

import static model.stats.Attributes.spendRunesToLevelUp;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player player = new Player("Vagabond");

        // Classe inicial Vagabond
        player.getAttributes().setVigor(15);
        player.getAttributes().setMind(10);
        player.getAttributes().setEndurance(11);
        player.getAttributes().setStrength(14);
        player.getAttributes().setDexterity(13);
        player.getAttributes().setIntelligence(9);
        player.getAttributes().setFaith(9);
        player.getAttributes().setArcane(7);

        // Atualiza HP, FP, Equip Load
        player.updateStats();

        // Debug
        player.getStats().setRunes(999_999_999);

        while (true) {

            DebugMenu.showStats(player);

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setVigor(player.getAttributes().getVigor() + 1);
                    }
                    break;

                case 2:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setMind(player.getAttributes().getMind() + 1);
                    }
                    break;

                case 3:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setEndurance(player.getAttributes().getEndurance() + 1);
                    }
                    break;

                case 4:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setStrength(player.getAttributes().getStrength() + 1);
                    }
                    break;

                case 5:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setDexterity(player.getAttributes().getDexterity() + 1);
                    }
                    break;

                case 6:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setIntelligence(player.getAttributes().getIntelligence() + 1);
                    }
                    break;

                case 7:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setFaith(player.getAttributes().getFaith() + 1);
                    }
                    break;

                case 8:
                    if (spendRunesToLevelUp(player.getAttributes(), player.getStats())) {
                        player.getAttributes()
                                .setArcane(player.getAttributes().getArcane() + 1);
                    }
                    break;

                case 0:
                    System.out.println("Exiting debug menu...");
                    return;

                default:
                    System.out.println("Invalid option!");
            }

            // Recalcula depois de qualquer mudança
            player.updateStats();
        }
    }
}