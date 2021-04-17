/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question04;

/**
 *
 * @author S542263
 */
public class Bowler extends Cricket{
    private int noOfWickets;
    private String bowlingStyle;
    
   

    public Bowler(int noOfWickets, String bowlingStyle, String playerFname, String playerLname, int matchesPlayed) {
        super(playerFname, playerLname, matchesPlayed);
        this.noOfWickets = noOfWickets;
        this.bowlingStyle = bowlingStyle;
    }

    public int getNoOfWickets() {
        return noOfWickets;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    

    @Override
    public String playerInfo() {
       super.playerInfo(); 
       String result ="";
       result = result + "Batting Style "+getBowlingStyle()+"\n"+
               "Matches Played "+getMatchesPlayed()+"\n"+
               "Centuries Scored "+getNoOfWickets();
       
       return result;
    }
    
}
