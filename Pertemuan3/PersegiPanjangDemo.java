package Pertemuan3;
import java.util.Scanner;
public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi: ");
        int jmlPersegi = sc.nextInt();
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jmlPersegi];
        
        int panjang, lebar;

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++){

            System.out.println("Persegi panjang ke-"+(i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }
        cetakInfo(arrayOfPersegiPanjang);

    }
    static void cetakInfo(PersegiPanjang[] arrayPersegi){
        for (int i = 0; i < arrayPersegi.length; i++){
            System.out.println("Persegi ke-"+(i+1)+
            ", panjang: " + arrayPersegi[i].panjang+
            ", lebar: "+arrayPersegi[i].lebar+
            ", luas: "+arrayPersegi[i].hitungLuas()+
            ", keliling: "+arrayPersegi[i].hitungKeliling());
        }
    }
   
}
