package Pertemuan12.vaksinasi;
import java.util.Scanner;
public class Main {
    // 1. tambah data penerima vaksin
    // 2. hapus data pengantri vaksin
    // 3. daftar penerima vaksin
    // 4. keluar
    public static void menu(){
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++++");
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
                        System.out.println("------------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("No Antrian: ");
                        int no = sc.nextInt();
                        System.out.println("Nama Penerima: ");
                        String nama = sc1.nextLine();
                        dll.addLast(no, nama);
                       
                        break;

                    case 2:
                        dll.removeFirst();
                        break;
                    
                    case 3:
                        dll.print();
                        System.out.println("Sisa antrian: "+dll.size());
                        break;
                    
                
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while(pilih == 1 || pilih == 2 || pilih == 3 );
    }
    

}
