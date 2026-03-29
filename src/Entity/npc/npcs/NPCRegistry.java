package Entity.npc.npcs;

import Entity.npc.NPC;
import java.util.List;
import java.util.Random;

public class NPCRegistry {

    private static final Random rd = new Random();
    private static List<NPC> todos = null;

    private static List<NPC> getTodos() {
        if (todos == null) {
            todos = List.of(
                    new Jaspian(),
                    new Raziel()
            );
        }
        return todos;
    }

    public static NPC getRandomNPC() {
        return getTodos().get(rd.nextInt(getTodos().size()));
    }
}