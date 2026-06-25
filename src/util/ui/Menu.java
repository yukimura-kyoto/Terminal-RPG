package util.ui;

import model.enums.StartingClass;

public class Menu {

    public static void chooseStartingClass() {

        System.out.println("========== CHOOSE YOUR CLASS ==========\n");

        int option = 1;

        for (StartingClass startingClass : StartingClass.values()) {
            System.out.printf(
                    "%d - %s (Level %d)%n",
                    option++,
                    startingClass.getName(),
                    startingClass.getLevel()
            );
        }

        System.out.println("\n=======================================");
    }
}