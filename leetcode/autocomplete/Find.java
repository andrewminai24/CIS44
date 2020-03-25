import java.util.ArrayList;

public class Find{
    public static void main(String[] args){
        duplicate(1,23,3,5,2,3);
    }
    public List<Integer> duplicate(int []num){
        List<Integer> output = new ArrayList(); 

        for(int i =0;i < num.length;i++){
            //loop through each index  of the array and make it absolute value
            int index =  Math.abs(num[i])-1;
            if(num[index] < 0) output.add(num[index]+1);
            num[index] = -num[index];

        }
    }
}
