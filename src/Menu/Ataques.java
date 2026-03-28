package Menu;

import Player_NPC.Player;
import java.util.Random;

public abstract class Ataques {

    public static Random rd = new Random();

    public static int ataqueLeve(Player player) {

        // pega o dano da arma equipada
        int danoMin = player.currentWeapon.danoMin;
        int danoMax = player.currentWeapon.danoMax;

        // calcula dano aleatório dentro do range da arma
        int dano = rd.nextInt(danoMin,danoMax);

        // o rd.nextDouble ja vai de 0 ate 1 pra fazer o calc do crit
        if (rd.nextDouble() < player.currentWeapon.critChance) {
            dano = (int) (dano*player.currentWeapon.critMult);
            System.out.println("CRÍTICO!");
        }

        return dano;
    }

    public static int ataqueDuplo(Player player) {

        String nomeAtaque = "Ataque Duplo";
        String descricao = "Cortou o Inimigo!";

        // pega o dano da arma equipada
        int danoMin = player.currentWeapon.danoMin*2;
        int danoMax = player.currentWeapon.danoMax*2;

        // calcula dano aleatório dentro do range da arma
        int dano = rd.nextInt(danoMin,danoMax);

        // o rd.nextDouble ja vai de 0 ate 1 pra fazer o calc do crit
        if (rd.nextDouble() < player.currentWeapon.critChance) {
            dano = (int) (dano*player.currentWeapon.critMult);
            System.out.println("CRÍTICO!");
        }

        return dano;
    }

}