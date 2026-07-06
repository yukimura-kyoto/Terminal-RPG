package util.ui;

public class MainMenu {

    private String[] options = {
            "Continue",
            "Load Game",
            "New Game",
            "System",
            "Information",
            "Quit Game"
    };

    private int selected = 0;

    public void draw() {

        for (int i = 0; i < options.length; i++) {

            if (i == selected) {
                System.out.println("                                       > " + options[i]);
            } else {
                System.out.println("                                         " + options[i]);
            }
        }
    }

    public void moveDown() {
        if (selected < options.length - 1) {
            selected++;
        }
    }

    public void moveUp() {
        if (selected > 0) {
            selected--;
        }
    }

    public int getSelected() {
        return selected;
    }
}
