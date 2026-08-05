import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import player.Player;
import ui.menus.main.MainMenu;
import world.Area;
import world.areas.ChapelOfAnticipation;

public static void main(String[] args) throws Exception {

    DefaultTerminalFactory factory = new DefaultTerminalFactory();
    factory.setInitialTerminalSize(new TerminalSize(104, 45));

    Screen screen = factory.createScreen();
    screen.startScreen();

    MultiWindowTextGUI gui = new MultiWindowTextGUI(screen);
    BasicWindow window = new BasicWindow();

    Player player = null; // ou um Player de teste

    new ChapelOfAnticipation().show(gui, window, player);

    gui.addWindowAndWait(window);

    screen.stopScreen();
}