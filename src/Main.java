import engine.scaling.VigorScaling;
import model.entities.BaseStats;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        BaseStats player = new BaseStats("Leyley");

        player.setVigor(40);

        int hp = VigorScaling.getHP(player.getVigor());

        player.setMaxHp(hp);
        player.setCurrentHp(hp);

        while(true){

            System.out.println("Vigor: "+player.getVigor()+"\n");

            System.out.println(player.getCurrentHp() + "/" + player.getMaxHp());

            System.out.println("1 - Tomar Dano (1-50)\n" +
                    "2 - Cura (1-50)");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    int dano = rd.nextInt(50)+1;

                    player.setCurrentHp(player.getCurrentHp()-dano);
                    break;
                case 2:
                    int cura = rd.nextInt(50);
                    player.setCurrentHp(player.getCurrentHp()+cura);
                    break;
                default:
            }

        }

    }
}