package world.areas;

import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import player.Player;
import world.Area;
import world.AreaAction;
import world.AreaId;
import world.AreaManager;
import world.events.EnemyEncounterEvent;
import world.events.EventManager;

import java.util.List;

public class ChapelOutside extends Area {


    public ChapelOutside() {

        super(AreaId.CHURCH_OF_ELLEH, "Outside the Chapel", """
                You step outside the ruined chapel.
                
                The sea stretches before you.
                A strange light can be seen in the distance.
                """);

    }


    @Override
    public List<AreaAction> getActions(MultiWindowTextGUI gui, BasicWindow window, Player player) {

        return List.of(

                new AreaAction("Explore", () -> EventManager.trigger(new EnemyEncounterEvent(), player)),
                new AreaAction("Return to the chapel", () -> AreaManager.enter(new ChapelOfAnticipation(), gui, window, player))

        );
    }
}