
package abstractdora;

public class DoraMini extends Robot{
   
    
    @Override
    public void setNama(String nama) {
        super.nama = nama;
    }

    @Override
    public void displayData() {
        System.out.println("Nama: " + nama);
        System.out.println("Pemilik: " + pemilik);
        System.out.println("Tahun Pembuatan: " + tahun);
    }
    
    public void sayDora(){
        System.out.println("Halo, Saya "+ nama);
    }
    
}
