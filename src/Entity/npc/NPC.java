package Entity.npc;

import Entity.base.Stats;
import Skills.Usavel;

public abstract class NPC extends Stats {

    public boolean estaEsquivando = false;

    public NPC(String name, int health, int stamina, int armadura, int esquiva) {
        super(name, health, stamina, armadura, esquiva);
    }

    public abstract Usavel escolherSkill(Stats inimigo);
}