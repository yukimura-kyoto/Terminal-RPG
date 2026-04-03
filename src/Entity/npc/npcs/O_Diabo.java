package Entity.npc.npcs;

import Entity.npc.NPC;
import Entity.base.Stats;
import Skills.Usavel;
import Skills.Skills;
import Skills.Weapons;

import static System.Combat.rd;

public class O_Diabo extends NPC {


    public O_Diabo() {
        super("O Diabo", 1666, 2000, 66, 55,666);
        // Depois add mais armas pra ele ter varios meele
        equipWeapon(Weapons.Weapons_List.get(5));
        addSkill(Skills.moveset.get(10)); // Explodir em Sangue
        addSkill(Skills.moveset.get(0)); // Soco

        curaPassiva = 50; // ele cura isso ai de vida nos rounds
    }

    // 10d8 quando ele aparecer de dano, depois eu faco isso

    @Override
    public Usavel escolherSkill(Stats inimigo) {
        // Ahhh ele esquiva abaixo de 50%

        if (health < 999999 && !estaEsquivando && Math.random() < 0.25) {
            estaEsquivando = true;
            System.out.println("O Diabo quer se Transportar pelo Sangue");
            return moveset.get(rd.nextInt(moveset.size()));
        }

        estaEsquivando = false;
        return moveset.get(rd.nextInt(moveset.size()));
    }
}
