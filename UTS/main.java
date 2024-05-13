package UTS;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        Rekening darek = new Rekening();
        transaksi datra = new transaksi();
        do{
            System.out.println("-------------BANK SEJAHTERA-------------");
        System.out.println("Silahkan pilih menu: ");
        System.out.println("1. Tambah rekening");
        System.out.println("2. Tampil rekening");
        System.out.println("3. Urutkan data rekening");
        System.out.println("4. Cari rekening");
        System.out.println("5. Tambah tranksaksi");
        System.out.println("6. Tampil transaksi");
        System.out.println("7. Urutkan data transaksi");
        System.out.println("8. Cari transaksi");
        System.out.print("Pilihan anda: ");
        String pil = input.nextLine();
        System.out.println("-----------------------------------------");

        if(pil.equalsIgnoreCase("1")){
            
            System.out.println("-----------------------------------------");
            System.out.println("Masukkan data anda!");
            System.out.print("No Rekening: ");
            String noRekening = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Nama Ibu: ");
            String namaIbu = input.nextLine();
            System.out.print("No Telepon: ");
            String phone = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();

            Rekening r = new Rekening(noRekening, nama, namaIbu, phone, email);
            darek.tambah(r);
            System.out.println("-----------------------------------------");
        } else if(pil.equalsIgnoreCase("2")){
            darek.tampil();
        } else if(pil.equalsIgnoreCase("3")) {
            darek.sortNoRekASC();
            darek.tampil();
        } else if(pil.equalsIgnoreCase("4")) {
            System.out.println("-----------------------------------------");
            System.out.println("Masukkan data yang ingin dicari");
            System.out.print("No rekening: ");
            String cari = input.nextLine();
            
            int posisi = darek.cariNoRekening(cari);
            
            darek.TampilData(cari, posisi);
            System.out.println("-----------------------------------------");
        } else if(pil.equalsIgnoreCase("5")){
            System.out.println("-----------------------------------------");
            System.out.println("Silahkan input data transaksi");
            System.out.print("Saldo: ");
            double Saldo = input1.nextDouble();
            System.out.print("Saldo awal: ");
            double saldoAwal = input1.nextDouble();
            System.out.print("Saldo akhir: ");
            double saldoAkhir = input1.nextDouble();
            System.out.print("Tanggal transaksi: ");
            String tanggalTransaksi = input.nextLine();
            System.out.print("Tipe transaksi: ");
            String type = input.nextLine();

            transaksi t = new transaksi(Saldo, saldoAwal, saldoAkhir, tanggalTransaksi, type);
            datra.tambahTransaksi(t);
        } else if(pil.equalsIgnoreCase("6")){
            datra.tampil();
        } else if(pil.equalsIgnoreCase("7")){
            datra.sortsaldoASC();
            datra.tampil();
        } else if(pil.equalsIgnoreCase("8")){
            System.out.println("-----------------------------------------");
            System.out.println("Masukkan data yang ingin dicari");
            System.out.print("Tanggal transaksi: ");
            String tgl = input.nextLine();

            int posisi = datra.cariTransaksi(tgl);
            
            datra.TampilData(tgl, posisi);
        }

        }while(true);
        

    }
    
}
