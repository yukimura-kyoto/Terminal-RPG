import Entity.base.Stats;
import Entity.npc.NPC;
import Skills.Skills;
import Skills.Weapons;
import Menu.Menu;
import Entity.player.Player;
import Menu.Combat;

import static Menu.Events.gameRandomEvent;
import static Menu.Events.randomNPC;

public class Main {
    public static void main(String[] args) {

        Skills.moveset.size(); // Sem isso tudo explode

        // Tem que tirar isso de comentario depois
        // Criando novo Jogador

        //String N_Player = Start.inicio();
        //Entity.Entity.Player.Entity.Player Jogador = new Entity.Entity.Player.Entity.Player
        //        (N_Player,20,10,5,5,1,0);

        Player Jogador = new Player
                ("Nick's Burguer",9999,10,5,5,1,0);

        Jogador.equipWeapon(Weapons.Weapons_List.get(2)); // Arma padrao inicial, se quiser pode mudar depois

        // Set do Moveset padrao
        Jogador.moveset.add(Skills.moveset.get(0));
        Jogador.moveset.add(Skills.moveset.get(1));
        Jogador.moveset.add(Skills.moveset.get(2));
        Jogador.moveset.add(Skills.moveset.get(9));


        // Print dos Status do Entity.Entity.Player.Entity.Player
        Menu.printStatusPlayer(Jogador);

        while (Jogador.health>0){
            gameRandomEvent(Jogador);
        }

        //Teste combate
//        NPC npc = randomNPC();
//        Combat.InCombat(Jogador, npc);

        // eventoPausa();


    }
}