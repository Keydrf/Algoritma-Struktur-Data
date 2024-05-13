package Pertemuan7;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);

        System.out.println("-------------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-----------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();


            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);

        }
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cari = sl.nextLine();
        System.out.println("menggunakan binary");
        int posisi = data.binarySearchByName(cari);

        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        // System.out.println("menggunakan sequential search");
        // int posisi = data.FindSeqSearch(cari);

        // data.TampilPosisi(cari, posisi);

        // data.TampilData(cari, posisi);

        // System.out.println("==============================================================");
        // System.out.println("menggunakan binary Search");
        // posisi = data.FindBinarySearchDesc(cari, 0, jumMhs-1);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);


    }
}
