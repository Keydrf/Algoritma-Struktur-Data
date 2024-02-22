package Pertemuan2;

import java.security.PublicKey;

public class Buku13 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa stok: "+stok);
        System.out.println("Harga: Rp "+harga);
    }

    void terjual(int jml){
        stok -= jml;     
    }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
    public Buku13(){

    }
    public Buku13(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    void hitungHargaTotal(int har, int jml){
        harga = har;
        double total = harga * jml;
        System.out.println("Harga total: Rp "+total);
    }
    void hitungDiskon(double total){
        double diskon;
        if(total>150000){
            diskon = 0.12;
        } else if(total >= 75000 && total<= 150000){
            diskon = 0.05;
        } else{
            diskon = 0;
        }
        double hargaSetelahDiskon = total - (total*diskon);
        System.out.println("Diskon: "+(diskon * 100)+"%");
        
    }
    void hitungHargaBayar(int jml){
        int hargaTotal = harga * jml;
        double diskon = 0;
        if(hargaTotal > 150000){
            diskon = 0.12;
        } else if(hargaTotal >= 75000 && hargaTotal <= 150000){
            diskon = 0.05;
        }
    
        double hargaBayar = hargaTotal - (hargaTotal * diskon);
        System.out.println("Harga bayar setelah diskon: Rp "+hargaBayar );
    }
    
}

