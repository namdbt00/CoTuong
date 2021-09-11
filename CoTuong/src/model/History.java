/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.dao.GameDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author PhanToan
 */
public class History {
    private List<Integer> games;
    private int playerId;
    private double winRate;

    public History() {
    }
    
    public History(List<Integer> games, int playerId) {
        this.games = games;
        this.playerId = playerId;
    }


    public List<Game> getGamesHistory() {
        GameDAO gameDao = new GameDAO();
        List<Game> games = (List<Game>) gameDao.getGameByPlayerId(this.playerId);
        HashMap<Integer,ArrayList<Integer>> versusWinRate = new HashMap<>();
        int totalMatch = 0;
        for(int i = 0;i < games.size();i++){
            int opponentId = this.playerId == games.get(i).getIdPlayerOne() ? games.get(i).getIdPlayerTwo() : games.get(i).getIdPlayerOne();
            if(versusWinRate.containsKey(opponentId)){
                if(opponentId == games.get(i).getIdPlayerOne()){
                    if(games.get(i).getResultGame() == 1){
                        int tmp = versusWinRate.get(opponentId).get(0);
                        tmp++;
                        versusWinRate.get(opponentId).remove(0);
                        versusWinRate.get(opponentId).add(0, tmp);
                        versusWinRate.put(opponentId, versusWinRate.get(opponentId));
                    }
                }else {
                    if(games.get(i).getResultGame() == 2){
                        int tmp = versusWinRate.get(opponentId).get(0);
                        tmp++;
                        versusWinRate.get(opponentId).remove(0);
                        versusWinRate.get(opponentId).add(0, tmp);
                        versusWinRate.put(opponentId, versusWinRate.get(opponentId));
                    }
                }
            }
        }
        return games;
    }

    public void setGamesHistory(List<Integer> games) {
        this.games = games;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

}
