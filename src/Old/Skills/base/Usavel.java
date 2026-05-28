package Old.Skills.base;

import Old.Entity.base.Stats;

public interface Usavel {
    int usar(Stats user);
    String getName();
    TipoDano getTipo(Stats user);
}