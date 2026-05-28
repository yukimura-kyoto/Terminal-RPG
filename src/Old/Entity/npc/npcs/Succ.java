package Old.Entity.npc.npcs;

import Old.Entity.npc.NPC;
import Old.Entity.base.Stats;
import Old.Skills.Skills;
import Old.Skills.base.Usavel;
import Old.Skills.Weapons;

import static Old.System.Combat.rd;

public class Succ extends NPC {

    public Succ() {
        super("Succ", 65, 25, 20, 30, 100);
        equipWeapon(Weapons.Weapons_List.get(6));
        addSkill(Skills.moveset.get(0)); // ele morde
    }

    @Override
    public Usavel escolherSkill(Stats inimigo) {
        // Ahhh ele esquiva abaixo de 50%
        if (health < 50 && !Sugando && Math.random() < 0.5) {
            Sugando = true;
            System.out.println("Succ esta afim de te sugar");
            return moveset.get(rd.nextInt(moveset.size()));
        }

        estaEsquivando = false;
        return moveset.get(rd.nextInt(moveset.size()));
    }
}
