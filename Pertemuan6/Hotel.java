package Pertemuan6;

public class Hotel {

    private String nama;
    private String kota;
    private int harga;
    private int bintang;
  
    public Hotel(String n, String k, int h, int b) {
      nama = n;
      kota = k;
      harga = h;
      bintang = b;
    }
  
    public String getNama() {
      return nama;
    }
  
    public void setNama(String nama) {
      this.nama = nama;
    }
  
    public String getKota() {
      return kota;
    }
  
    public void setKota(String kota) {
      this.kota = kota;
    }
  
    public int getHarga() {
      return harga;
    }
  
    public void setHarga(int harga) {
      this.harga = harga;
    }
  
    public int getBintang() {
      return bintang;
    }
  
    public void setBintang(byte bintang) {
      this.bintang = bintang;
    }
  
}