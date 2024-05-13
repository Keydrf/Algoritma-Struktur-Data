package Pertemuan10.Tugas;

import Pertemuan10.Praktikum2.Nasabah;

public class Queue {
    Pasien[] data;
    int front;
    int rear;
    int size;
    int max;
    int item;

    public Queue(int n){
        max = n;
        data = new Pasien[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        } else{
            return false;
        }
    }

    public void peek(){
        if(!IsEmpty()){
            System.out.println("Antrian terdepan: "+data[front].noID+", "+data[front].nama
            +", "+data[front].jenisKelamin+", "+data[front].umur);
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Antrian belakang: "+data[rear].noID+", "+data[rear].nama
            +", "+data[rear].jenisKelamin+", "+data[rear].umur);
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public int peekPosition(String nama) {
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (data[i].nama.equals(nama)) {
                position = i + 1; // Return the position (starting from 1)
                break;
            }
        }
        return position;
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].noID+", "+data[i].nama
                +", "+data[i].jenisKelamin+", "+data[i].umur);
                i = (i+1) % max;
            }
            System.out.println(data[i].noID+", "+data[i].nama
            +", "+data[i].jenisKelamin+", "+data[i].umur);
            System.out.println("Jumlah elemen = "+size);
        }
    }

    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pasien psn){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if(rear == max -1){
                    rear = 0;
                } else{
                    rear++;
                }
            }
        }
        data[rear] = psn;
        size++;
    }

    public Pasien Dequeue(){
        Pasien psn = new Pasien();
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            psn = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            } else {
                if(front == max -1){
                    front = 0;
                } else{
                    front++;
                }
            }
        }
        return psn;
    }

    
}

