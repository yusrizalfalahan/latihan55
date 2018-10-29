/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10117043.latihan55.handphone;

/**
 *NAMA       : Yusrizal Falahan
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * @author Acer
 */
public class PBO0210117043Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        handphone nHandphone1 = new handphone(" Samsung", " Android", "Grand", 3000000);
        android nAndroid = new android(nHandphone1.manufacture, nHandphone1.operationalSystem,
                nHandphone1.model, nHandphone1.harga);
        nAndroid.setKeyStone("234ibfd3840fo");
        nHandphone1.displayProduct();
        System.out.println("Android Key Store : " + nAndroid.getKeyStone());
        System.out.println("");
        
        handphone nHandphone2 = new handphone("BlackB", "RIM", "Curve", 2000000);
        blackberry nBlackBerry = new blackberry(nHandphone2.manufacture, nHandphone2.operationalSystem,
                nHandphone2.model, nHandphone2.harga);
        nBlackBerry.setPinBB("BHS249");
        nHandphone2.displayProduct();
        System.out.println("PIN : " + nBlackBerry.getPinBB());
        System.out.println("");

        handphone nHandphone3 = new handphone("Nokia", "Win9", "Lumia", 1000000);
        windowsphone nWindowsPhone = new windowsphone(nHandphone3.manufacture, nHandphone3.operationalSystem,
                nHandphone3.model, nHandphone3.harga);
        nWindowsPhone.setWpKeyStone("UUUQIJWOR");
        nHandphone3.displayProduct();
        System.out.println("Wp Key Store : " + nWindowsPhone.getWpKeyStone());

    

    }
}
