/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodidentitas;

/**
 *
 * @author MOKLET-2
 */
public class ide { // inialisasi variabel
    String pesan = "Identitas siswa baru";
    String nama = "Aulia Febrianti";
    String alamat = "Jln. sedudo nganjuk";
    String jurusan = "TKJ";
    String namaayah = "Hery Kurniawan";
    String namaibu = "Lusi Anastaya";
    int umur =15;
    // pemangillan 
    String pesan(){
        return pesan;
    }
    String nama(){
     return nama;
    }
    String alamat(){
        return alamat;
    }
    String jurusan(){
        return jurusan;
    }
    String namaayah(){
        return namaayah; 
    }
    String namaibu(){
        return namaibu;
    }
    int umur(){
        return umur;
    }
    static void ideee(){//membuat method void untuk output
    ide ku = new ide ();
    //output
    System.out.println("<< "+ku.pesan()+" >>");
     System.out.println("==========================");
    System.out.println("Nama Siswa :"+ ku.nama());
    System.out.println("Umur Siswa :"+ ku.umur()+" Tahun");
    System.out.println("Alamat Siswa :" +ku.alamat());
    System.out.println("Jurusan yang diambil :" +ku.jurusan());
    System.out.println("Nama Ayah :" +ku.namaayah());
    System.out.println("Nama Ibu :" +ku.namaibu());
          
     }
}

