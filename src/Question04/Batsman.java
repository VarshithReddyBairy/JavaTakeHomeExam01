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
public class Batsman  extends Cricket{
    private int noOfCenturies;
    private String battingStyle;
    
   

    public Batsman(int noOfCenturies, String battingStyle, String playerFname, String playerLname, int matchesPlayed) {
        super(playerFname, playerLname, matchesPlayed);
        this.noOfCenturies = noOfCenturies;
        this.battingStyle = battingStyle;
    }

    public String getBattingStyle() {
        return battingStyle;
    }
    

    public int getNoOfCenturies() {
        return noOfCenturies;
    }

    @Override
    public String playerInfo() {
       super.playerInfo(); 
       String result ="";
       result = result + "Batting Style "+getBattingStyle()+"\n"+
               "Matches Played "+getMatchesPlayed()+"\n"+
               "Centuries Scored "+getNoOfCenturies();
       
       return result;
    }
    
    
}
