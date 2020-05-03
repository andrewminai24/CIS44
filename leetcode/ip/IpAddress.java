//Time complexity:0(n)

public class IpAddress{
    public static void main(String[]args){

    }
    public static String Address(String x){
       StringBuilder result = new Stringbuilder();
       for(int i = 0; i < x.length(); i++){
           char current = x.charAt(i);
            if(current == "."){
                result.append("[.]");
            }else{
                return result.append(current);
            }

       }
       return result.toString();
    }
}

