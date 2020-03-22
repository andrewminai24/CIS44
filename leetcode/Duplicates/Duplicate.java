/*
1.Check all value for duplicates by making 
each values negative showing that it is less than zero 
and iterating through loop to see if the index is less than zero
if it is then it is a duplicate
*/
public class Duplicate{
 public static void main(String[] args) {
        duplicate();
    }
 public List<Integer> findDuplicate(int []num){
     List<Integer> output =  new Arraylist();
     for(int i = 0; i < nums.length; i++){
        int index = Math.abs(num[i]) -1;
        if(num[index] < 0) output.add(index+1);
        num[index] = -num[index];
     }
     return output;

 }
}