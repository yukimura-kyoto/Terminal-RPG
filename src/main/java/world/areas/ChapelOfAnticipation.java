package world.areas;

import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import player.Player;
import world.Area;
import world.AreaAction;
import world.AreaId;
import world.AreaManager;

import java.util.List;

public class ChapelOfAnticipation extends Area {


    public ChapelOfAnticipation() {

        super(AreaId.CHAPEL_OF_ANTICIPATION, "Chapel of Anticipation", """
                You awaken inside a ruined chapel.
                
                The salty wind enters through broken walls.
                A massive wooden door stands before you.
                """);

    }


    @Override
    public List<AreaAction> getActions(MultiWindowTextGUI gui, BasicWindow window, Player player) {

        return List.of(

                new AreaAction("Open the door", () -> AreaManager.enter(new ChapelOutside(), gui, window, player))

        );
    }
}