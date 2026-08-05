package world.events;

import player.Player;

public final class EventManager {


    private EventManager(){}


    public static void trigger(
            AreaEvent event,
            Player player
    ){

        event.execute(player);

    }

}