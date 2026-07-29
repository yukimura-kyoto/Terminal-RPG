package world.areas;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import player.Player;
import ui.printer.AreaPrinter;
import world.Area;

public class ChapelOfAnticipation {

    public static Area SPAWN = new Area(
            "Spawn Room",
            "You awaken inside a ruined stone chapel..."
    );

    public static void show(MultiWindowTextGUI gui, BasicWindow window, Player player) {

        Panel root = new Panel();

        root.addComponent(new Label("Chapel of Anticipation"));
        root.addComponent(new EmptySpace(new TerminalSize(0,1)));
        root.addComponent(new Label(
                "The salty wind sweeps through the ruined chapel."
        ));

        window.setComponent(root);
    }

}