package Pertemuan6;

public class HotelService {
  
     Hotel[] rooms;
  
    
    HotelService(int capacity) {
      rooms = new Hotel[capacity];
    }
  
    void tambah(Hotel h) {
      // Menambahkan hotel baru ke array rooms
      for (int i = 0; i < rooms.length; i++) {
        if (rooms[i] == null) {
          rooms[i] = h;
          break;
        }
      }
    }
  
    public void tampilAll() {
        // Menampilkan semua hotel di array rooms
        for (Hotel h : rooms) {
          if (h != null) {
            System.out.println("Nama: " + h.getNama());
            System.out.println("Kota: " + h.getKota());
            System.out.println("Harga: " + h.getHarga());
            System.out.println("Bintang: " + h.getBintang());
            System.out.println(); // Menambahkan baris kosong untuk pemisah
          }
        }
      }
  
    void bubbleSortHargaAsc() {
      for (int i = 0; i < rooms.length - 1; i++) {
        for (int j = 0; j < rooms.length - i - 1; j++) {
          if (rooms[j].getHarga() > rooms[j + 1].getHarga()) {
            Hotel temp = rooms[j];
            rooms[j] = rooms[j + 1];
            rooms[j + 1] = temp;
          }
        }
      }
    }
  
    void bubbleSortBintangDesc() {
      for (int i = 0; i < rooms.length - 1; i++) {
        for (int j = 0; j < rooms.length - i - 1; j++) {
          if (rooms[j].getBintang() < rooms[j + 1].getBintang()) {
            Hotel temp = rooms[j];
            rooms[j] = rooms[j + 1];
            rooms[j + 1] = temp;
          }
        }
      }
    }
  
    void selectionSortHargaAsc() {
      for (int i = 0; i < rooms.length - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < rooms.length; j++) {
          if (rooms[j].getHarga() < rooms[minIdx].getHarga()) {
            minIdx = j;
          }
        }
        Hotel temp = rooms[minIdx];
        rooms[minIdx] = rooms[i];
        rooms[i] = temp;
      }
    }
  
    void selectionSortBintangDesc() {
      for (int i = 0; i < rooms.length - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < rooms.length; j++) {
          if (rooms[j].getBintang() > rooms[maxIdx].getBintang()) {
            maxIdx = j;
          }
        }
        Hotel temp = rooms[maxIdx];
        rooms[maxIdx] = rooms[i];
        rooms[i] = temp;
      }
    }
  
  }
