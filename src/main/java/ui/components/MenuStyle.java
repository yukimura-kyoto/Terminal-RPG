package ui.components;

import com.googlecode.lanterna.gui2.AbstractListBox;
import com.googlecode.lanterna.gui2.ActionListBox;

public class MenuStyle {

    public static void apply(ActionListBox menu) {
        menu.setListItemRenderer(new AbstractListBox.ListItemRenderer<Runnable, ActionListBox>() {
            @Override
            public String getLabel(ActionListBox listBox, int index, Runnable item) {
                String label = super.getLabel(listBox, index, item);
                boolean selected = listBox.getSelectedIndex() == index;
                return selected ? "[ " + label + " ]" : "  " + label + "  ";
            }
        });
    }
}