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
public class TataMotors extends TataGroup{
    

    public TataMotors( String ceo, String president) {
        super(ceo, president);
        
    }

    @Override
    public String toString() {
        return "The CEO of TataMotors is "+super.ceo.toUpperCase()+"\n"+
                "The President of TataMotors is "+super.president.toUpperCase()+"\n"
                ;
    }
}
