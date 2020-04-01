import java.util.HashMap;

public class First{
    public static void main(String[] args){

    }
    public static String NonRepeat(String s){
        HashMap<Character,Integer> counts = new HashMap();
        for(int i =0;i < s.length;i++){
            char c = s.charAt(i);
            if(counts.containsKey(c)){
                counts.put(c,counts.get(c) + 1);
            } else {
                counts.put(c,1);
            }

        }
        for(int i = 0; i < s.length; i++){
            char c = s.charAt(c);
            if(counts.get(c) == 1)
            return c;
        }
        return '';
    }

}