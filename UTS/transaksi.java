package UTS;

public class transaksi {
    transaksi listTrns[] = new transaksi[100];
    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;
    int idx = 0;
    public transaksi(){

    }

    public transaksi(double a, double b, double c, String d, String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
    }

    public void tambahTransaksi(transaksi t){
        if(idx < 100){
            listTrns[idx] = t;
            idx++;
            System.out.println("Berhasil melakukan transaksi!");
        } else{
            System.out.println("Data sudah penuh !!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Saldo: " + listTrns[i].saldo);
            System.out.println("Saldo awal: " + listTrns[i].saldoAwal);
            System.out.println("Saldo akhir: " + listTrns[i].saldoAkhir);
            System.out.println("Tanggal transaksi: " + listTrns[i].tanggalTransaksi);
            System.out.println("Tipe transaksi: " + listTrns[i].type);
            System.out.println("-----------------------------------------");
        }
    }

    public void sortsaldoASC(){ //bubblesort
        for(int i = 0; i < idx-1; i++){
            for(int j = 0; j < idx - i - 1; j++){
                if(listTrns[j].saldo > (listTrns[j+1].saldo)){
                    transaksi temp = listTrns[j];
                    listTrns[j] = listTrns[j+1];
                    listTrns[j + 1] = temp;
                }
            }
        }
    }

    public int cariTransaksi(String tgl){
        for(int i = 0; i < idx; i++){
            if(listTrns[i].tanggalTransaksi.equalsIgnoreCase(tgl)){
                return i;
            }
        }
        return -1;
    }

    void TampilData(String tgl, int posisi){
        if(posisi!= -1){
            System.out.println("-----------------------------------------");
            System.out.println("Saldo\t : "+listTrns[posisi].saldo);
            System.out.println("Saldo Awal\t : "+listTrns[posisi].saldoAwal);
            System.out.println("Saldo Akhir\t : "+listTrns[posisi].saldoAkhir);
            System.out.println("Tanggal transaksi\t : "+listTrns[posisi].tanggalTransaksi);
            System.out.println("Tipe transaksi\t : "+listTrns[posisi].type);
            System.out.println("-----------------------------------------");
        } else{
            System.out.println("tanggal transaksi "+ tgl +" tidak ditemukan");
        }
    }
}
