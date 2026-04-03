package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.base.Stats;
import Skills.Usavel;
import Skills.Skills;
import Skills.Weapons;

import static System.Combat.rd;

public class Gal extends NPC {

    public Gal() {
        super("Gal", 280, 140, 28, 30,500);
        equipWeapon(Weapons.Weapons_List.get(4));
        addSkill(Skills.moveset.get(0));
        addSkill(Skills.moveset.get(3));
    }

    @Override
    public Usavel escolherSkill(Stats inimigo) {
        // Passivamente ele tem 30% de chance de esquivar
        if (health < 999 && !estaEsquivando && Math.random() < 0.3) {
            estaEsquivando = true;
            System.out.println("Gal vai se esquivar!");
            return moveset.get(rd.nextInt(moveset.size()));
        }

        // jaja eu faco um sistema de 2 turnos aqui

        estaEsquivando = false;
        return moveset.get(rd.nextInt(moveset.size()));
    }
}
