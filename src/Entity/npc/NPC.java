package Entity.npc;

import Entity.base.Stats;
import Skills.Usavel;

public abstract class NPC extends Stats {

    public boolean estaEsquivando = false;

    public double xpDrop;

    public NPC(String name, int health, int stamina, int armadura, int esquiva, double xpDrop) {
        super(name, health, stamina, armadura, esquiva);
        this.xpDrop = xpDrop;
    }

    public abstract Usavel escolherSkill(Stats inimigo);
}