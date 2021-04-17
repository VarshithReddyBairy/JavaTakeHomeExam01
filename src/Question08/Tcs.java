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
public abstract class Tcs {
    private String location;

    public Tcs(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    public abstract int getNumberOfEmployees();
    
}
