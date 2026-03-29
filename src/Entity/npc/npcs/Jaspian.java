package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.base.Stats;
import Skills.Usavel;
import Skills.Skills;
import Skills.Weapons;

import static Menu.Combat.rd;

public class Jaspian extends NPC {

    public Jaspian() {
        super("Jaspian", 100, 50, 5, 10);
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
