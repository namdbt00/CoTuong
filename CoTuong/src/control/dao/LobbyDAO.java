/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.dao;

import java.util.List;

/**
 *
 * @author PhanToan
 */
public class LobbyDAO extends DAO{
    private static List<Integer> playersInLobby;
    public LobbyDAO(){
        super();
    }
    
    public static void joinLobby(int playerId){
        playersInLobby.add(playerId);
    }
}

