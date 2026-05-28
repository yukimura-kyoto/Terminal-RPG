package Old;

import Old.Skills.Skills;
import Old.Entity.player.Player;

import static Old.System.Events.*;
import static Old.System.Menu.StartGame;

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