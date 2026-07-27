package ui;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import model.creation.CharacterCreationData;
import model.entities.Player;
import model.enums.StartingClass;
import model.save.PlayerRepository;
import ui.components.DataTextBox;
import ui.components.MenuStyle;

public class CharacterCreationMenu {

    public static void show(MultiWindowTextGUI gui, BasicWindow window, CharacterCreationData data) {

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

            // Salva o Personagem
            Player player = new Player(data);
            PlayerRepository.save(player);

            // TODO:
            // player.setKeepsake(data.getKeepsake());

            System.out.println("========== PLAYER CREATED ==========");
            System.out.println("Name: " + player.getName());
            System.out.println("Class: " + data.getStartingClass().getName());
            System.out.println("Keepsake: " + data.getKeepsake().getName());

            // TODO:
            // GameMenu.show(gui, window, player);

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