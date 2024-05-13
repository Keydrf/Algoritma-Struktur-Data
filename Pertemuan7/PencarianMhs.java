package Pertemuan7;

public class PencarianMhs {
    Mahasiswa[] listMhs;
    int idx;

    public PencarianMhs(int size) {
        listMhs = new Mahasiswa[size];
        idx = 0;
    }

    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------");
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for( int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nim==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(String x, int pos){
        if(pos!= -1){
            System.out.println("data : "+ x + " ditemukan pada index "+pos);
        } else{
            System.out.println("data "+ x +" tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t : "+listMhs[pos].nim);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        } else{
            System.out.println("data "+ x +" tidak ditemukan");
        }
    }

    public int FindBinarySearc(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            } else if(listMhs[mid].nim > cari){
                return FindBinarySearc(cari, left, mid-1);
            } else{
                return FindBinarySearc(cari, mid+1, right);
            }
        }
        return -1;
    }

    public int FindBinarySearchDesc(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim < cari) {
                return FindBinarySearchDesc(cari, left, mid - 1); // Mengubah mid+1 menjadi mid-1
            } else {
                return FindBinarySearchDesc(cari, mid + 1, right); // Mengubah mid-1 menjadi mid+1
            }
        }
        return -1;
    }

    public int binarySearchByName(String nama) {
        int left = 0;
        int right = idx - 1;
        // int count = 0; // Jumlah kemunculan nama
        int result = -1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            int cmp = listMhs[mid].nama.compareTo(nama);
    
            if (cmp == 0) {
                result = mid;
                // count++; // Tambahkan jumlah kemunculan jika nama ditemukan
                right = mid - 1; // Geser ke kiri untuk mencari kemunculan lainnya
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        // if (count > 1) {
        //     System.out.println("Peringatan: Ditemukan lebih dari satu mahasiswa dengan nama yang sama.");
        // } else if (count == 0) {
        //     System.out.println("Data tidak ditemukan.");
        // }
    
        return result; // Ubah menjadi -1 jika tidak ada kemunculan
    }
    
}




