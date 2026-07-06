package util.ui;

import model.enums.StartingClass;

public class Menu {

    public static void mainMenu(){

        MainMenu menu = new MainMenu();

        while (true) {
            System.out.print("\n".repeat(50));

            System.out.println("\n" +
                    " ██████╗ ██████╗  █████╗  █████╗ ███████╗  ██████╗ ██████╗  █████╗      ██╗███████╗ █████╗ ████████╗\n" +
                    "██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██╔════╝  ██╔══██╗██╔══██╗██╔══██╗     ██║██╔════╝██╔══██╗╚══██╔══╝\n" +
                    "██║  ██╗ ██████╔╝███████║██║  ╚═╝█████╗    ██████╔╝██████╔╝██║  ██║     ██║█████╗  ██║  ╚═╝   ██║   \n" +
                    "██║  ╚██╗██╔══██╗██╔══██║██║  ██╗██╔══╝    ██╔═══╝ ██╔══██╗██║  ██║██╗  ██║██╔══╝  ██║  ██╗   ██║   \n" +
                    "╚██████╔╝██║  ██║██║  ██║╚█████╔╝███████╗  ██║     ██║  ██║╚█████╔╝╚█████╔╝███████╗╚█████╔╝   ██║   \n" +
                    " ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚════╝ ╚══════╝  ╚═╝     ╚═╝  ╚═╝ ╚════╝  ╚════╝ ╚══════╝ ╚════╝    ╚═╝   ");
            System.out.println("\n" +
                    "------------------------------------------------------------------------------------------------------------");
            menu.draw();

            System.out.println(
                    "------------------------------------------------------------------------------------------------------------\n" +
                    "                                                                          (W to go UP, S to go Down, E Select)");

            String input = Input.nextString().toLowerCase();

            switch (input) {

                case "w" -> menu.moveUp();

                case "s" -> menu.moveDown();

                case "e" -> {
                    return;
                }

                default -> System.out.println("Comando inválido!");
            }
        }
    }

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