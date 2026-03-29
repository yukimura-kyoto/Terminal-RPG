package Menu;

import Entity.npc.NPC;
import Entity.base.Stats;
import Entity.npc.npcs.NPCRegistry;

import static Menu.Menu.Clear;
import static Menu.Menu.pause;

public class Events {

    public static NPC randomNPC() {
        Clear();
        NPC npc = NPCRegistry.getRandomNPC();
        System.out.println("Um inimigo aparece nas sombras...");
        pause(1500);
        System.out.println("É... " + npc.name + "!");
        pause(2000);
        return npc;
    }

    public static void eventoPausa() {

        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ ⏸️  O TEMPO PAROU...        │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ Tudo fica em silêncio.");
        System.out.println("│ Algo estranho está no ar...");
        System.out.println("└─────────────────────────────┘");
    }

}
