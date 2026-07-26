package ui;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import model.creation.CharacterCreationData;
import model.enums.KeepSake;
import ui.components.MenuStyle;
import ui.components.SelectableActionListBox;

public class SelectKeepSakeMenu {

    public static void show(
            MultiWindowTextGUI gui,
            BasicWindow window,
            CharacterCreationData data
    ) {

        // ==========================
        // PAINEL PRINCIPAL
        // ==========================

        Panel root = new Panel();
        root.setLayoutManager(new LinearLayout(Direction.HORIZONTAL));

        // ==========================
        // ESQUERDA
        // ==========================

        Panel left = new Panel();
        left.setLayoutManager(new LinearLayout(Direction.VERTICAL));

        Label title = new Label("Select Keepsake");
        title.setLayoutData(
                LinearLayout.createLayoutData(LinearLayout.Alignment.Center)
        );

        left.addComponent(title);
        left.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        SelectableActionListBox menu = new SelectableActionListBox();
        MenuStyle.apply(menu);

        // ==========================
        // DIREITA
        // ==========================

        Panel right = new Panel();
        right.setLayoutManager(new LinearLayout(Direction.VERTICAL));

        Label nameTitle = new Label("Name");
        Label name = new Label("");

        Label descTitle = new Label("Description");
        Label description = new Label("");

        Label effectTitle = new Label("Effect");
        Label effect = new Label("");

        right.addComponent(nameTitle);
        right.addComponent(name);

        right.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        right.addComponent(descTitle);
        right.addComponent(description);

        right.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        right.addComponent(effectTitle);
        right.addComponent(effect);

        // ==========================
        // MENU
        // ==========================

        KeepSake[] keepsakes = KeepSake.values();

        for (KeepSake keepsake : keepsakes) {

            menu.addItem(keepsake.getName(), () -> {

                data.setKeepsake(keepsake);

                CharacterCreationMenu.show(gui, window, data);

            });

        }

        menu.setOnSelectionChanged(() -> {

            int index = menu.getSelectedIndex();

            if (index >= keepsakes.length) {
                return;
            }

            KeepSake selected = keepsakes[index];

            name.setText(selected.getName());
            description.setText(selected.getDescription());
            effect.setText(selected.getEffect());

        });

        // ==========================
        // PRIMEIRA SELEÇÃO
        // ==========================

        KeepSake initial = keepsakes[0];

        name.setText(initial.getName());
        description.setText(initial.getDescription());
        effect.setText(initial.getEffect());

        // ==========================

        left.addComponent(menu);

        left.addComponent(new EmptySpace(new TerminalSize(0, 1)));

        menu.addItem("Back", () -> {
            CharacterCreationMenu.show(gui, window, data);
        });
        root.addComponent(left);
        root.addComponent(new EmptySpace(new TerminalSize(5, 0)));
        root.addComponent(right);

        window.setComponent(root);

    }

}