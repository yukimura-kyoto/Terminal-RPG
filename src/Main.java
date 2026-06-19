import debug.DebugMenu;
import engine.scaling.EnduranceScaling;
import engine.scaling.LevelScaling;
import engine.scaling.MindScaling;
import engine.scaling.VigorScaling;
import model.status.Attributes;
import model.status.DerivedAttributes;

public class Main {

    public static void main(String[] args) {

        Attributes player = new Attributes("Vagabond");
        DerivedAttributes stats = new DerivedAttributes();

        // Attributes from Vagabond Class to test it out

        // Initial Level 9

        player.setVigor(15);
        player.setMind(10);
        player.setEndurance(11);
        player.setStrength(14);
        player.setDexterity(13);
        player.setIntelligence(9);
        player.setFaith(9);
        player.setArcane(7);

        // Set Max

        stats.setMaxHp(VigorScaling.getHP(player.getVigor()));
        stats.setMaxFp(MindScaling.getFP(player.getMind()));
        stats.setMaxEquipLoad(EnduranceScaling.getEquipLoad(player.getEndurance()));

        // cálculos de scaling aqui...
        stats.setCurrentHp(stats.getMaxHp());
        stats.setCurrentFp(stats.getMaxFp());
        stats.setCurrentEquipLoad(0);

//        stats.setMaxStamina(130);
//        stats.setCurrentStamina(130);

        DebugMenu.showStats(player, stats);
    }
}