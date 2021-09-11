/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.dao;

import java.util.List;
import model.Player;
import model.Room;

/**
 *
 * @author PhanToan
 */
public class RoomDAO extends DAO{
    
    private List<Integer> playersInRoom;
    public RoomDAO(){
        super();
    }
    
    public void joinRoom(int playerId){
        playersInRoom.add(playerId);
    }
    
    public boolean createRoom(String password){
        try{
            Room room = new Room();
            room.setPassword(password);
            session.beginTransaction();
            session.save(room);
            session.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}

