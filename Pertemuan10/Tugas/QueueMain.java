package Pertemuan10.Tugas;
import java.util.Scanner;
public class QueueMain {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian belakang");
        System.out.println("5. Cek posisi antrian");
        System.out.println("6. Data pasien");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scp = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int jumlah = sc.nextInt();
        Queue antrips = new Queue(jumlah);
        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor ID: ");
                    int noID = sc.nextInt();
                    System.out.print("Masukkan nama: ");
                    String nama = scp.nextLine();
                    System.out.print("Masukkan jenis kelamin: ");
                    char jenisKelamin = sc.next().charAt(0);
                    System.out.print("Masukkan umur: ");
                    int umur = sc.nextInt();

                    Pasien ps = new Pasien(nama, noID, jenisKelamin, umur);
                    sc.nextLine();
                    antrips.Enqueue(ps);
                    break;
                
                case 2:
                    Pasien data = antrips.Dequeue();  
                    if(!"".equals(data.noID) && !"".equals(data.nama) && 
                    !"".equals(data.jenisKelamin) && !"".equals(data.umur)){
                        System.out.println("Antrian yang keluar: "+ data.noID + ", " + data.nama + ", " + 
                        data.jenisKelamin + ", " + data.umur);
                        break;
                    }
                
                case 3:
                    antrips.peek();
                    break;
                
                case 4:
                    antrips.peekRear();
                    break;
                
                case 5:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String namePosition = scp.nextLine();
                    int position = antrips.peekPosition(namePosition);
                    if (position != -1) {
                        System.out.println("Posisi " + namePosition + ": " + position);
                    } else {
                        System.out.println("Elemen " + namePosition + " tidak ditemukan dalam antrian.");
                    }

                case 6:
                    antrips.print();
                    break;
            }
        } while (pilih == 1 || pilih ==2 || pilih == 3 || 
        pilih == 4 || pilih == 5 || pilih == 6);
    }
}
