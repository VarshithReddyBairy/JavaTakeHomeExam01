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
public class TataGroup {
    public String ceo;
    public String president;

    public TataGroup(String ceo, String president) {
        this.ceo = ceo;
        this.president = president;
    }

    public String getCeo() {
        return ceo;
    }

    public String getPresident() {
        return president;
    }

    @Override
    public String toString() {
        return "CEO is " + ceo + " and president is " + president ;
    }
    
}
