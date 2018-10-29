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
public class handphone {
    protected String manufacture;
    protected String operationalSystem;
    protected String model;
    protected int harga;

    public handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operationalSystem = os;
        this.model = model;
        this.harga = harga;
    }
    public void displayProduct(){
        System.out.println("Manufaktur : " + manufacture);
        System.out.println("OS : " + operationalSystem);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
    }
    
}
