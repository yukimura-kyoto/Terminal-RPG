package ui.menus.main;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import player.Player;
import save.PlayerRepository;
import ui.components.MenuStyle;
import ui.components.SelectableActionListBox;

public class LoadGameMenu {

    public static void show(
            MultiWindowTextGUI gui,
            BasicWindow window
    ) {

        Panel root = new Panel();
        root.setLayoutManager(
                new LinearLayout(Direction.VERTICAL)
        );


        // ==========================
        // TITULO
        // ==========================

        Label title = new Label("Load Game");

        title.setLayoutData(
                LinearLayout.createLayoutData(
                        LinearLayout.Alignment.Center
                )
        );


        root.addComponent(title);

        root.addComponent(
                new EmptySpace(new TerminalSize(0, 2))
        );


        // ==========================
        // SAVES
        // ==========================

        SelectableActionListBox savesMenu =
                new SelectableActionListBox();


        MenuStyle.apply(savesMenu);


        String[] saves = PlayerRepository.getSaveFiles();


        // máximo 6 slots

        for (int i = 0; i < 6; i++) {


            if (i < saves.length) {

                String saveName = saves[i];


                savesMenu.addItem(
                        saveName,

                        () -> {

                            Player player =
                                    PlayerRepository.load(saveName);


                            if (player != null) {

                                System.out.println(
                                        "Player carregado: "
                                                + player.getName()
                                );

                                System.out.println(
                                        "Level: "
                                                + player.getLevel()
                                );

                                // TODO:
                                // GameMenu.show(gui, window, player);

                            }

                        }
                );


            } else {

                int slot = i + 1;

                savesMenu.addItem(
                        "Slot " + slot + " - Empty",
                        () -> {
                            System.out.println(
                                    "Slot vazio"
                            );
                        }
                );

            }

        }


        savesMenu.setLayoutData(
                LinearLayout.createLayoutData(
                        LinearLayout.Alignment.Center
                )
        );


        root.addComponent(savesMenu);


        // ==========================
        // VOLTAR
        // ==========================

        root.addComponent(
                new EmptySpace(new TerminalSize(0, 2))
        );


        Button back = new Button(
                "Back",
                () -> MainMenu.show(gui, window)
        );


        back.setLayoutData(
                LinearLayout.createLayoutData(
                        LinearLayout.Alignment.Center
                )
        );


        root.addComponent(back);


        window.setComponent(root);
        gui.setActiveWindow(window);
    }
}