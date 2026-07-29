package ui.menus.creation;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import player.creation.CharacterCreationData;
import enums.StartingClass;
import ui.components.MenuStyle;
import ui.components.SelectableActionListBox;
import ui.menus.main.MainMenu;

public class SelectCharacterBaseMenu {

    public static void show(
            MultiWindowTextGUI gui,
            BasicWindow window,
            CharacterCreationData data
    ) {

        // Painel principal
        Panel root = new Panel();
        root.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));

        // parte da esquerda

        Panel left = new Panel();
        left.setLayoutManager(new LinearLayout(Direction.VERTICAL));

        Label title = new Label("Character Creation");
        title.setLayoutData(
                LinearLayout.createLayoutData(LinearLayout.Alignment.Center)
        );

        left.addComponent(title);
        left.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        SelectableActionListBox menu = new SelectableActionListBox();
        MenuStyle.apply(menu);

        // parte da direita

        Panel right = new Panel();
        right.setLayoutManager(new LinearLayout(Direction.VERTICAL));

        Label className = new Label("Class:");
        Label level = new Label("Level:");
        Label vigor = new Label("VIG:");
        Label mind = new Label("MND:");
        Label endurance = new Label("END:");
        Label strength = new Label("STR:");
        Label dexterity = new Label("DEX:");
        Label intelligence = new Label("INT:");
        Label faith = new Label("FTH:");
        Label arcane = new Label("ARC:");

        right.addComponent(className);
        right.addComponent(new EmptySpace(new TerminalSize(0, 1)));
        right.addComponent(level);
        right.addComponent(vigor);
        right.addComponent(mind);
        right.addComponent(endurance);
        right.addComponent(strength);
        right.addComponent(dexterity);
        right.addComponent(intelligence);
        right.addComponent(faith);
        right.addComponent(arcane);

        // menu de classe

        StartingClass[] classes = StartingClass.values();

        // ‘loop’ que passa pelo Enum starting class e lista ele
        for (StartingClass startingClass : classes) {
            menu.addItem(startingClass.getName(), () -> {

                data.setStartingClass(startingClass);

                CharacterCreationMenu.show(gui, window, data);

            });
        }

        // Atualiza o painel da direita sempre que a seleção mudar
        menu.setOnSelectionChanged(() -> {
            int index = menu.getSelectedIndex();

            if (index >= classes.length) {
                className.setText("Class: -");
                level.setText("Level: -");
                vigor.setText("VIG: -");
                mind.setText("MND: -");
                endurance.setText("END: -");
                strength.setText("STR: -");
                dexterity.setText("DEX: -");
                intelligence.setText("INT: -");
                faith.setText("FTH: -");
                arcane.setText("ARC: -");
                return;
            }

            StartingClass selected = classes[index];

            className.setText("Class: " + selected.getName());
            level.setText("Level: " + selected.getLevel());

            vigor.setText("VIG: " + selected.getVigor());
            mind.setText("MND: " + selected.getMind());
            endurance.setText("END: " + selected.getEndurance());

            strength.setText("STR: " + selected.getStrength());
            dexterity.setText("DEX: " + selected.getDexterity());

            intelligence.setText("INT: " + selected.getIntelligence());
            faith.setText("FTH: " + selected.getFaith());
            arcane.setText("ARC: " + selected.getArcane());
        });

        // Inicia com Hero porq e a primeira opcao
        StartingClass initial = classes[0];

        className.setText("Class: " + initial.getName());
        level.setText("Level: " + initial.getLevel());

        vigor.setText("VIG: " + initial.getVigor());
        mind.setText("MND: " + initial.getMind());
        endurance.setText("END: " + initial.getEndurance());

        strength.setText("STR: " + initial.getStrength());
        dexterity.setText("DEX: " + initial.getDexterity());

        intelligence.setText("INT: " + initial.getIntelligence());
        faith.setText("FTH: " + initial.getFaith());
        arcane.setText("ARC: " + initial.getArcane());

        left.addComponent(menu);
        left.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        // botao para voltar
        menu.addItem("Back", () -> MainMenu.show(gui, window));

        root.addComponent(left);
        root.addComponent(new EmptySpace(new TerminalSize(4, 0)));
        root.addComponent(right);

        window.setComponent(root);
    }
}