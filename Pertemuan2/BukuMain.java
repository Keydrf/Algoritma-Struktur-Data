package Pertemuan2;

public class BukuMain {
    public static void main(String[] args) {
        Buku13 bk1 = new Buku13(); 
        bk1.judul = "Today Ends Tomorrow Comes"; 
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku13 bk2 = new Buku13("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku13 bukuKeysha = new Buku13("Surga itu kamu", "Maliq", 215, 9, 21000);
        bukuKeysha.terjual(5);
        bukuKeysha.tampilInformasi();

        bukuKeysha.hitungHargaTotal(bukuKeysha.harga, 5);  
        bukuKeysha.hitungDiskon(bukuKeysha.harga * 5);
        bukuKeysha.hitungHargaBayar(5);   
    }
 
}
