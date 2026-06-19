import debug.DebugMenu;
import engine.scaling.EnduranceScaling;
import engine.scaling.MindScaling;
import engine.scaling.VigorScaling;
import model.stats.Attributes;
import model.stats.DerivedAttributes;

import java.util.Scanner;

import static model.stats.Attributes.spendRunesToLevelUp;
import static model.stats.DerivedAttributes.updateDerivedStats;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Attributes player = new Attributes("Vagabond");
        DerivedAttributes stats = new DerivedAttributes();

        // Attributes from Vagabond Class to test it out

        // Initial Level 9

        player.setVigor(15);
        player.setMind(10);
        player.setEndurance(11);
        player.setStrength(14);
        player.setDexterity(13);
        player.setIntelligence(9);
        player.setFaith(9);
        player.setArcane(7);

        // Set Max

        stats.setMaxHp(VigorScaling.getHP(player.getVigor()));
        stats.setMaxFp(MindScaling.getFP(player.getMind()));
        stats.setMaxEquipLoad(EnduranceScaling.getEquipLoad(player.getEndurance()));
        stats.setRunes(999_999_999); // ahh debug

        // cálculos de scaling aqui...
        stats.setCurrentHp(stats.getMaxHp());
        stats.setCurrentFp(stats.getMaxFp());
        stats.setCurrentEquipLoad(500);

        while (true) {

            updateDerivedStats(player, stats);
            DebugMenu.showStats(player, stats);

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setVigor(player.getVigor() + 1);
                    }
                    break;

                case 2:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setMind(player.getMind() + 1);
                    }
                    break;

                case 3:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setEndurance(player.getEndurance() + 1);
                    }
                    break;

                case 4:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setStrength(player.getStrength() + 1);
                    }
                    break;

                case 5:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setDexterity(player.getDexterity() + 1);
                    }
                    break;

                case 6:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setIntelligence(player.getIntelligence() + 1);
                    }
                    break;

                case 7:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setFaith(player.getFaith() + 1);
                    }
                    break;

                case 8:
                    if (spendRunesToLevelUp(player, stats)) {
                        player.setArcane(player.getArcane() + 1);
                    }
                    break;

                case 0:
                    System.out.println("Exiting debug menu...");
                    return;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}