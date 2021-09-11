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

public class Game {
    private int id;
    
    private int idPlayerOne;
    private int idPlayerTwo;
    
    private int resultGame;
    private int type;

    public Game() {
    }

    public Game(int id, int idPlayerOne, int idPlayerTwo, int resultGame, int type) {
        this.id = id;
        this.idPlayerOne = idPlayerOne;
        this.idPlayerTwo = idPlayerTwo;
        this.resultGame = resultGame;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPlayerOne() {
        return idPlayerOne;
    }

    public void setIdPlayerOne(int idPlayerOne) {
        this.idPlayerOne = idPlayerOne;
    }

    public int getIdPlayerTwo() {
        return idPlayerTwo;
    }

    public void setIdPlayerTwo(int idPlayerTwo) {
        this.idPlayerTwo = idPlayerTwo;
    }

    public int getResultGame() {
        return resultGame;
    }

    public void setResultGame(int resultGame) {
        this.resultGame = resultGame;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    
}
