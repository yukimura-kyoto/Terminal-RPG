package Menu;

import Entity.npc.NPC;
import Entity.base.Stats;
import Entity.npc.npcs.NPCRegistry;

public class Events {

    public static NPC randomNPC() {
        NPC npc = NPCRegistry.getRandomNPC();
        System.out.println("Você encontrou: " + npc.name);
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
