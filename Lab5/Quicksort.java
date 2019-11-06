/*
Write the Merge Sort code, Quick Sort and bubble sort code in a class. 
Write the main program to sort 100,000 items using each sort technique. 
Measure the time for each.You may generate 100, 000 random numbers.
The code for basic sorting techniques is given on Canvas.

*/

public class Quicksort<T extends Comparable>{

     public <T> void quickSort(T[] int size){
        
        quickSort(a,0,size -1);
     }

     private void quickSort(T[] a,int first,int last){ 
        
        int pivotIndex = 0;
        int mid = (first + last)/2;
        sortFirstMiddleLast(a,first,mid,last);
        int arr[]
        return pivotIndex;
         //Partion-Does the quicksort algorithm
         //This gives you back the index
        //Recursion here:
        quickSort(a,first,last);

     }
     private void sortFirstMiddleLast(T[]a,int first,int last){
      if(first.compareTo(mid > 0))
      swap(a,first,mid);
      //When you have nested if statements all the if statement are executed
      if(first.compareTo(last > 0)){
         swap(a,first,last);
      }
      if(mid.compareTo(last < 0)){
         swap(a,mid,last);
         }
      }
   //You do not need main to parition the numbers.

      private void parition(){
         int mid = (first + last) / 2;
        
         sortFirstMiddleLast(a, first, mid, last);
         swap(a, mid, last - 1);
         
         int pivotIndex = last - 1;
         T pivotValue = a[pivotIndex];
         
         int indexFromLeft = first + 1;
         int indexFromRight = pivotIndex - 1;
         
         while (true) {
             while (a[indexFromLeft].compareTo(pivotValue) < 0) {
                 indexFromLeft++;
             }
             
             while (a[indexFromRight].compareTo(pivotValue) > 0) {
                 indexFromRight--;
             }
             
             if(indexFromLeft < indexFromRight) {
                 swap(a, indexFromLeft, indexFromRight);
                 indexFromLeft++;
                 indexFromRight--;
             }
             
             else {
                 break;
             }
         }
         
         swap(a, indexFromLeft, pivotIndex);
         pivotIndex = indexFromLeft;
         
         return pivotIndex;
     }
     private void sortTwoItems (T[] a, int first, int last) {
      if (a[first].compareTo(a[last]) > 0) {
          swap(a, first, last);
      }
  }
}

   }
//O(1)
//O(n)-N amount of times.
//Log(n)
//Log n
/*
E=2.3
Log-How long you need to raise power to E reach that.

*/

     private void swap(T[] a, int i,int j){
         //Should swap a and j
         //a- pivot j is the second to last element
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
     }
        
        T temp 
        temp = a[0];
        a[0] = a[1];
        a[1] = temp;
        System.out.println("first = " first);
        System.out.println("last = " last);
        
     }
    }
}