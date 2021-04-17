/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

/**
 *
 * @author S542263
 */
public abstract class Cricket {
    private int overs;

    public Cricket(int overs) {
        this.overs = overs;
    }

    public int getOvers() {
        return overs;
    }
    
    public abstract String getCricketFormat();
}
