import java.util.Scanner;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;

public class programtravel{
    public static void main(String[] args) {

        Scanner input_pembelian = new Scanner(System.in);
        Scanner input_pembelian2 = new Scanner(System.in);
        int tarif_Tiket = 0;
        int harga=0;
        //String kelas= "";
        String rute = "";
        int jumlah_Bayar;
        Double Kembalian;

        System.out.println("SELAMAT DATANG");
        System.out.println();
        System.out.println("DI APLIKASI INI");
        System.out.println();
        System.out.println("Masukan Nama");
        String Nama_Pemesan = input_pembelian.next();
        System.out.println();
        System.out.println("Pilihlah Rute Anda");
        System.out.println("1.Jakarta - Bandung");
        System.out.println("RP.90.000{NON-AC} - RP.130.000{AC}");
        System.out.println();
        System.out.println("2. Bandung - Jakarta");
        System.out.println("RP.70.000{NON-AC} - RP.150.000{AC}");
        System.out.println();
        System.out.println("3. Jakarta - Tasikmalaya");
        System.out.println("RP.50.000{NON-AC} - RP.70.000{AC}");
        System.out.println();
        System.out.println("Masukan Tujuan Anda");
        int Rute_Tujuan = input_pembelian.nextInt();
        System.out.println("Pilih Kelas Bus");
        System.out.println("1. AC");
        System.out.println("2. NON-AC");
        String kelas = input_pembelian2.nextLine();

        System.out.println();
        System.out.println("Masukan Jumlah Kursi Anda");
        System.out.println("QTY : ");
        int jumlah_Kursi = input_pembelian.nextInt();
        int total_Tiket= jumlah_Kursi*harga;

        //int total_Tiket_AC = tarif_Tiket*jumlah_kursi;
        //int total_Tiket_NONAC = tarif_Tiket*jumlah_kursi;

        Object fasilitas;
        switch (Rute_Tujuan) {
            case 1 :
            rute = "Jakarta - Bandung";
            if(kelas.equalsIgnoreCase("NON-AC"))
            {
            harga = 90000;
            }
            else if(kelas.equalsIgnoreCase("AC"))
            {
            harga = 130000;
            }
            break;
            case 2 :
            rute = "Bandung - Jakarta";
            if(kelas.equalsIgnoreCase("NON-AC"))
            {
            harga = 70000;
            }
            else if(kelas.equalsIgnoreCase("AC"))
            {
            harga = 150000;
            }
            break;
            case 3 :
            rute = "Jakarta - Tasikmalaya";
            if(kelas.equalsIgnoreCase("NON-AC"))
            {
            harga = 50000;
            }
            else if(kelas.equalsIgnoreCase("AC"))
            {
            harga = 70000;
            }
            break;

        }
        
        jumlah_Bayar = harga * jumlah_Kursi;
        
        System.out.println("Nama : " + Nama_Pemesan);
        System.out.println("Rute : " + rute);
        System.out.println("Kelas : "+ kelas);
        System.out.println("Jumlah Kursi : "+ jumlah_Kursi);
        System.out.println("Total Bayar = RP."+ jumlah_Bayar);
    }
}