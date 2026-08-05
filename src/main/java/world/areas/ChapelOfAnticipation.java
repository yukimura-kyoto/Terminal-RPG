package world.areas;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import player.Player;
import world.Area;
import world.AreaId;

public class ChapelOfAnticipation extends Area {

    public ChapelOfAnticipation() {
        super(
                AreaId.CHAPEL_OF_ANTICIPATION,
                "Chapel of Anticipation",
                "The salty wind sweeps through the ruined chapel..."
        );
    }

    @Override
    public void show(MultiWindowTextGUI gui,
                     BasicWindow window,
                     Player player) {

        Panel root = new Panel();

        root.addComponent(new Label(getName()));
        root.addComponent(new EmptySpace(new TerminalSize(0,1)));
        root.addComponent(new Label(getDescription()));

        window.setComponent(root);
    }
}