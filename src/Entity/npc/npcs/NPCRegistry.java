package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.npc.npcs.Jaspian;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class NPCRegistry {

    private static final Random rd = new Random();

    private static List<Supplier<NPC>> todos = null;

    private static List<Supplier<NPC>> getTodos() {
        if (todos == null) {
            todos = List.of(
                    Jaspian::new,
                    Raziel::new
            );
        }
        return todos;
    }

    public static NPC getRandomNPC() {
        return getTodos()
                .get(rd.nextInt(getTodos().size()))
                .get(); // 👈 AQUI que nasce o NPC novo
    }
}