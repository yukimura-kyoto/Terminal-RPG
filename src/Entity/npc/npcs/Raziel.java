package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.base.Stats;
import Skills.Skills;
import Skills.Usavel;

public class Raziel extends NPC {

    public Raziel() {
        super("Raziel", 250, 125, 5, 10);
        addSkill(Skills.moveset.get(0));
        addSkill(Skills.moveset.get(1));
    }

    @Override
    public Usavel escolherSkill(Stats inimigo) {
        return moveset.get(0);
    }
}
