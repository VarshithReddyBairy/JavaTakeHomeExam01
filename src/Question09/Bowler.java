/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author S542263
 */
public class Bowler implements CricketInfo {
     private String batsmanName;
    private int numOfMatchesPlayed;
private int numOfWicketsTook;

    public Bowler(String batsmanName, int numOfMatchesPlayed, int numOfWicketsTook) {
        this.batsmanName = batsmanName;
        this.numOfMatchesPlayed = numOfMatchesPlayed;
        this.numOfWicketsTook = numOfWicketsTook;
    }


    @Override
    public String batsManInfo() {
       return "";
    }

    @Override
    public String bowlerInfo() {
        return  batsmanName +" took "+numOfWicketsTook + " in "+numOfMatchesPlayed;
    }
    
}
