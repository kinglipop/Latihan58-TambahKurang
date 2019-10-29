/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan58.tambahkurang;

/**
 *
 * @author Firman Alfinas
 */
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih() {
        int hasil = getX() - getY();
        System.out.println("Hasil Selisih "+getX()+" - "+getY()+" = "+hasil);
    }
}
