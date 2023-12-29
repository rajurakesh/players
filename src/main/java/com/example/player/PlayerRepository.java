// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {

    ArrayList<Player> getPlayers();

    Player addPlayer(Player player);

    Player getPlayerById(int playerId);

    void deletePlayer(int playerId);

    Player updatePlayer(int playerId, Player player);

}
