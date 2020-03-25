import javax.print.DocFlavor.STRING;

public class Reverse{
    public static void main(Strings[] args){

    }
    public static String reverseOnlyStrings(String s){
        char [] characters = s.toCharArray();
        int i =0;
        int j = s.length() - 1;
        while(i < j){
            while( i < j && !Character.isLetter(s.charAt(i))){
                i++;
            }
            while(j < i && !Character.isLetter(s.charAt(j))){
                j--;
            }
            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;

        }
        return new String(characters);
    }
}