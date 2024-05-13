package Pertemuan5;

public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    Sum(int elemen, double keuntungan[]){
        this.elemen = elemen;
        this.keuntungan = keuntungan;
        this.total = 0;
    }
    double totalBP(){
        for(int i = 0; i < elemen; i++){
            total = total + keuntungan[i];
        }
        return total;
    }
    double totalDC(){
        return totalDCUtil(keuntungan, 0, elemen-1);
    }
    double totalDCUtil(double arr[], int l, int r){
        if(l == r)
            return arr[l];
        else if(l<r){
            int mid = (l+r) / 2;
            double lsum = totalDCUtil(arr, l, mid-1);
            double rsum = totalDCUtil(arr, mid+1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
