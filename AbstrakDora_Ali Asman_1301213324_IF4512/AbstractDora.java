
package abstractdora;

public class AbstractDora {

    public static void main(String[] args) {
        DoraMini dora = new DoraMini();
        dora.setNama("Dora Mini");
        dora.sayDora();
        
        dora.tahun = 2212;
        dora.pemilik = "Nobisuke";
        
        dora.displayData();

        
    }
    
}
