import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] mataKuliah = {"Agama", "KTI", "CTPS", "Matdas", "Inggris", "Daspro", "PDaspro", "PAMB"};
        int [] bobotSks = {'2','2','2','2','2','2','3','2'};
        double [] nilai = new double[mataKuliah.length];
        String [] nilaiHuruf = new String[mataKuliah.length];
        double [] bobotNilai = new double[mataKuliah.length];
        double totalBobot = 0, totalSks, totalNilai = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai "+mataKuliah[i]+": ");
            nilai[i]= input.nextDouble();
            if(nilai[i]>100){
                System.out.println("Nilai tidak valid");
                break;
            } else{
                
            }
        }

        // Output nilai mata kuliah, nilai huruf, dan bobot nilai
        System.out.println("\nMata Kuliah\t\tNilai Mahasiswa \tNilai Huruf\t\tBobot Nilai");
        for (int i = 0; i < 7; i++) {
            System.out.print(mataKuliah[i]+"\t\t\t\t");
            System.out.print(nilai[i]+"\t\t\t");
            
            if(nilai[i] > 80 || nilai[i] <=100){
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if(nilai[i] > 73){
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if(nilai[i] > 65){
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if(nilai[i] > 60){
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if(nilai[i] > 50){
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if(nilai[i] > 39){
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else if(nilai[i]<39){
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
                
            }else{
                System.out.println("Nilai tidak valid");
            }
            
            System.out.print(nilaiHuruf[i]+"\t\t\t");
            System.out.print(bobotNilai[i]+"\t\t");
            totalBobot += bobotSks[i];
            totalNilai += bobotSks[i] * bobotNilai[i];
            System.out.println();

        }
 
            double ipk = totalNilai / totalBobot;
            System.out.printf("\nIPK: %.2f\n", ipk);

        // Menghitung IPK
        

        // Output IPK
        
    }
}
