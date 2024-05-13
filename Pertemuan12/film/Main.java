package Pertemuan12.film;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("===================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. keluar");
        System.out.println("===================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            try{
                switch (pilih) {
                    case 1:
                        System.out.println("Masukkan Data Film Posisi Awal");
                        System.out.print("ID Film: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Judul Film: ");
                        String judul = sc.nextLine();
                        System.out.print("Rating Film: ");
                        // sc.useLocale(Locale.UK);
                        double rating = sc.nextDouble();
                        dll.addFirst(id, judul, rating);
                        break;
                    case 2:
                        System.out.println("Masukkan Data Posisi Akhir");
                        System.out.print("ID Film: ");
                        int id1 = sc.nextInt();
                        System.out.print("Judul Film: ");
                        String judul1 = sc1.nextLine();
                        System.out.print("Rating Film: ");
                        double rating1 = sc.nextDouble();
                        dll.addLast(id1, judul1, rating1);
                        break;
                    case 3:
                        System.out.println("Masukkan Data Film");
                        System.out.println("Urutan ke-");
                        System.out.print("ID Film: ");
                        int id2 = sc.nextInt();
                        System.out.print("Judul Film: ");
                        String judul2 = sc1.nextLine();
                        System.out.print("Rating Film: ");
                        double rating2 = sc.nextDouble();
                        System.out.print("Data Film Ini Akan Masuk di urutan ke-");
                        int index = sc.nextInt();
                        index--;
                        dll.add(id2, judul2, rating2, index);
                        break;
                    case 4:
                        dll.removeFirst();
                        //System.out.println("Total film: " + dll.size());
                        break;
                    case 5: 
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan index yang akan dihapus: ");
                        int index1 = sc.nextInt();
                        index1--;
                        dll.remove(index1);
                        break;
                    case 7:
                        dll.print();
                        System.out.println("Total film: " + dll.size());
                        break;
                    case 8:
                        System.out.print("Masukkan ID yang ingin dicari: ");
                        int cari = sc.nextInt();
                        dll.searchById(cari);
                        dll.displayDataAndPosition(cari);
                        
                        break;
                    case 9:
                        dll.sortByRatingDescending();
                        System.out.println("Berhasil Mengurutkan Data");
                        dll.print();
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 ||pilih == 7 || pilih == 8 || pilih == 9);
    }
}
