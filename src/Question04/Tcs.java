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
public class Tcs extends TataGroup{
    private String headQuarters;

    public Tcs(String headQuarters, String ceo, String president) {
        super(ceo, president);
        this.headQuarters = headQuarters;
    }

    public String getHeadQuarters() {
        return headQuarters;
    }

    @Override
    public String toString() {
        return "The Head Quarters of TCS is Located at "+getHeadQuarters().toUpperCase() +"\n"+
                "The CEO of TCS is "+super.ceo.toUpperCase()+"\n"+
                "The President of TCS is "+super.president.toUpperCase()+"\n"
                ;
    }
    
  
    
    
}
