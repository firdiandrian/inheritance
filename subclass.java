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
public class subclass extends superclass{
    String nama ="";
    int umur = 99;

    public void  setnama (String nama){
        this.nama = nama;
    }
            
            
    public void cetak (){
        System.out.println("anak ini punya sifat "+ super.sifat);
        System.out.println("yang bernama"+nama);
        System.out.println("berumur"+umur);
        System.out.println("dengan tinggi badan"+super.TB);
        super.hobbi();
    }
}