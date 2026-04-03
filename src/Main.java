import Skills.Skills;
import Skills.Weapons;
import System.Menu;
import Entity.player.Player;

import static System.Events.*;
import static System.Menu.StartGame;

public class Main {
    public static void main(String[] args) {

        Skills.moveset.size(); // Sem isso tudo explode

        // Tem que tirar isso de comentario depois
        // Criando novo Jogador

//        Player Jogador = new Player
//                ("Nick's Burguer",9999,10,5,5,1,0);
//
//        Jogador.equipWeapon(Weapons.Weapons_List.get(2)); // Arma padrao inicial, se quiser pode mudar depois
//
//        // Set do Moveset padrao
//        Jogador.moveset.add(Skills.moveset.get(0));
//        Jogador.moveset.add(Skills.moveset.get(1));
//        Jogador.moveset.add(Skills.moveset.get(2));
//        Jogador.moveset.add(Skills.moveset.get(9));


        // Print dos Status do Entity.Entity.Player.Entity.Player
//        Menu.printStatusPlayer(Jogador);

        StartGame();

        // teste capeta
        // Hexatombe(Jogador);

//        while (Jogador.health>0){
//            gameRandomEvent(Jogador);
//        }

        //Teste combate
//       NPC npc = randomNPC();
//       Combat.InCombat(Jogador, npc);

        // eventoPausa();


    }
}