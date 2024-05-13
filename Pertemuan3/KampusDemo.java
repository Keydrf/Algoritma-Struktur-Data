package Pertemuan3;
import java.util.Scanner;
public class KampusDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();
        input.nextLine();

        Kampus[] arrayOfDataMahasiswa = new Kampus[jmlMhs];
        double totalIpk = 0;
        for(int i = 0; i < arrayOfDataMahasiswa.length; i++){
            arrayOfDataMahasiswa[i] = new Kampus();

            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            arrayOfDataMahasiswa[i].nama = input.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            arrayOfDataMahasiswa[i].nim = input.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa (P/L): ");
            arrayOfDataMahasiswa[i].jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK mahasiswa: ");
            arrayOfDataMahasiswa[i].ipk = input.nextDouble();
            totalIpk += arrayOfDataMahasiswa[i].ipk;
            input.nextLine();
        }
        int no = 1;
        for(Kampus dataMahasiswa : arrayOfDataMahasiswa){
            System.out.println("Data mahasiswa ke-"+no);
            System.out.println("NIM: "+dataMahasiswa.nim);
            System.out.println("Nama: "+dataMahasiswa.nama);
            System.out.println("Jenis kelamin: "+dataMahasiswa.jenisKelamin);
            System.out.println("Nilai IPK: "+dataMahasiswa.ipk);
            System.out.println();
        }
        double rataIpk = hitungRataIpk(jmlMhs, totalIpk);
        System.out.printf("Rata-rata ipk: %.1f%n",rataIpk);
    }
    
    static double hitungRataIpk(int jumlahMhs, double totalIpk){
        return totalIpk / jumlahMhs;
    }
    
}
