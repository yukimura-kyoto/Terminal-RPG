package Old.System;

import Old.Entity.player.Player;

public class Complement {

    public static void typeText(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // quebra linha no final
    }


    public static void checkLevelUp(Player player) {
        while (player.xp >= player.xpToNext) {
            player.xp -= player.xpToNext;
            player.level++;

            player.health += player.level*10;
            player.stamina += player.level*5;

            System.out.println("Voce subiu para o nivel " + player.level + "!");

            // aumenta dificuldade do próximo level
            player.xpToNext += 50;
        }
    }

}
