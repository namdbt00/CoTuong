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

 
public class Player {
    private int id;
    private String name;
    private int age;
    private int rankPoint;
    private int winMatch;
    private int totalMatch;
    private int status;
    private int lobbyId;
    private int gameId;
    private int rankId;
    private int roomId;

    public int getWinMatch() {
        return winMatch;
    }

    public void setWinMatch(int winMatch) {
        this.winMatch = winMatch;
    }
    
    public Player(){
        
    }

    public Player(int id, String name, int age, int rankPoint, int totalMatch, int status, int lobbyId, int gameId, int rankId, int roomId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rankPoint = rankPoint;
        this.totalMatch = totalMatch;
        this.status = status;
        this.lobbyId = lobbyId;
        this.gameId = gameId;
        this.rankId = rankId;
        this.roomId = roomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRankPoint() {
        return rankPoint;
    }

    public void setRankPoint(int rankPoint) {
        this.rankPoint = rankPoint;
    }

    public int getTotalMatch() {
        return totalMatch;
    }

    public void setTotalMatch(int totalMatch) {
        this.totalMatch = totalMatch;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLobbyId() {
        return lobbyId;
    }

    public void setLobbyId(int lobbyId) {
        this.lobbyId = lobbyId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getRankId() {
        return rankId;
    }

    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    
}
