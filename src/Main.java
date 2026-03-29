import Entity.base.Stats;
import Skills.Skills;
import Skills.Weapons;
import Menu.Menu;
import Entity.player.Player;
import Menu.Combat;

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
                ("Nick's Burguer",20,10,5,5,1,0);

        Jogador.equipWeapon(Weapons.Weapons_List.get(2)); // Arma padrao inicial, se quiser pode mudar depois

        // Set do Moveset padrao
        Jogador.moveset.add(Skills.moveset.get(0));
        Jogador.moveset.add(Skills.moveset.get(1));
        Jogador.moveset.add(Skills.moveset.get(2));
        Jogador.moveset.add(Skills.moveset.get(3));


        // Print dos Status do Entity.Entity.Player.Entity.Player
        Menu.printStatus(Jogador);

        //Teste combate
        Stats npc = randomNPC();
        Combat.InCombat(Jogador, npc);

        // eventoPausa();


    }
}