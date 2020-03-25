public class PalindromeNum {
    public static void main(String[] args){
        System.out.println(isPalindrome(321));
    }
    
    public static boolean  isPalindrome(int x) {
       if(x < 0 && x % 10 == 0){
           return false;
       }
       int reversed = 0;
       int original = x;
       while(x != 0){
       reversed =  reversed * 10 + x % 10;
       x = x / 10;

        }
        return reversed == original;

    }
 }

