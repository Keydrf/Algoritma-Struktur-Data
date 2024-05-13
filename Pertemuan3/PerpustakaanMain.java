package Pertemuan3;
import java.util.Scanner;
public class PerpustakaanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah peminjam: ");
        int jmlPinj = sc.nextInt();
        Perpustakaan[] arrayPinjam = new Perpustakaan[jmlPinj];
        sc.nextLine();

        for(int i = 0; i < arrayPinjam.length; i++){
            arrayPinjam[i] = new Perpustakaan();
            System.out.println("Data peminjam ke-"+(i+1));
            System.out.print("Masukkan nim: ");
            arrayPinjam[i].nim = sc.nextLine();
            System.out.print("Masukkan nama: ");
            arrayPinjam[i].nama = sc.nextLine();
            System.out.print("Masukkan kode buku: ");
            arrayPinjam[i].kodeBuku = sc.nextLine();
            System.out.print("Masukkah judul buku: ");
            arrayPinjam[i].judulBuku = sc.nextLine();
            System.out.print("Masukkan nama penulis: ");
            arrayPinjam[i].namaPenulis = sc.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            arrayPinjam[i].tahunTerbit = sc.nextLine();
            System.out.print("Masukkan jumlah buku: ");
            arrayPinjam[i].jmlBuku = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan tanggal peminjaman (dd/mm/yyyy): ");
            arrayPinjam[i].tglPinjam = sc.nextLine();
            
            System.out.print("Masukkan tanggal pengembalian (dd/mm/yyyy): ");
            arrayPinjam[i].tglKembali = sc.nextLine();

            sc.nextLine();
        }
        Perpustakaan.lihatPinjam(arrayPinjam);

    }
}
