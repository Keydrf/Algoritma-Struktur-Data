package Pertemuan5;
import java.util.Scanner;
public class MainAkar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int num = input.nextInt();

        int akarBF = Akar.hitungAkarBF(num);
        int akarDC = Akar.hitungAkarDC(num);

        System.out.println();
        System.out.println("Algoritma Brute Force, akar dari "+num+" adalah "+ akarBF);
        System.out.println();
        System.out.println("Algoritma Divide Conquere, akar dari "+num+" adalah "+ akarDC);
    }
}
