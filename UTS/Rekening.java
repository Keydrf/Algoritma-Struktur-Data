package UTS;
public class Rekening {
    private static final int MAX_REKENING = 100;
    private Rekening[] rek;
    private int idx = 0;
    private String noRekening, nama, namaIbu, phone, email;

    public Rekening() {
        rek = new Rekening[MAX_REKENING];
    }

    public Rekening(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    public void tambah(Rekening r){
        if(idx < MAX_REKENING){
            rek[idx] = r;
            idx++;
            System.out.println("Rekening berhasil ditambah!");
        } else{
            System.out.println("Data sudah penuh !!");
        }
    }

                                                                                                                                                public void tampil() {
                                                                                                                                                    for (int i = 0; i < idx; i++) {
                                                                                                                                                        System.out.println("-----------------------------------------");
                                                                                                                                                        System.out.println("No Rekening\t : " + rek[i].noRekening);
                                                                                                                                                        System.out.println("Nama\t : " + rek[i].nama);
                                                                                                                                                        System.out.println("Nama Ibu\t : " + rek[i].namaIbu);
                                                                                                                                                        System.out.println("No Telepon\t : " + rek[i].phone);
                                                                                                                                                        System.out.println("Email\t : " + rek[i].email);
                                                                                                                                                        System.out.println("-----------------------------------------");
                                                                                                                                                        
                                                                                                                                                    }
                                                                                                                                                }


    public void sortNoRekASC(){ //bubblesort
        for(int i = 0; i < idx-1; i++){
            for(int j = 0; j < idx - i - 1; j++){
                if(rek[j].noRekening.compareTo(rek[j+1].noRekening) > 0){
                    Rekening temp = rek[j];
                    rek[j] = rek[j+1];
                    rek[j + 1] = temp;
                }
            }
        }
    }

    public int cariNoRekening(String noRekening){
        for(int i = 0; i < idx; i++){
            if (rek[i].noRekening.equals(noRekening)){
                return i;
            }
        }
        return -1;
    } 

    public void TampilPosisi(String x, int pos){
        if(pos!= -1){
            System.out.println("data : "+ x + " ditemukan pada index "+pos);
        } else{
            System.out.println("data "+ x +" tidak ditemukan");
        }
    }
    void TampilData(String noRekening, int posisi){
        if(posisi!= -1){
            System.out.println("-----------------------------------------");
            System.out.println("No rekening\t : "+noRekening);
            System.out.println("Nama\t : "+rek[posisi].nama);
            System.out.println("Nama ibu\t : "+rek[posisi].namaIbu);
            System.out.println("No telepon\t : "+rek[posisi].phone);
            System.out.println("Email\t : "+rek[posisi].email);
            System.out.println("-----------------------------------------");
        } else{
            System.out.println("data "+ noRekening +" tidak ditemukan");
        }
    }
}
