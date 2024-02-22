import java.util.Scanner;
public class PraktikumFungsi {
    // Data stock bunga
    static Scanner inputAngka = new Scanner(System.in);
     static int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    // Data harga bunga
     static int[] hargaBunga = {75000, 50000, 60000, 10000};

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    public static void pendapatanPerCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan Cabang RoyalGarden " + (i + 1) + ": Rp" + totalPendapatan);
        }
    }
    public static void stokSetiapCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            System.out.println("Stok Cabang RoyalGarden " + (i + 1) + ":");
            System.out.println("Aglonema: " + stockBunga[i][0]);
            System.out.println("Keladi: " + stockBunga[i][1]);
            System.out.println("Alocasia: " + stockBunga[i][2]);
            System.out.println("Mawar: " + stockBunga[i][3]);
            System.out.println();
        }
    }
    // Fungsi untuk mengetahui jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
    // dengan pengurangan stock karena bunga mati
    public static void penguranganStok() {
        // Rincian pengurangan stok karena bunga mati
        int penguranganAglonema = 1;
        int penguranganKeladi = 2;
        int penguranganAlocasia = 0;
        int penguranganMawar = 5;

        // Pengurangan stok pada cabang RoyalGarden 4
        stockBunga[3][0] -= penguranganAglonema;
        stockBunga[3][1] -= penguranganKeladi;
        stockBunga[3][3] -= penguranganMawar;

    }

    public static void main(String[] args) {
        System.out.println("===================");
            System.out.println("Selamat Datang di Royal Garden");
            System.out.println("===================");
            System.out.println("Pilih Menu (1/2) :");
            System.out.println("1. Pendapatan");
            System.out.println("2. Stok Awal");
            System.out.println("3. Stok setelah pengurangan");
            System.out.println("===================");
            System.out.print("Pilihan anda : ");
            int menu = inputAngka.nextInt();
            if(menu==1){
               pendapatanPerCabang();;
            } else if(menu == 2){
                stokSetiapCabang();
            } else if(menu == 3){
                penguranganStok();
                stokSetiapCabang();
            } else{
                System.out.println("Menu tidak valid");
            }
        
    }
}
