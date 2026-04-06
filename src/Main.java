import Entity.npc.NPC;
import Skills.Skills;
import Skills.Weapons;
import System.Menu;
import Entity.player.Player;
import System.Combat;

import static Entity.npc.npcs.NPCRegistry.getBossByIndex;
import static Entity.npc.npcs.NPCRegistry.getNPCByIndex;
import static System.Complement.checkLevelUp;
import static System.Events.*;
import static System.Menu.StartGame;

public class Main {
    public static void main(String[] args) {

        Skills.moveset.size(); // Sem isso tudo explode

        // Isso sempre fica ativo pra aparecer o Menu Inicial
        Player Jogador = StartGame();

// ------------------------------------------------------------------------------------------------------------------------------------
        // Isso starta o game normal
        while (Jogador.health>0){
            gameRandomEvent(Jogador);
        }
// ------------------------------------------------------------------------------------------------------------------------------------








// ------------------------------------------------------------------------------------------------------------------------------------
        // Sessão pra Debug/Testes

//        Hospital(Jogador);
        // teste capeta
//         Hexatombe(Jogador);


        //Teste combate
//        Combat.InCombat(Jogador, getBossByIndex(0));


//       Combat.InCombat(Jogador, getNPCByIndex(2));


    }
}