/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Bus3 {
    public int penumpang;
    public int maxpenumpang;
    
    public Bus3(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp>maxpenumpang){
        System.out.println("penumpang melebihi kuota");
        }
        else{
         this.penumpang = temp;
        }
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang bus sekarang : "+penumpang);
        System.out.println("maksimum Penumpang yang seharusnya adalah : "+maxpenumpang);   
    }
    
    
    //penjelasan poin b
    //pada saat kelas latihan1 dijalankan terdapat beberapa error karena variabel penumpang dan maxpenumpang diubah memjadi private sehingga
   //kelas bus tidak dapat merubah dari nilai variabel private tersebut. sehingga dibutuhkan method mutator pada kelas bus agar dapat mengakses
   //variabel yang di private sekaligus memberikan kondisi agar tidak terjadi overload

}
