/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tessiswa;

/**
 *
 * @author MOKLET-2
 */
public class Tessiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAge(23);
        siswa.getAddress("Malang");
        
        System.out.println("Name : "+ siswa.getName()+" Absen : "+ siswa.getAbsen()+" Address : "+siswa.getAddress());
    }
    
}
