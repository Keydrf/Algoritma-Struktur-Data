package Pertemuan6;

public class MainHotel {

    public static void main(String[] args) {
      HotelService service = new HotelService(5);
  
      // Menambahkan beberapa contoh hotel
      Hotel h1 = new Hotel("Savana", "Malang", 200000, 4);
      Hotel h2 = new Hotel("The Grand", "Yogyakarta", 450000, 5);
      Hotel h3 = new Hotel("Parahyangan", "Bandung", 300000, 3);
      Hotel h4 = new Hotel("Mandarin Oriental", "Jakarta", 800000, 5);
      Hotel h5 = new Hotel("Mercure", "Surabaya", 500000, 4);
    //   service.tambah(new Hotel("Savana", "Malang", 200000, 4));
    //   service.tambah(new Hotel("The Grand", "Yogyakarta", 450000, 5));
    //   service.tambah(new Hotel("Parahyangan", "Bandung", 300000, 3));
    //   service.tambah(new Hotel("Mandarin Oriental", "Jakarta", 800000, 5));
    //   service.tambah(new Hotel("Mercure", "Surabaya", 500000, 4));
  
      service.tambah(h1);
        service.tambah(h2);
        service.tambah(h3);
        service.tambah(h4);
        service.tambah(h5);

      System.out.println("**Sebelum Sorting:**");
      service.tampilAll();
  
      System.out.println("\n**Sorting berdasarkan Harga (Ascending):**");
      service.bubbleSortHargaAsc();
      service.tampilAll();
  
      System.out.println("\n**Sorting berdasarkan Rating Bintang (Descending):**");
      service.selectionSortBintangDesc();
      service.tampilAll();
    }
  }
