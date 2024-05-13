package Pertemuan9.Struk;

public class Stack {
    int size;
    int top; 
    Struk data[];
    
    
    public Stack(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public void push(Struk strukBelanja){
        if(!isFull()){
            top++;
            data[top] = strukBelanja;
        } else {
            System.out.println("Stack is full");
        }
    }

    public Struk pop(){
        if(!isEmpty()){
            Struk x = data[top];
            top--;
            // System.out.println("Data yang keluar: "+x.nomorTransaksi+" "+x.tanggalPembelian+" "+x.jumlahBarang+" "+x.totalHargaBayar);
            return x;
        } else{
            System.out.println("Stack is empty");
            return null;
        }
    }

    public void display(){
        System.out.println("Daftar Struk Belanja yang Masih Tersimpan:");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].nomorTransaksi+" "+data[i].tanggalPembelian+" "+data[i].jumlahBarang+" "+data[i].totalHargaBayar);
        }
        System.out.println("");
    }
}
