package ui.components;

import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.input.KeyStroke;

import java.util.function.Consumer;

public class DataTextBox extends TextBox {

    private final Consumer<String> onTextChanged;

    public DataTextBox(String initialText, Consumer<String> onTextChanged) {

        super();

        this.onTextChanged = onTextChanged;

        setText(initialText);

    }

    @Override
    public synchronized Result handleKeyStroke(KeyStroke keyStroke) {

        Result result = super.handleKeyStroke(keyStroke);

        onTextChanged.accept(getText());

        return result;
    }
}