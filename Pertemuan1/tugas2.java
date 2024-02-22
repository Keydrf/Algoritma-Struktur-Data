import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        System.out.println("Program berhitung");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu(1/2/3): ");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilihan anda: ");
        int pilMenu = menu.nextInt();

        if(pilMenu == 1){
            System.out.print("Masukkan jarak: ");
            int jarak = menu.nextInt();
            System.out.print("Masukkan waktu: ");
            int waktu = menu.nextInt();
            System.out.println("Hasil         : "+Kecepatan(jarak, waktu));
        } else if(pilMenu == 2){
            System.out.print("Masukkan kecepatan: ");
            int kecepatan = menu.nextInt();
            System.out.print("Masukkan waktu    : ");
            int waktu = menu.nextInt();
            System.out.println("Hasil             : "+Jarak(kecepatan, waktu));
        } else if(pilMenu == 3){
            System.out.print("Masukkan jarak    : ");
            int jarak = menu.nextInt();
            System.out.print("Masukkan kecepatan: ");
            int kecepatan = menu.nextInt();
            System.out.println("Hasil             : "+Waktu(jarak, kecepatan));
        } else{
            System.out.println("Inputan tidak valid");
        }
    }
    static double Kecepatan(int x, int y){
        double cari = x / y;
        return cari;
    }
    static double Jarak(int p, int q){
        double cariJ = p * q;
        return cariJ;
    }
    static double Waktu(int a, int b){
        double cariW = a / b;
        return cariW;
    }
    
}
