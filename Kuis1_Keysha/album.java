package Kuis1_Keysha;

public class album {
    String judul;
    String penyanyi;
    int jumlah;
    int harga;
    static void urutkanAlbum(album[] arrayOfAlbum){
        for (int i = 0; i < arrayOfAlbum.length - 1; i++) { //mengulangi proses pemindaian dan pertukaran elemen-elemen array bubble
            for (int j = 0; j < arrayOfAlbum.length - i - 1; j++) { //membandingkan elemen-elemen array dan melakukan pertukaran jika diperlukan 
                if (arrayOfAlbum[j].judul.compareToIgnoreCase(arrayOfAlbum[j + 1].judul) > 0) {
                    // Tukar posisi album jika judulnya lebih besar
                    album temp = arrayOfAlbum[j];
                    arrayOfAlbum[j] = arrayOfAlbum[j + 1];
                    arrayOfAlbum[j + 1] = temp;
                }
            }
        }
    }
    static void tampilAlbum(album[] arrayOfAlbum){
        
        for(int i = 0; i < arrayOfAlbum.length; i++){
            
            System.out.println("Data album ke-"+(i+1));
            System.out.println("Judul: "+arrayOfAlbum[i].judul);
            System.out.println("Penyanyi: "+arrayOfAlbum[i].penyanyi);
            System.out.println("Jumlah: "+arrayOfAlbum[i].jumlah);
            System.out.println("Harga: "+arrayOfAlbum[i].harga);
            System.out.println();
        
        }
        
    }
    static void albumTerlaris(album[] arrayOfAlbum) {
        int maxTotalPenjualan = 0;
        album albumTerlaris = null;

        for (int i = 0; i < arrayOfAlbum.length; i++) {
            int totalPenjualan = arrayOfAlbum[i].jumlah * arrayOfAlbum[i].harga;
            if (totalPenjualan > maxTotalPenjualan) {
                maxTotalPenjualan = totalPenjualan;
                albumTerlaris = arrayOfAlbum[i];
            }
        }

        if (albumTerlaris != null) {
            System.out.println("Album terlaris:");
            System.out.println("Judul: " + albumTerlaris.judul);
            System.out.println("Penyanyi: " + albumTerlaris.penyanyi);
            System.out.println("Jumlah: " + albumTerlaris.jumlah);
            System.out.println("Harga: " + albumTerlaris.harga);
            System.out.println("Total Penjualan: Rp." + maxTotalPenjualan);
        } else {
            System.out.println("Belum ada album terlaris.");
        }
    }
    static void hitungPenjualan(album[] arrayOfAlbum){
        for(int i = 0; i < arrayOfAlbum.length ; i++){
            System.out.println();
            int totalPenjualan = 0;
        
                totalPenjualan =+ arrayOfAlbum[i].jumlah * arrayOfAlbum[i].harga;
            
            System.out.println("Album ke-"+(i+1)+" Total Penjualan MSC: Rp."+totalPenjualan);
        }
    }

    static void cariAlbum(album[] arrayOfAlbum, String keyword){
        boolean found = false;
        for(int i = 0; i < arrayOfAlbum.length; i++){
            if(arrayOfAlbum[i].judul.equalsIgnoreCase(keyword)){
                System.out.println("Album ditemukan: ");
                System.out.println("Judul: "+arrayOfAlbum[i].judul);
                System.out.println("Penyanyi: "+arrayOfAlbum[i].penyanyi);
                System.out.println("Jumlah: "+arrayOfAlbum[i].jumlah);
                System.out.println("Harga: "+arrayOfAlbum[i].harga);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Album tidak ditemukan");
        }
    }
}
