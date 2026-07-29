package save;

import com.fasterxml.jackson.databind.ObjectMapper;
import player.Player;

import java.io.File;
import java.io.IOException;

final public class PlayerRepository {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void save(Player player) {
        try{
            PlayerData data = PlayerMapper.toData(player);
            File folder = new File("saves");
            if (!folder.exists()) {
                folder.mkdirs();
            }

            File save = new File("saves/"+data.getName()+".json");
            mapper.writerWithDefaultPrettyPrinter().writeValue(save, data);
            System.out.println("Player salvo: " + save.getPath());

        }catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public static Player load(String fileName) {
        try {

            File file = new File("saves/" + fileName + ".json");

            System.out.println("Arquivo: " + file.getAbsolutePath());

            if (!file.exists()) {
                System.out.println("Arquivo não existe");
                return null;
            }

            PlayerData data = mapper.readValue(file, PlayerData.class);

            System.out.println("JSON carregado");

            return PlayerMapper.toPlayer(data);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String[] getSaveFiles() {
        File folder = new File("saves");
        if (!folder.exists()) {
            return new String[0];
        }
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".json"));
        if (files == null) {
            return new String[0];
        }
        String[] saves = new String[files.length];

        for (int i = 0; i < files.length; i++) {
            String name = files[i].getName();
            saves[i] = name.replace(".json", "");
        }
        return saves;
    }
}