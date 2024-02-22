import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUts, nilaiUas;
        double nilaiAkhir;
        String nilaiHuruf, keterangan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===================================");
        System.out.print("Masukkan nilai tugas 0-100: ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan nilai kuis 0-100: ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukkan nilai uts 0-100: ");
        nilaiUts = input.nextInt();
        System.out.print("Masukkan nilai uas 0-100: ");
        nilaiUas = input.nextInt();

        if (nilaiTugas < 0 || nilaiTugas > 100 || 
        nilaiKuis < 0 || nilaiKuis > 100 || 
        nilaiUts < 0 || nilaiUts > 100 || 
        nilaiUas < 0 || nilaiUas > 100 )
        {
            System.out.println("Nilai tidak valid. Mohon masukkan nilai antara 0-100");
        } else{
            System.out.println("===================================");
        nilaiAkhir = (0.2 * nilaiTugas ) + (0.2 * nilaiKuis) + (0.3 * nilaiUts) + (0.3 * nilaiUas);
        // System.out.println("Nilai Akhir: "+nilaiAkhir);

        if(nilaiAkhir > 80 ){
            nilaiHuruf = "A";
        } else if(nilaiAkhir > 73){
            nilaiHuruf = "B+";
        } else if(nilaiAkhir > 65){
            nilaiHuruf = "B";
        } else if(nilaiAkhir > 60){
            nilaiHuruf = "C+";
        } else if(nilaiAkhir > 50){
            nilaiHuruf = "C";
        } else if(nilaiAkhir > 39){
            nilaiHuruf = "D"; 
        } else {
            nilaiHuruf = "E";
        }

        keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") 
        || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "LULUS" : "TIDAK LULUS";
        System.out.println("===================================");
        System.out.println("Nilai Akhir: "+nilaiAkhir);
        System.out.println("Nilai Huruf: "+nilaiHuruf);
        System.out.println("===================================");
        System.out.println(keterangan);
        }
        
    }
}