package Pertemuan12.vaksinasi;

public class Node {
    int no;
    String nama;
    Node prev, next;

    Node(Node prev, int no, String nama, Node next){
        this.prev = prev;
        this.no = no;
        this.nama = nama;
        this.next = next;
    }
}
