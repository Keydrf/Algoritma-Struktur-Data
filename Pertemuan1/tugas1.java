import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] kode  = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char [][] kota = {
            {'B', 'A', 'N','T','E','N'},
            {'J', 'A', 'K', 'A', 'R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };
        System.out.print("Masukkan kode yang dicari (gunakan huruf kapital): ");
        char cariKode = input.next().charAt(0);

        int indeksKode = -1;
        boolean kodetemu = false;
        for(int i = 0; i < kode.length; i++){
            if(kode[i]== cariKode){
                kodetemu = true;
                indeksKode = i;
                for(int j = 0; j < kota[i].length; j++){
                    System.out.print(kota[i][j]);
                }
                
            } 
        }
        if(!kodetemu){
            System.out.println("Kode tidak ditemukan!");
        }
        
    }
}
