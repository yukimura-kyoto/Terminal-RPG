package ui.components;

import com.googlecode.lanterna.gui2.ActionListBox;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;

public class SelectableActionListBox extends ActionListBox {

    private Runnable onSelectionChanged;

    public void setOnSelectionChanged(Runnable callback) {
        this.onSelectionChanged = callback;
    }

    @Override
    public Result handleKeyStroke(KeyStroke keyStroke) {

        int itemCount = getItemCount();

        if (itemCount > 0) {
            if (keyStroke.getKeyType() == KeyType.ArrowDown && getSelectedIndex() == itemCount - 1) {
                setSelectedIndex(0);
                if (onSelectionChanged != null) {
                    onSelectionChanged.run();
                }
                return Result.HANDLED;
            }

            if (keyStroke.getKeyType() == KeyType.ArrowUp && getSelectedIndex() == 0) {
                setSelectedIndex(itemCount - 1);
                if (onSelectionChanged != null) {
                    onSelectionChanged.run();
                }
                return Result.HANDLED;
            }
        }

        Result result = super.handleKeyStroke(keyStroke);

        if (onSelectionChanged != null &&
                (keyStroke.getKeyType() == KeyType.ArrowUp || keyStroke.getKeyType() == KeyType.ArrowDown)) {
            onSelectionChanged.run();
        }

        return result;
    }
}