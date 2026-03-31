package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.base.Stats;
import Skills.Skills;
import Skills.Usavel;
import Skills.Weapons;

public class Raziel extends NPC {

    public Raziel() {
        super("Raziel", 250, 125, 5, 10,250);
        equipWeapon(Weapons.Weapons_List.get(0));
        addSkill(Skills.moveset.get(1));
        addSkill(Skills.moveset.get(2));
        addSkill(Skills.moveset.get(4));
        addSkill(Skills.moveset.get(5));
    }

    @Override
    public Usavel escolherSkill(Stats inimigo) {
        return moveset.get(0);
    }
}
