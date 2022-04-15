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
public class tp_pegawai extends tp_identitas{
     String jeniskelamin;
    int nomorpegawai;
    
    public void identitas(){
        jeniskelamin = "Laki-Laki";
        System.out.println("jenis Kelamin: "+jeniskelamin);
    }
     public void setnomorpegawai(int nomorpegawai){
        this.nomorpegawai= nomorpegawai;
    }
     public void cetak(){
         super.identitas();
    }
     public void nomorpegawai(){
         System.out.println("Nomor Pegawai: "+nomorpegawai);
     }
}
