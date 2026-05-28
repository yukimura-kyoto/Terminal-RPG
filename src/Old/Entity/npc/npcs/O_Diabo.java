package Old.Entity.npc.npcs;

import Old.Entity.npc.NPC;
import Old.Entity.base.Stats;
import Old.Skills.base.Usavel;
import Old.Skills.Skills;
import Old.Skills.Weapons;

import static Old.System.Combat.rd;

public class O_Diabo extends NPC {

    // res
    // balistico = 20, 20 impacto, 20 perfuracao,
    public O_Diabo() {
        super("O Diabo", 1667, 2000, 67, 55,666);
        // Depois add mais armas pra ele ter varios meele
        equipWeapon(Weapons.Weapons_List.get(5));
        addSkill(Skills.moveset.get(8)); // Explodir em Sangue
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
