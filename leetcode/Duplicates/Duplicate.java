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
/*
 [4,3,7,8,2,3,1];
nums[i] =4;
index = 4-1=3
nums[3] =7;
(7 < 0) =false;
7=-7;

 [4,3,27,8,2,3,1];
nums[i] =3;
index = 3-1=2
nums[2] =3;
(3 < 0) =false;
3=-3;

 [4,3,7,8,2,3,1];
nums[i] =-2;
index = 2-1=1
nums[1] =3;
(3 < 0) =false;
3=-3

 [4,-3,-2,-7,8,2,3,1];
nums[i] =-7;
index = 7-1=6
nums[6] =3;
(-3 < 0) =false;
3=-3;

[4,-3,-2,-7,8,2,-3,1];
nums[i] =-8;
index = 8-1=7
nums[7] =3;
(-3 < 0) =false;
3=-3;

[4,-3,-2,-7,8,2,-3,1];
nums[i] =-8;
index = 8-1=7
nums[7] =1;
(1 < 0) =false;
1=-1;

[4,-3,-2,-7,8,2,-3,1];
nums[i] =2;
index = 2-1=1
nums[1] =-3;
(-3 < 0) =true;
-3=3
