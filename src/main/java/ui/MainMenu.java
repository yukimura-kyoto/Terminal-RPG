package ui;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

import java.io.IOException;

public class MainMenu {

    public static void show() throws IOException {

        Screen screen = new DefaultTerminalFactory().createScreen();
        screen.startScreen();

        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen);

        BasicWindow window = new BasicWindow();

        Panel panel = new Panel();
        panel.setLayoutManager(new LinearLayout(Direction.VERTICAL));

        Label title = new Label(
                " ██████╗ ██████╗  █████╗  █████╗ ███████╗  ██████╗ ██████╗  █████╗      ██╗███████╗ █████╗ ████████╗\n" +
                        "██╔════╝ ██╔══██╗██╔══██╗██╔══██╗██╔════╝  ██╔══██╗██╔══██╗██╔══██╗     ██║██╔════╝██╔══██╗╚══██╔══╝\n" +
                        "██║  ██╗ ██████╔╝███████║██║  ╚═╝█████╗    ██████╔╝██████╔╝██║  ██║     ██║█████╗  ██║  ╚═╝   ██║   \n" +
                        "██║  ╚██╗██╔══██╗██╔══██║██║  ██╗██╔══╝    ██╔═══╝ ██╔══██╗██║  ██║██╗  ██║██╔══╝  ██║  ██╗   ██║   \n" +
                        "╚██████╔╝██║  ██║██║  ██║╚█████╔╝███████╗  ██║     ██║  ██║╚█████╔╝╚█████╔╝███████╗╚█████╔╝   ██║   \n" +
                        " ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚════╝ ╚══════╝  ╚═╝     ╚═╝  ╚═╝ ╚════╝  ╚════╝ ╚══════╝ ╚════╝    ╚═╝   "
        );

        panel.addComponent(title);

        panel.addComponent(new EmptySpace(new TerminalSize(0,1)));

        panel.addComponent(new Button("Continue", () -> {
            // TODO
        }));

        panel.addComponent(new Button("Load Game", () -> {
            // TODO
        }));

        panel.addComponent(new Button("New Game", () -> {
            // TODO
        }));

        panel.addComponent(new Button("System", () -> {
            // TODO
        }));

        panel.addComponent(new Button("Information", () -> {
            // TODO
        }));

        panel.addComponent(new Button("Quit Game", window::close));

        window.setComponent(panel);

        gui.addWindowAndWait(window);

        screen.stopScreen();
    }
}