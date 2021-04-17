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
public class Cricket {
   private String playerFname;
    private String playerLname;
    private int matchesPlayed;

    public Cricket(String playerFname, String playerLname, int matchesPlayed) {
        this.playerFname = playerFname;
        this.playerLname = playerLname;
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    
    

    public String getPlayerFname() {
        return playerFname;
    }

    public void setPlayerFname(String playerFname) {
        this.playerFname = playerFname;
    }

    public String getPlayerLname() {
        return playerLname;
    }

    public void setPlayerLname(String playerLname) {
        this.playerLname = playerLname;
    }
    
    public String playerInfo()
    {
        System.out.println( "Player " + getPlayerFname() + " , "+ getPlayerLname() );
        return "";
    }

    @Override
    public String toString() {
        return "Cricket{" + "playerFname=" + playerFname + ", playerLname=" + playerLname + '}';
    }
    
}
