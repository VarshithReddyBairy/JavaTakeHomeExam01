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
public class Batsman implements CricketInfo{
    private String batsmanName;
    private int numOfMatchesPlayed;
private int numberOfRunsScored;

    public Batsman(String batsmanName, int numOfMatchesPlayed, int numberOfRunsScored) {
        this.batsmanName = batsmanName;
        this.numOfMatchesPlayed = numOfMatchesPlayed;
        this.numberOfRunsScored = numberOfRunsScored;
    }

    @Override
    public String batsManInfo() {
        return  batsmanName +" scored "+numberOfRunsScored + " in "+numOfMatchesPlayed;
        
    }

    @Override
    public String bowlerInfo() {
        return "";
    }

}
