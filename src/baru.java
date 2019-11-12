
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARVINA
 */
public class baru {
     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
            System.out.println("=========SELAMAT DATANG DITOKO JAYA BARU=========\n      *********Selamat Berbelanja********");
            System.out.print("Silahkan masukkan nama Anda = ");
            String nama = input.nextLine();
            System.out.print("Masukkan tanggal pembelian = ");
            int tanggal = input.nextInt();         
        System.out.println("===================================================");
        System.out.println("Pilih jenis merk sepatu yang anda inginkan : ");
        System.out.println("1. Adidas");
        System.out.println("2. Nike");
        System.out.println("3. Skechers");
        System.out.println("4. Puma");
        System.out.println("5. Reebok");
        System.out.println("6. Vans");
        System.out.println("7. Convrese");
        System.out.println("8. Fila");
        System.out.println("9. 910");
         System.out.println("   ======Masukkan pilihan anda====== = ");
         
        Scanner dep = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
         int pilihan = input.nextInt();
            switch (pilihan) {
                   
         case 1:
                    System.out.println("Pilih kategori sepatu anda : ");
                    System.out.println("1. olahraga \t 2. Kantoran\t ");
                    System.out.println("3. Lari \t 4. Santai\t ");
                    System.out.print("   ======Masukkan Pilihan Anda====== = ");
                    pilihan = input.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.println("Pilih jenis sepatu anda");
                            System.out.println("1. Laki - laki ");
                            System.out.println("2. Perempuan ");
                            System.out.print("   ======Masukkan Pilihan Anda====== = ");
                            pilihan = input.nextInt();
                            switch (pilihan) {
                                case 1:
                                    System.out.println("Pilih ukuran sepatu anda : ");
                                     System.out.println("1. 25\t 2. 26");
                                     System.out.println("3. 27\t 4. 28");
                                     System.out.println("5. 29\t 6. 30");
                                     System.out.println("7. 31\t 8. 32");
                                     System.out.println("9. 33\t 9. 34");
                                     System.out.print("   ======Masukkan Pilihan Anda====== = ");
                                    pilihan = input.nextInt();
                                    switch (pilihan) {
                                        case 1:
                                            System.out.println("Pilih Warna Sepatu Anda : ");
                                            System.out.println("1  Black\t 2. White\t 3. Gold\t");
                                            System.out.println("4. Silver\t 5. Orange\t 6. Green\t");
                                            System.out.println("7. Yellow\t 8. Blue\t 9. Red\t");
                                            System.out.print("==== Masukkan Pilihan Anda ===== = ");
                                            pilihan = input.nextInt();
                                            
             Scanner dev = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = dev.nextInt();
            int harga = 900000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
    {
        String devi = null;
        String a = devi;
        System.out.println("Nama Pembeli : " + a );
    }
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");            
                        }
                    }
                }
            }
        }
}