package world;

import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import player.Player;

import java.util.List;

public abstract class Area {

    private final AreaId id;
    private final String name;
    private final String description;

    protected Area(
            AreaId id,
            String name,
            String description
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


    public AreaId getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public abstract List<AreaAction> getActions(
            MultiWindowTextGUI gui,
            BasicWindow window,
            Player player
    );
}