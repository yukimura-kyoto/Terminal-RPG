package world.events;

import player.Player;

public class EnemyEncounterEvent extends AreaEvent {


    @Override
    public void execute(Player player) {

        System.out.println(
                "A Lost Soldier appeared!"
        );

        // futuramente:
        // CombatEngine.start(player, enemy);

    }
}