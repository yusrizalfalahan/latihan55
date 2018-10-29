/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan55.handphone;

/**
 *
 * @author Acer
 */
public class blackberry extends handphone {
   private String pinBB;

   public blackberry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }  
   
    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
}
