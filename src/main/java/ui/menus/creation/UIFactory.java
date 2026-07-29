package ui.menus.creation;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.*;

public class UIFactory {
    // Create a new Panel, because this repeat a lot
    public static Panel createRoot() {
        Panel root = new Panel();
        root.setLayoutManager(new LinearLayout(Direction.VERTICAL));
        return root;
    }

    // idk what this does
    public static EmptySpace space(int lines) {
        return new EmptySpace(new TerminalSize(0, lines));
    }

    // Title
    public static Label title(String text) {
        Label label = new Label(text);
        label.setLayoutData(
                LinearLayout.createLayoutData(LinearLayout.Alignment.Center)
        );
        return label;
    }
}