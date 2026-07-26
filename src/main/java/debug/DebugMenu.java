package debug;

import engine.scaling.LevelScaling;
import model.entities.Player;
import model.stats.Attributes;
import model.stats.DerivedAttributes;

public class DebugMenu {

    public static void testPlayerCreation(){
//        Menu.chooseStartingClass();
//
//        int choice = Input.nextInt();
//        StartingClass selectedClass = StartingClass.values()[choice - 1];
//
//        String name = Input.nextString("Enter your name: ");
//
//        Player player = new Player(name, selectedClass);
//
//        Attributes attributes = player.getAttributes();
//        DerivedAttributes stats = player.getDerivedAttributes();
//
//        DerivedAttributes.updateDerivedStats(attributes, stats);
//
//        stats.setCurrentHp(stats.getMaxHp());
//        stats.setCurrentFp(stats.getMaxFp());
//        stats.setCurrentEquipLoad(0);
//
//        stats.setRunes(Input.nextInt("How many runes? "));
//
//        DebugMenu.showStats(player);
    }


    public static void showStats(Player player) {

        Attributes attributes = player.getAttributes();
        DerivedAttributes derived = player.getDerivedAttributes();

        System.out.println("========== PLAYER DEBUG ==========");
        System.out.println();

        System.out.println("Class: " + player.getName());
        System.out.println("Level: " + attributes.getLevel());

        int nextLevelCost = LevelScaling.getRuneCost(attributes.getLevel());

        System.out.println("Runes: " + derived.getRunes());
        System.out.println("Next level cost: " + nextLevelCost + " runes");

        if (derived.getRunes() < nextLevelCost) {
            System.out.println("Missing: "
                    + (nextLevelCost - derived.getRunes())
                    + " runes");
        }

        System.out.println();

        System.out.println("Vigor: " + attributes.getVigor());
        System.out.println("Mind: " + attributes.getMind());
        System.out.println("Endurance: " + attributes.getEndurance());
        System.out.println("Strength: " + attributes.getStrength());
        System.out.println("Dexterity: " + attributes.getDexterity());
        System.out.println("Intelligence: " + attributes.getIntelligence());
        System.out.println("Faith: " + attributes.getFaith());
        System.out.println("Arcane: " + attributes.getArcane());

        System.out.println();

        System.out.println("HP: "
                + derived.getCurrentHp()
                + "/"
                + derived.getMaxHp());

        System.out.println("FP: "
                + derived.getCurrentFp()
                + "/"
                + derived.getMaxFp());

        // todo Stamina
        /*
        System.out.println("Stamina: "
                + derived.getCurrentStamina()
                + "/"
                + derived.getMaxStamina());
        */

        System.out.println("Equip Load: "
                + derived.getCurrentEquipLoad()
                + "/"
                + derived.getMaxEquipLoad()
                + " (" + derived.getRollType().getName() + ")");

        System.out.println();
        System.out.println("========== Level Up ==========");
        System.out.println();

        System.out.println("1 - Vigor");
        System.out.println("2 - Mind");
        System.out.println("3 - Endurance");
        System.out.println("4 - Strength");
        System.out.println("5 - Dexterity");
        System.out.println("6 - Intelligence");
        System.out.println("7 - Faith");
        System.out.println("8 - Arcane");

        System.out.println();
        System.out.println("0 - Exit");
        System.out.println("===============================");
    }
}