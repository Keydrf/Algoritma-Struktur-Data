package Pertemuan9.Struk;
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Stack stk = new Stack(8);
        char pilih;

        do{
            System.out.println("---Tambah data---");
            System.out.print("Nomor Transaksi: ");
            int nomorTransaksi = sc.nextInt();
            System.out.print("Tanggal Pembelian: ");
            String tanggalPembelian = sc1.nextLine();
            System.out.print("Jumlah barang: ");
            int jumlahBarang = sc.nextInt();
            System.out.print("Total harga bayar: ");
            double totalHargaBayar = sc.nextDouble();

            Struk s = new Struk(nomorTransaksi, tanggalPembelian, jumlahBarang, totalHargaBayar);
            System.out.print("Apakah anda akan menambah data lagi (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(s);
        } while (pilih == 'y');

        stk.display();

        int jumlahStrukDitukar = 5;
        System.out.println("\nStruk belanja yang ditukarkan dengan voucher:");
        for (int i = 0; i < jumlahStrukDitukar; i++) {
            Struk strukDitukar = stk.pop();
            if (strukDitukar != null) {
                System.out.println("============================================================");
                System.out.println("Nomor Transaksi: " + strukDitukar.nomorTransaksi);
                System.out.println("Tanggal Pembelian: " + strukDitukar.tanggalPembelian);
                System.out.println("Jumlah Barang: " + strukDitukar.jumlahBarang);
                System.out.println("Total Harga Bayar: " + strukDitukar.totalHargaBayar);
            } else {
                break;
        }
}
        System.out.println("\nStruk belanja yang masih tersimpan:");
        stk.display();
        sc.close();
    }
}
