package Pertemuan5;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("Program Menghitung Keuntungan Total");   
        System.out.print("Masukkan jumlah perusahaan : ");
        int jmlPerusahaan = sc.nextInt();

        Sum [] perusahaan = new Sum[jmlPerusahaan];

        for(int i = 0; i < jmlPerusahaan; i++){
            System.out.println("==================================================================");
            System.out.print("Masukkan jumlah bulan perusahaan ke-"+(i+1)+": ");
            int elm = sc.nextInt();
            double[] keuntungan = new double[elm];
            for(int j = 0; j < elm; j++){
                System.out.print("Masukkan keuntungan untuk bulan ke-"+(j+1)+" perusahan ke-"+(i+1)+": ");
                keuntungan[j] = sc.nextDouble();
            }
            perusahaan[i] = new Sum(elm, keuntungan);
        }
        // System.out.print("Masukkan jumlah bulan : ");
        // int elm = sc.nextInt();

        // Sum sm = new Sum(elm);
        // System.out.println("==================================================================");
        // for(int i = 0; i < perusahaan[i].elemen; i++){
        //     System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
        //     perusahaan[.keuntungan[i]] = sc.nextDouble();
        // }
        for (int i = 0; i < jmlPerusahaan; i++){
            System.out.println("==================================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan ke-"+(i+1)
            +" selama "+perusahaan[i].elemen + " bulan adalah: "
            +String.format("%.2f", perusahaan[i].totalBP()));
        }
        for (int i = 0; i < jmlPerusahaan; i++){
            System.out.println("==================================================================");
            System.out.println("Algoritma Divide Conquere");
            System.out.println("Total keuntungan perusahaan ke-"+(i+1)
            +" selama "+perusahaan[i].elemen + " bulan adalah: "
            +String.format("%.2f", perusahaan[i].totalDC()));
        }
        
        // System.out.println("Total keuntungan perusahaan selama "
        // +perusahaan[i].elemen+" bulan adalah = "
        // +String.format("%.2f",sm.totalBP(sm.keuntungan)));
        // System.out.println("==================================================================");
        // System.out.println("Algoritma Divide Conquere");
        // System.out.println("Total keuntungan perusahaan selama "
        // +sm.elemen+" bulan adalah = "
        // +String.format("%.2f",sm.totalDC(sm.keuntungan, 0, sm.elemen-1)));
    }
    
    
}
