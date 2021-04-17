/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

/**
 *
 * @author S542263
 */
public enum Cricket {
    TEST(90),ODI(50),T20(20);
    
    public int overs;

    private Cricket(int overs) {
        this.overs = overs;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public static Cricket getTEST() {
        return TEST;
    }

    public static Cricket getODI() {
        return ODI;
    }

    public static Cricket getT20() {
        return T20;
    }

    
    
}
