package ui.game;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import player.Player;
import ui.components.MenuStyle;
import world.Area;
import world.AreaAction;

public final class AreaScreen {

    private AreaScreen() {
    }


    public static void show(MultiWindowTextGUI gui, BasicWindow window, Area area, Player player) {

        Panel root = new Panel();
        root.setLayoutManager(new LinearLayout(Direction.VERTICAL));

        // =========================
        // TITLE
        // =========================

        Label title = new Label(area.getName());

        title.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Center));

        root.addComponent(title);

        root.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        // =========================
        // DESCRIPTION
        // =========================

        Label description = new Label(area.getDescription());

        root.addComponent(description);

        root.addComponent(new EmptySpace(new TerminalSize(0, 2)));

        // =========================
        // ACTIONS
        // =========================

        ActionListBox actions = new ActionListBox();

        MenuStyle.apply(actions);


        for (AreaAction action : area.getActions(gui, window, player)) {

            actions.addItem(action.getName(), action.getAction());

        }
        
        actions.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Center));


        root.addComponent(actions);


        window.setComponent(root);

        gui.setActiveWindow(window);
    }
}