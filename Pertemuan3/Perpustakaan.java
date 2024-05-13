package Pertemuan3;

public class Perpustakaan {
    
    public String nim;
    public String nama;
    public String kodeBuku;
    public String judulBuku;
    public String namaPenulis;
    public String tahunTerbit;
    public int jmlBuku;
    public String tglPinjam;
    public String tglKembali;
    static void lihatPinjam(Perpustakaan[] arrayPinjam){
        for(int i = 0; i < arrayPinjam.length; i++){
            System.out.println();
            System.out.println("Data peminjam ke-"+(i+1));
            System.out.println("NIM peminjam: "+arrayPinjam[i].nim);
            System.out.println("Nama peminjam: "+arrayPinjam[i].nama);
            System.out.println("Kode buku: "+arrayPinjam[i].kodeBuku);
            System.out.println("Judul buku: "+arrayPinjam[i].judulBuku);
            System.out.println("Nama penulis: "+arrayPinjam[i].namaPenulis);
            System.out.println("Tahun terbit: "+arrayPinjam[i].tahunTerbit);
            System.out.println("Jumlah buku: "+arrayPinjam[i].jmlBuku);
            System.out.println("Tanggal peminjaman: "+arrayPinjam[i].tglPinjam);
            System.out.println("Tanggal pengembalian: "+arrayPinjam[i].tglKembali);
            System.out.println();
        }
    }
    
}
