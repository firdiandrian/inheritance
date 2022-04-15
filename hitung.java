/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_modul3;

/**
 *
 * @author RENDI
 */
public class hitung {
        public static void main(String[] args) {
        bangundatar bangundatar=new bangundatar();
        
        persegi Persegi = new persegi();
        Persegi.sisi=8;
        
        persegipanjang perjang =new persegipanjang();
        perjang.lebar=11;
        perjang.panjang=2;
        
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
        
    }

}
