package Old.Entity.npc.npcs;

import Old.Entity.npc.NPC;
import Old.Entity.base.Stats;
import Old.Skills.Skills;
import Old.Skills.base.Usavel;
import Old.Skills.Weapons;

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
