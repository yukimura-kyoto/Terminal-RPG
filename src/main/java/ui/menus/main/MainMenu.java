package ui.menus.main;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.SimpleTheme;
import com.googlecode.lanterna.gui2.*;
import player.creation.CharacterCreationData;
import ui.menus.creation.SelectCharacterBaseMenu;
import ui.components.MenuStyle;
import ui.components.SelectableActionListBox;

public class MainMenu {

    public static void show(MultiWindowTextGUI gui, BasicWindow window) {

        // Tema do bagulho
        gui.setTheme(new SimpleTheme(
                TextColor.ANSI.BLACK,
                TextColor.ANSI.WHITE
        ));

        Panel root = new Panel();
        root.setLayoutManager(new LinearLayout(Direction.VERTICAL));

        // Titulo
        Label title = new Label(
                " ██████╗ ██████╗  █████╗  █████╗ ███████╗  ██████╗ ██████╗  █████╗      ██╗███████╗ █████╗ ████████╗\n" +
                        "██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██╔════╝  ██╔══██╗██╔══██╗██╔══██╗     ██║██╔════╝██╔══██╗╚══██╔══╝\n" +
                        "██║  ██╗ ██████╔╝███████║██║  ╚═╝█████╗    ██████╔╝██████╔╝██║  ██║     ██║█████╗  ██║  ╚═╝   ██║   \n" +
                        "██║  ╚██╗██╔══██╗██╔══██║██║  ██╗██╔══╝    ██╔═══╝ ██╔══██╗██║  ██║██╗  ██║██╔══╝  ██║  ██╗   ██║   \n" +
                        "╚██████╔╝██║  ██║██║  ██║╚█████╔╝███████╗  ██║     ██║  ██║╚█████╔╝╚█████╔╝███████╗╚█████╔╝   ██║   \n" +
                        " ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚════╝ ╚══════╝  ╚═╝     ╚═╝  ╚═╝ ╚════╝  ╚════╝ ╚══════╝ ╚════╝    ╚═╝   "
        );

        title.setLayoutData(
                LinearLayout.createLayoutData(LinearLayout.Alignment.Center)
        );

        root.addComponent(title);
        root.addComponent(new EmptySpace(new TerminalSize(0, 2)));

        SelectableActionListBox menu = new SelectableActionListBox();

        // Aplica o tema
        MenuStyle.apply(menu);

        // Opcoes que tem no menu
        menu.addItem("Continue", () -> {
            // TODO
        });

        menu.addItem("Load Game", () -> {
            LoadGameMenu.show(gui,window);
        });

        menu.addItem("New Game", () -> {
            // Cria uma Data nova para a criação do ‘player’
            CharacterCreationData data = new CharacterCreationData();
            // vai para o menu de começar a criar
            SelectCharacterBaseMenu.show(gui, window, data);

        });

        menu.addItem("System", () -> {
            // TODO
        });

        menu.addItem("Information", () -> {
            // TODO
        });

        menu.addItem("Quit Game", window::close);

        menu.setLayoutData(
                LinearLayout.createLayoutData(LinearLayout.Alignment.Center)
        );

        root.addComponent(menu);

        window.setComponent(root);
    }
}