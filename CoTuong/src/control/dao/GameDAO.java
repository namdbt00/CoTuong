/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.dao;

import static control.dao.DAO.session;
import model.Game;

/**
 *
 * @author PhanToan
 */
public class GameDAO extends DAO {
    
    public GameDAO() {
        super();
        // TODO Auto-generated constructor stub
    }
     
    public Game getGameById(int gameId){
        return (Game) session.createQuery("from Game where id = " + gameId);
    }
    public Game getGameByPlayerId(int playerId){
        return (Game) session.createQuery("from Game where idPlayerOne = " + playerId + "OR " + "idPlayerTwo =" + playerId);
    }
    public boolean createGame(int idPlayerOne,int idPlayerTwo){
        try{
            Game game = new Game();
            game.setIdPlayerOne(idPlayerOne);
            game.setIdPlayerTwo(idPlayerTwo);
            session.beginTransaction();
            session.save(game);
            session.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
