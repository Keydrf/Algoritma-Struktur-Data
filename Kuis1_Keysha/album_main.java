package Kuis1_Keysha;
import java.util.Scanner;

import Pertemuan3.PersegiPanjang;
public class album_main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        album[] arrayOfAlbum = new album[5];
        do {
        System.out.println("PERUSAHAAN MSC");
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah album");
        System.out.println("2. Lihat album");
        System.out.println("3. Penjualan");
        System.out.println("4. Cari Album");
        System.out.println("5. Selesai");

        
        String pilmenu = input.nextLine();
        // input.nextLine();
        
        if(pilmenu.equalsIgnoreCase("1")){
            // System.out.print("Masukkan jumlah album yang ditambahkan: ");
            // int jmlalbum = input.nextInt();
            // album[] arrayOfalbum = new album[jmlalbum];
            for(int i = 0; i < arrayOfAlbum.length; i++ ){
                arrayOfAlbum[i] = new album();
                System.out.println("Data album ke-"+(i+1));
                System.out.print("Masukkan judul: ");
                arrayOfAlbum[i].judul = input.nextLine();
                System.out.print("Masukkan penyanyi: ");
                arrayOfAlbum[i].penyanyi = input.nextLine();
                System.out.print("Masukkan jumlah: ");
                arrayOfAlbum[i].jumlah = input.nextInt();
                System.out.print("Masukkan harga: ");
                arrayOfAlbum[i].harga = input.nextInt();
                input.nextLine();
            }
            
        } else if(pilmenu.equalsIgnoreCase("2")){
            System.out.println();
            album.urutkanAlbum(arrayOfAlbum);
            album.tampilAlbum(arrayOfAlbum);
        }else if(pilmenu.equalsIgnoreCase("3")){
            System.out.println();
            album.hitungPenjualan(arrayOfAlbum);
            album.albumTerlaris(arrayOfAlbum);
        }else if(pilmenu.equalsIgnoreCase("4")){
            System.out.println();
            System.out.print("Masukkan judul album yang dicari: ");
            String keyword = input.nextLine();
            album.cariAlbum(arrayOfAlbum, keyword);
        }else if(pilmenu.equalsIgnoreCase("5")){
            break;
        }else{
            System.out.println("Pilihan yang anda masukkan salah");
        }
        } while (true);
        
    }
}
