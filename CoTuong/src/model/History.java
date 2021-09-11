/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PhanToan
 */
public class History {
    private int id;
    private int resultGame;
    private int idOpponent;
    private int playerId;

    public History() {
    }
    
    public History(int id, int resultGame, int idOpponent, int playerId) {
        this.id = id;
        this.resultGame = resultGame;
        this.idOpponent = idOpponent;
        this.playerId = playerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResultGame() {
        return resultGame;
    }

    public void setResultGame(int resultGame) {
        this.resultGame = resultGame;
    }

    public int getIdOpponent() {
        return idOpponent;
    }

    public void setIdOpponent(int idOpponent) {
        this.idOpponent = idOpponent;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    
    
    
}
