package data_base;

import entity.Player;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<String, Player> players = new HashMap<>();

    public static void savePlayer(Player player) {
        players.put(player.getPlayerName(), player);
    }

    public static Player getPlayer(String playerName) {
        return players.get(playerName);
    }

    public static void removePlayer(String playerName) {
        players.remove(playerName);
    }
}
