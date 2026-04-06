package Entity.npc.npcs;

import Entity.npc.NPC;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class NPCRegistry {

    private static final Random rd = new Random();

    private static List<Supplier<NPC>> todos = null;

    private static List<Supplier<NPC>> getTodos() {
        if (todos == null) {
            todos = List.of(
                    Jaspian::new, // 0
                    Raziel::new, // 1
                    Succ::new // 2
            );
        }
        return todos;
    }

    private static List<Supplier<NPC>> getBoss() {
        if (todos == null) {
            todos = List.of(
                    O_Diabo::new // 0
            );
        }
        return todos;
    }

    public static NPC getRandomNPC() {
        return getTodos()
                .get(rd.nextInt(getTodos().size()))
                .get(); // 👈 AQUI que nasce o NPC novo
    }

    // Esse pega o NPC pelo index dele
    public static NPC getNPCByIndex(int index) {
        return getTodos().get(index).get();
    }

    // isso se usa pra pegar o boss pela index dele
    public static NPC getBossByIndex(int index) {
        return getBoss().get(index).get();
    }
}