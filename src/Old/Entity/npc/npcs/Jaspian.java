package Old.Entity.npc.npcs;

import Old.Entity.npc.NPC;
import Old.Entity.base.Stats;
import Old.Skills.base.Usavel;
import Old.Skills.Skills;
import Old.Skills.Weapons;

import static Old.System.Combat.rd;

public class Jaspian extends NPC {

    public Jaspian() {
        super("Jaspian", 100, 50, 5, 10,50);
        equipWeapon(Weapons.Weapons_List.get(0));
        addSkill(Skills.moveset.get(0));
        addSkill(Skills.moveset.get(6));
    }

    @Override
    public Usavel escolherSkill(Stats inimigo) {
        // Ahhh ele esquiva abaixo de 50%
        if (health < 50 && !estaEsquivando && Math.random() < 0.5) {
            estaEsquivando = true;
            System.out.println("Jaspian se prepara para esquivar!");
            return moveset.get(0);
        }

        estaEsquivando = false;
        return moveset.get(rd.nextInt(moveset.size()));
    }
}
