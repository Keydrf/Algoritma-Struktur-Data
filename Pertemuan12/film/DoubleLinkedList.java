package Pertemuan12.film;
//addfirst
//addlast
//add
//removefirst
//removelast
//remove
//print
//search
//sorting
public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst (int id, String judul, double rating) {
        if(isEmpty()) {
            head = new Node(null, id, judul, rating, null);
        } else {
            Node newNode = new Node(null,  id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int id, String judul, double rating){
        if(isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(int id, String judul, double rating, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            if (index == 0) {
                addFirst(id, judul, rating); // Tambahkan di awal
            } else if (index == size) {
                addLast(id, judul, rating); // Tambahkan di akhir
            } else {
                Node current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                Node newNode = new Node(current.prev, id, judul, rating, current);
                current.prev.next = newNode;
                current.prev = newNode;
                size++;
            }
        }
    }

    public int size(){
        return size;
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Cetak Data");
            while(tmp != null){
                System.out.println("ID: " + tmp.id);
                System.out.println(" Judul film: " + tmp.judul);
                System.out.println(" Rating: " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } 
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size){
        throw new Exception ("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int searchById(int id) {
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.id == id) {
                return position; // Mengembalikan posisi jika ID ditemukan
            }
            current = current.next;
            position++;
        }
        return -1; // Mengembalikan -1 jika ID tidak ditemukan
    }

    public void displayDataAndPosition(int id) {
        int position = searchById(id);
        if (position != -1) {
            Node current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            System.out.println("Data ID Film: " + current.id + " berada di node ke-" + (position+1));
            System.out.println("IDENTITAS:");
            System.out.println(" ID Film: " + current.id);
            System.out.println(" Judul Film: " + current.judul);
            System.out.println(" Rating: " + current.rating);
        } else {
            System.out.println("Data dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void sortByRatingDescending() {
        if (isEmpty() || size == 1) {
            return; // Tidak perlu melakukan sorting jika linked list kosong atau hanya memiliki satu elemen
        }
    
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    // Tukar posisi dua node jika rating node saat ini lebih kecil dari rating node berikutnya
                    int tmpId = current.id;
                    String tmpJudul = current.judul;
                    double tmpRating = current.rating;
                    current.id = current.next.id;
                    current.judul = current.next.judul;
                    current.rating = current.next.rating;
                    current.next.id = tmpId;
                    current.next.judul = tmpJudul;
                    current.next.rating = tmpRating;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
