package world;

import world.areas.ChapelOfAnticipation;

public final class AreaFactory {

    private AreaFactory(){}

    public static Area create(AreaId id){

        return switch(id){

            case CHAPEL_OF_ANTICIPATION ->
                    new ChapelOfAnticipation();

            default -> throw new IllegalArgumentException("Área não implementada: " + id);

            // depois
            // case LIMGRAVE -> new Limgrave();
        };
    }
}