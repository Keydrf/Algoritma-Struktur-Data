package Pertemuan3;
import java.util.Scanner;
public class PengembalianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pengembali: ");
        int jmlkembali = sc.nextInt();
        Pengembalian[] arrayKembali = new Pengembalian[jmlkembali];
        sc.nextLine();

        for(int i = 0; i < arrayKembali.length; i++){
            arrayKembali[i] = new Pengembalian();
            System.out.println("Pengembalian ke-"+(i+1));
            System.out.print("Masukkan NIM: ");
            arrayKembali[i].nim = sc.nextLine();
            System.out.print("Masukkan nama: ");
            arrayKembali[i].nama = sc.nextLine();
            System.out.print("Masukkan kode buku: ");
            arrayKembali[i].kodeBuku = sc.nextLine();
            System.out.print("Masukkan judul buku: ");
            arrayKembali[i].judulBuku = sc.nextLine();
            System.out.print("Masukkan nama penulis: ");
            arrayKembali[i].namaPenulis = sc.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            arrayKembali[i].tahunTerbit = sc.nextLine();
            System.out.print("Masukkan jumlah buku: ");
            arrayKembali[i].jmlBuku = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan tanggal pinjam (dd/mm/yyyy): ");
            arrayKembali[i].tglPinjam = sc.nextLine();
            System.out.print("Masukkan tanggal kembali (dd/mm/yyyy): ");
            arrayKembali[i].tglKembali = sc.nextLine();
            System.out.print("Masukkan jumlah hari pinjam: ");
            arrayKembali[i].jmlHariPinjam = sc.nextInt();
            // System.out.println(arrayKembali[i].hitungDenda());
            sc.nextLine();
        }

        Pengembalian.tampilPengembalian(arrayKembali);
    }
}
