package ui.menus.creation;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import player.creation.CharacterCreationData;
import player.Player;
import enums.StartingClass;
import save.PlayerRepository;
import ui.components.DataTextBox;
import ui.components.MenuStyle;
import world.areas.ChapelOfAnticipation;

public class CharacterCreationMenu {

    public static void show(MultiWindowTextGUI gui, BasicWindow window, CharacterCreationData data) {

        // Get the starting class
        StartingClass startingClass = data.getStartingClass();

        Panel root = new Panel();
        root.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));

        // LEFT PANEL
        Panel left = new Panel();
        left.setLayoutManager(new LinearLayout(Direction.VERTICAL));
        Label title = new Label("Character Creation");
        title.setLayoutData(LinearLayout.createLayoutData(LinearLayout.Alignment.Center));
        left.addComponent(title);
        left.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        // NAME
        left.addComponent(new Label("Name"));
        DataTextBox nameBox = new DataTextBox(data.getName(), data::setName);
        nameBox.setPreferredSize(new TerminalSize(25, 1));
        left.addComponent(nameBox);
        left.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        // KEEPSAKE
        left.addComponent(new Label("Keepsake"));
        ActionListBox keepsakeMenu = new ActionListBox();
        MenuStyle.apply(keepsakeMenu);
        keepsakeMenu.addItem("[" + data.getKeepsake().getName() + "]", () -> {
            SelectKeepSakeMenu.show(gui, window, data);
        });
        left.addComponent(keepsakeMenu);
        left.addComponent(new EmptySpace(new TerminalSize(0, 2)));

        // FINISH
        Button finish = new Button("Finish", () -> {
            if (data.getName().isBlank()) {
                data.setName("Tarnished");
            }

            // Create and save Player
            Player player = new Player(data);
            PlayerRepository.save(player);

            // Changes the Screen to the first one in game
            ChapelOfAnticipation.show(gui, window, player);
        });

        left.addComponent(finish);

        // RIGHT PANEL
        Panel right = new Panel();
        right.setLayoutManager(new LinearLayout(Direction.VERTICAL));
        right.addComponent(new Label("Class: " + startingClass.getName()));
        right.addComponent(new EmptySpace(new TerminalSize(0, 1)));
        right.addComponent(new Label("Level: " + startingClass.getLevel()));
        right.addComponent(new EmptySpace(new TerminalSize(0, 1)));
        right.addComponent(new Label("VIG: " + startingClass.getVigor()));
        right.addComponent(new Label("MND: " + startingClass.getMind()));
        right.addComponent(new Label("END: " + startingClass.getEndurance()));
        right.addComponent(new Label("STR: " + startingClass.getStrength()));
        right.addComponent(new Label("DEX: " + startingClass.getDexterity()));
        right.addComponent(new Label("INT: " + startingClass.getIntelligence()));
        right.addComponent(new Label("FTH: " + startingClass.getFaith()));
        right.addComponent(new Label("ARC: " + startingClass.getArcane()));

        // FINAL
        root.addComponent(left);
        root.addComponent(new EmptySpace(new TerminalSize(6, 0)));
        root.addComponent(right);
        window.setComponent(root);
        gui.setActiveWindow(window);
    }
}