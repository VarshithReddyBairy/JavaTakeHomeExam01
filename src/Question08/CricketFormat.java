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
public class CricketFormat extends Cricket{

    public CricketFormat(int overs) {
        super(overs);
    }

  @Override
  public String getCricketFormat(){
      String result= "";
     if(super.getOvers() == 20){
         result = "T20";
     }
     if(super.getOvers() == 50){
         result = "ODI";
     }
     if(super.getOvers() == 90){
         result = "TEST";
     }
     return result;
  }

    @Override
    public String toString() {
        return "The Cricket format is "+getCricketFormat();
    }
    
    
}
