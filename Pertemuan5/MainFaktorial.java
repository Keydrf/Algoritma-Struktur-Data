package Pertemuan5;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("=========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        long awal = System.currentTimeMillis();
        System.out.println("Waktu awal : "+ String.valueOf(awal)+" milidetik");

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("=========================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i = 0; i < elemen; i++){
            // long startTimeBP = System.currentTimeMillis();
            int hasilBP = fk[i].faktorialBP(fk[i].nilai);
            // long endTimeBP = System.currentTimeMillis();
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+ hasilBP);
            // System.out.println("Waktu eksekusi Brute Force: " + (endTimeBP - startTimeBP) + " ms");
        }
        
        System.out.println("=========================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i = 0; i<elemen; i++){
            // long startTimeDC = System.currentTimeMillis();
            int hasilDC = fk[i].faktorialDC(fk[i].nilai);
            // long endTimeDC = System.currentTimeMillis();
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+ hasilDC);
            // System.out.println("Waktu eksekusi Divide and Conquer: " + (endTimeDC - startTimeDC) + " ms");
        }
        System.out.println("=========================================================");
        long akhir = System.currentTimeMillis();
        System.out.println("Waktu akhir: "+String.valueOf(akhir)+" milidetik");
        long elapsTime = akhir-awal;
        System.out.println("Interval waktu : "+String.valueOf(elapsTime)+" milidetik");
    }
    
    
}
