package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.base.Stats;
import Skills.Skills;
import Skills.base.Usavel;
import Skills.Weapons;

import static System.Combat.rd;

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
