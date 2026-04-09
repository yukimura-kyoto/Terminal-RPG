package Entity.npc;

import Entity.base.Stats;
import Skills.base.TipoDano;
import Skills.base.Usavel;

public abstract class NPC extends Stats {

    public boolean estaEsquivando = false;
    public int curaPassiva;
    public boolean Sugando = false;

    // Parte de Resistencia de dano
    // Dano Fisico
    public float resCorte = 0;
    public float resImpacto = 0;
    public float resPerfucacao = 0;
    public float resBalistico = 0;
    public float resFogo = 0;
    public float resFrio = 0;
    public float resQuimico = 0;
    public float resEletrico = 0;

    // Dano Paranormal
    public float resSangue = 0;
    public float resMorte = 0;
    public float resConhecimento = 0;
    public float resEnergia = 0;
    public float resMedo = 0;

    public int getResistencia(TipoDano tipo) {
        switch (tipo) {
            case CORTE: return (int) resCorte;
            case IMPACTO: return (int) resImpacto;
            case PERFURACAO: return (int) resPerfucacao;
            case BALISTICO: return (int) resBalistico;
            case FOGO: return (int) resFogo;
            case FRIO: return (int) resFrio;
            case QUIMICO: return (int) resQuimico;
            case ELETRICO: return (int) resEletrico;
            case SANGUE: return (int) resSangue;
            case MORTE: return (int) resMorte;
            case CONHECIMENTO: return (int) resConhecimento;
            case ENERGIA: return (int) resEnergia;
            case MEDO: return (int) resMedo;
            default: return 0;
        }
    }

    public double xpDrop;

    public NPC(String name, int health, int stamina, int armadura, int esquiva, double xpDrop) {
        super(name, health, stamina, armadura, esquiva);
        this.xpDrop = xpDrop;
    }

    public abstract Usavel escolherSkill(Stats inimigo);
}