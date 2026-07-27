package model.save;

import model.entities.Player;

public final class PlayerMapper {

    public static PlayerData toData(Player player) {

        PlayerData data = new PlayerData();

        data.setName(player.getName());
        data.setRunes(player.getRunes());
        data.setLevel(player.getLevel());

        data.setStartingClass(player.getStartingClass());

        data.setKeepsake(player.getKeepsake());
        data.setAttributes(player.getAttributes());
        data.setDerivedAttributes(player.getDerivedAttributes());

        return data;
    }

    public static Player toPlayer(PlayerData data) {
        return new Player(data);
    }

}