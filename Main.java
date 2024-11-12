
package zakat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
//        Menampilakan nama author
        System.out.println("=========================================");
        System.out.println("Nama\t: Muh Bayu Adjie Nugroh");
        System.out.println("NIM\t: 23533779");
        System.out.println("=========================================\n");
        System.out.println("=========================================");
        
//        Main program
        String ulang;
        do{
           
            System.out.println("Melakukan pengecekan wajib pajak.\n");

            Scanner keyboard =  new Scanner(System.in);

            System.out.print("Masukan nama muzaki: ");
            String namaMuzaki;
            namaMuzaki = keyboard.next();


            System.out.print("Masukan total harta muzaki: Rp. ");
            double hartaMuzaki;
            hartaMuzaki = keyboard.nextDouble();

            Muzaki muzaki = new Muzaki(namaMuzaki, hartaMuzaki);

            double harga_emas = 1483000;
            double nisab = 85 * harga_emas;

            System.out.println("\n=========================================");
            System.out.println("Hasil Pengecekan.\n");

            if ( hartaMuzaki > nisab){

                System.out.println("Muzaki atas nama: " + muzaki.getNama() + ".\nDengan total harta: Rp. " + muzaki.getTotalHarta() +
                        ".\nMelakukan wajib pajak sebanyak: Rp. " + muzaki.total_zakat());

                System.out.print("\nMasukan nama penerima: ");
                Penerima penerima = new Penerima();
                String namaPenerima = keyboard.next();
                penerima.setNama(namaPenerima);

                System.out.println("Zakat akan diberikan kepada: " + penerima.getNama());

            } else {
                System.out.println("Muzaki atas nama: " + muzaki.getNama() + ".\nTidak wajib melakukan zakat mal");
            }
            System.out.println("\n=========================================\n");
            System.out.println("Y/N");
            System.out.print("Apakah anda ingin melakukan pengecekan zakat lagi?: ");
            ulang = keyboard.next();
            System.out.println("\n=========================================\n");
           
        }while(ulang.equalsIgnoreCase("Y"));
    }
}
