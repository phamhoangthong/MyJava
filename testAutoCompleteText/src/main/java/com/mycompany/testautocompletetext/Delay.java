/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testautocompletetext;

/**
 *
 * @author phamh
 */
public class Delay {
    public Delay() {
        
    }
    
    public boolean DelayMS(int time) {
        try {
            Thread.sleep(time);
            return true;
        } catch (InterruptedException ie) {
            return false;
        }
    }
    
    public boolean DelayS(int time) {
        try {
            long temp = time*1000;
            Thread.sleep(temp);
            return true;
        } catch (InterruptedException ie) {
            return false;
        }
    }
}
