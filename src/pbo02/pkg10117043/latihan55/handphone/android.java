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
public class android extends handphone {
     private String keyStone;

    public android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    

    public String getKeyStone() {
        return keyStone;
    }

    public void setKeyStone(String keyStone) {
        this.keyStone = keyStone;
    }
    
}
