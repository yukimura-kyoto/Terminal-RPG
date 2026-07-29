package world;

public class AreaManager {

    private Area currentArea;

    public void enter(Area area) {

        currentArea = area;

        System.out.println(area.getName());
        System.out.println();
        System.out.println(area.getDescription());

    }
}