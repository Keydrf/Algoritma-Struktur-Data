package Pertemuan3;

public class Pengembalian {
    public String nim;
    public String nama;
    public String kodeBuku;
    public String judulBuku;
    public String namaPenulis;
    public String tahunTerbit;
    public int jmlBuku;
    public String tglPinjam;
    public String tglKembali;
    public int jmlHariPinjam;
    public double denda;

    static void tampilPengembalian(Pengembalian[] arrayKembali){
        for(int i = 0; i < arrayKembali.length; i++){
            System.out.println();
            System.out.println("Data pengembalian ke-"+(i+1));
            System.out.println("NIM pengembali: "+arrayKembali[i].nim);
            System.out.println("Nama pengembali: "+arrayKembali[i].nama);
            System.out.println("Kode buku: "+arrayKembali[i].kodeBuku);
            System.out.println("Judul buku: "+arrayKembali[i].judulBuku);
            System.out.println("Nama penulis: "+arrayKembali[i].namaPenulis);
            System.out.println("Tahun terbit: "+arrayKembali[i].tahunTerbit);
            System.out.println("Jumlah buku: "+arrayKembali[i].denda);
            System.out.println("Tanggal pinjam: "+arrayKembali[i].tglPinjam);
            System.out.println("Tanggal kembali: "+arrayKembali[i].tglKembali);
            System.out.println("Jumlah hari pinjam: "+arrayKembali[i].jmlHariPinjam);
            System.out.println("Denda: "+arrayKembali[i].hitungDenda());
            System.out.println();
        }
    }
    public double hitungDenda(){
        if(jmlHariPinjam > 7){
            return (jmlHariPinjam - 7) * 1000;
        } else{
            return 0;
        }
    }
}
