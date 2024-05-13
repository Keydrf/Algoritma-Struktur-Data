public class coba {
    public int countVowels(char[] word){
    char[] vowels = {'a', 'i', 'u', 'e', 'o'};
    int count = 0;

    for(int i = 0; i < word.length; i++){
        for(int j = 0; j < vowels.length; i++){
            if(word[i]==vowels[j]){
                count++;
            }
        }
    }
    return count;
    }
    
    public boolean checkItemInList(String item, String[] list){
        for (int i = 0; i < list.length; i++){
            if(list[i] == item){
                return true;
            }
        }
        return false;
    }
}
