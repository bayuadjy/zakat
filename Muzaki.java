
package zakat;

public class Muzaki {
        private String nama;
        private double total_harta;
        
        public Muzaki(String nama, double total_harta){
            this.nama = nama;
            this.total_harta = total_harta;
        }
        
        public Muzaki(){
            nama = "Tidak diketahui";
            total_harta = 0;
        }
        
        public double total_zakat(){
            return total_harta * 0.025;
        }
        
        public String getNama(){
            return nama;
        }
        
        public double getTotalHarta(){
            return total_harta;
        } 
        
        
        
}
