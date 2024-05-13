package Pertemuan9.Pakaian;
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack stk = new Stack(5);
    char pilih;

    do {
        System.out.print("Jenis: ");
        String jenis = sc.nextLine();
        System.out.print("Warna: ");
        String warna = sc.nextLine();
        System.out.print("Merk: ");
        String merk = sc.nextLine();
        System.out.print("Ukuran: ");
        String ukuran = sc.nextLine();
        System.out.print("Harga: ");
        double harga = sc.nextDouble();

        Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        stk.push(p);
    } while (pilih == 'y');
    do{
        System.out.println("=============================================");
        System.out.println("Silahkan pilih menu yang ingin dilakukan");
        System.out.println("1. Print");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Harga tertinggi");
        System.out.print("Pilihan anda: ");
        int menu = sc.nextInt();

    switch (menu) {
        case 1:
            stk.print();
            break;
        case 2:
            stk.pop();
            break;
        case 3:
            stk.peek();
            break;
        case 4:
            stk.getMax();
            break;
        default:
            break;
    }
    }while(true);
    

    // stk.print();
    // stk.pop();
    // stk.peek();
    // stk.print();
    }
    
}
