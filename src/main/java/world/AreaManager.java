package world;

import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import player.Player;
import ui.game.AreaScreen;

public final class AreaManager {

    private static Area currentArea;

    private AreaManager(){}

    public static void enter(
            Area area,
            MultiWindowTextGUI gui,
            BasicWindow window,
            Player player
    ){

        currentArea = area;

        AreaScreen.show(
                gui,
                window,
                area,
                player
        );
    }

    public static Area getCurrentArea() {
        return currentArea;
    }
}