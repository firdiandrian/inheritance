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
public class tp_hasil {
     public static void main(String[] args){
        tp_pegawai identitaspegawai = new tp_pegawai();
        identitaspegawai.cetak();
        identitaspegawai.identitas();
        identitaspegawai.setnomorpegawai(6587587);
        identitaspegawai.nomorpegawai();
        
        tp_gaji gaji=new tp_gaji();
        System.out.println("Bekerja dibagian admin");
        gaji.gaji(6,2);
        gaji.gaji(6,2,2);
    }
}
