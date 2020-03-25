public class PalindromeNum {
    public static void main(String[] args){
        isPalindrome(123);
    }
    public int isPalindrome(int x) {
       if(x < 0 || x != 0 && x % 10 == 0){
           return -1;
       }
       int reversed = 0;
       int original = x;
       while(x != 0){
       reversed =  reversed * 10 + x % 10;
       x = x/10;
       return original == original;

        }
    }
}

