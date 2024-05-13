package Pertemuan5;
public class Akar {
    
    public static int hitungAkarBF(int num){
        int akar = 1;
        while(akar*akar<num){
            akar++;
        }
        if(akar * akar > num){
            akar--;
        }
        return akar;
    }

    public static int hitungAkarDC(int num){
        int low = 0, high = num, akar = 0;
        while(low<=high){
            int mid = (low + high) / 2;
            if(mid * mid == num){
                return mid;
            } else if(mid * mid < num){
                low = mid + 1;
                akar = mid;
            } else{
                high = mid -1;
            }
        }
        return akar;
    }
}
