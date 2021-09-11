/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.dao;

import java.util.ArrayList;
import java.util.HashMap;
import model.Player;

/**
 *
 * @author PhanToan
 */
public class PlayerDAO extends DAO{
    
    public PlayerDAO(){
        super();
    }
    
    public boolean addPlayer(Player player){
        try{
            session.beginTransaction();
            session.save(player);
            session.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean editPlayer(Player player){
        try{
            session.beginTransaction();
            session.update(player);
            session.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public Player getPlayerById(int playerId){  
        return (Player) session.createQuery("from Player where id = " + playerId);
    }
    public HashMap<Player,Double> calculateWinRate(int rankId){
        ArrayList<Player> players = (ArrayList<Player>)session.createQuery("from Player where rankId = " + rankId).list();
        
        HashMap<Player,Double> playerWinRate= new HashMap<>();
        
        for(int i = 0;i <  players.size();i++){
            Player player = players.get(i);
            double winRate = players.get(i).getWinMatch() / players.get(i).getTotalMatch();
            playerWinRate.put(player, winRate);
        }
        return playerWinRate;
    }
    
}
