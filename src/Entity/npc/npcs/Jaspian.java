package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.base.Stats;
import Skills.Usavel;
import Skills.Skills;

public class Jaspian extends NPC {

    public Jaspian() {
        super("Jaspian", 100, 50, 5, 10);
        System.out.println("Criando Jaspian, moveset size: " + Skills.moveset.size());
        addSkill(Skills.moveset.get(0));
        addSkill(Skills.moveset.get(1));
    }

    @Override
    public Usavel escolherSkill(Stats inimigo) {
        return moveset.get(0);
    }
}
