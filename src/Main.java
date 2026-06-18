import debug.DebugMenu;
import engine.scaling.EquipLoadScaling;
import engine.scaling.MindScaling;
import engine.scaling.VigorScaling;
import model.stats.Attributes;
import model.stats.DerivedAttributes;

public class Main {

    public static void main(String[] args) {

        Attributes player = new Attributes("Leyley");
        DerivedAttributes stats = new DerivedAttributes();

        player.setVigor(40);
        player.setMind(20);
        player.setEndurance(30);

        // cálculos de scaling aqui...
        stats.setMaxHp(VigorScaling.getHP(player.getVigor()));
        stats.setCurrentHp(stats.getMaxHp());

        stats.setMaxFp(MindScaling.getFP(player.getMind()));
        stats.setCurrentFp(stats.getMaxFp());

//        stats.setMaxStamina(130);
//        stats.setCurrentStamina(130);
//
        stats.getMaxEquipLoad(EquipLoadScaling.getEquipLoad(player.getEndurance()));
        stats.setCurrentEquipLoad(0);

        DebugMenu.showStats(player, stats);
    }
}