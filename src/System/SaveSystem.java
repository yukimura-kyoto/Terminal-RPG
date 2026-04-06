package System;

import Entity.player.Player;
import Skills.Skills;
import Skills.Usavel;
import Skills.Weapons;

import java.io.*;

public class SaveSystem {

    // Obrigado claudio por fazer o sistema de save
    // Isso foi 100% feito usando IA porq eu nao sei como fazer um sistema de save
    // e nem sei oq ta acontecendo tbm

    // Isso salva, ai no Random event ele salva toda hora que passa um evento
    public static void salvarPlayer(Player player) {
        try {
            FileWriter fw = new FileWriter("save.txt");
            System.out.println("Salvando em: " + new File("save.txt").getAbsolutePath());
            fw.write(player.name + "\n");
            fw.write(player.health + "\n");
            fw.write(player.stamina + "\n");
            fw.write(player.armadura + "\n");
            fw.write(player.esquiva + "\n");
            fw.write(player.level + "\n");
            fw.write(player.xp + "\n");
            fw.write(player.xpToNext+"\n");
            fw.write(Weapons.Weapons_List.indexOf(player.currentWeapon) + "\n");
            for (Usavel skill : player.moveset) {
                fw.write(Skills.moveset.indexOf(skill) + "\n");
            }
            fw.close();
            System.out.println("Jogo salvo!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    // isso carrega os stats armas e os karai a 4
    public static Player carregarPlayer() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("save.txt"));
            String name = br.readLine();
            int health = Integer.parseInt(br.readLine());
            int stamina = Integer.parseInt(br.readLine());
            int armadura = Integer.parseInt(br.readLine());
            int esquiva = Integer.parseInt(br.readLine());
            int level = Integer.parseInt(br.readLine());
            double xp = Double.parseDouble(br.readLine());
            double xpToNext = Double.parseDouble(br.readLine());

            Player player = new Player(name, health, stamina, armadura, esquiva, level, xp, xpToNext);

            int armaIndex = Integer.parseInt(br.readLine());
            player.equipWeapon(Weapons.Weapons_List.get(armaIndex));

            String linha;
            while ((linha = br.readLine()) != null) {
                player.moveset.add(Skills.moveset.get(Integer.parseInt(linha)));
            }

            br.close();
            return player;
        } catch (IOException e) {
            System.out.println("Nenhum save encontrado.");
            return null;
        }
    }
}

