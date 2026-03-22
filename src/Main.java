import Inventory.Weapons;
import Menu.Start;
import Player_NPC.Player;

public class Main {
    public static void main(String[] args) {


        // Tem que tirar isso de comentario depois
        // Criando novo Jogador

        //String N_Player = Start.inicio();
        //Player Jogador = new Player
        //        (N_Player,20,10,5,5,1,0);

        Player Jogador = new Player
                ("Nick's Burguer",20,10,5,5,1,0);

        Jogador.equipWeapon(Weapons.Soco); // Arma padrao inicial, se quiser pode mudar depois


        // Print dos Status do Player
        Start.printStatus(Jogador);


































//        Stats jaspian = NPC.Jaspian; // puxa o Jaspian la dos NPC
//
//        System.out.println("Vida do Inimigo: "+jaspian.health);
//
//        int dano = Rituals.rajadaCaotica();
//
//        jaspian.health = jaspian.health-dano;
//
//        System.out.println("O jogador causou " + dano + " de dano!");
//        System.out.println("Vida do " +jaspian.name +" agora: " + jaspian.health);
    }
}