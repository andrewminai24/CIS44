/*
Running time of insertion sort
worst case:
T(n) = an^2 + bn + c
Counting the number of operations

Do not count the number of lines
An algorithm that is asymptotically more efficent
will be the best choice for all n

a.f(n) = 6n^2 + 3 is O(n^2)
b.n^2 + 17n + 1 is O(n^2)

f(n) = 6n^2 + 3
g(n) = n^2
6n^2 + 3 <= 6n^2 + n^2


34 56 4 10 77 51 93 30 5 52
    4 56
    10 56 77 51 93 30 5 52
          51 77 93 30 5 52
                30 93 5 52
*/

public class Bubblesort{

    

    public static <T> void display(T [] arr)
    {
        System.out.println("-----------");
        for(int i = 0; i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static <T extends Compareable <T>> void sortB(T arr []){
    
        for(int i = 0; i < arr.length; i++)
            for(int j=i+1; i < arr.length-1;j++)
            {
             if(arr[i].compareTo(arr[j]) > 0)
             {
                 T temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }   
            }
        }
    }
    
