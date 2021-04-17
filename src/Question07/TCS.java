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
public enum TCS {
    ENTRY(5),MEDIUM(10),ADVANCE(12);
    
  
    public int hike;

    private TCS( int hike) {
        
        this.hike = hike;
    }

  

    public int getHike() {
        return hike;
    }

    public void setHike(int hike) {
        this.hike = hike;
    }
    
}
