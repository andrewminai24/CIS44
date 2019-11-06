public class Main {
    public static <T> void display(T[] a)
    {
    /*
    for(int i = 0; i < a.length; i++)
    System.out.print(a[i] + " ");
    System.out.println();
    */
   
    for(T item: a)
    System.out.print(item + " ");
    System.out.println();
    }
   public static void main(String[] args) {
   Integer [] list = {5, 2, 20, 15, 70,35, 17, 90};
   display(list);
   MergeSort<Integer> b = new MergeSort<>();
   b.mergeSort(list);
   display(list);
   }
   }
   public class MergeSort<T> {
    public <T extends Comparable<? super T>>void mergeSort(T[] a)
    {
    @SuppressWarnings("unchecked")
    T[] tempArray= (T[])new Comparable<?>[a.length];
    mergeSort(a, tempArray, 0, a.length - 1);
    }
    private <T extends Comparable<? super T>>void mergeSort(T[] a, T[] tempArray,
    int first, int last)
    {
    if (first < last)\



    /*
Tasks:
Write timer for each method 
Write Quick Sort
*/

public class Main{

    public class Main {
        public static <T> void display(T[] a)
        {
        /*
        for(int i = 0; i < a.length; i++)
        System.out.print(a[i] + " ");
        System.out.println();
        */
       
        for(T item: a)
        System.out.print(item + " ");
        System.out.println();
        }
       public static void main(String[] args) {
       Integer [] list = {5, 2, 20, 15, 70,35, 17, 90};
       display(list);
       MergeSort<Integer> b = new MergeSort<>();
       b.mergeSort(list);
       display(list);
       }
       }
}


    public void quickSort(T[],int size){
        quick(a,0,size -1);
    }
    private void quickSort(T[] a,int first,int last){
        int pivotIndex = parition(a,first,last);
    }
    private int parition(T[] a,int first,int last)
    {
        int pivotIndex;
        int mid = (first + last)/2;

        sortFirstMiddleLast(a,first,mid,last);
        swap(a,mid,last-1);

        pivotIndex = last - 1;
        T pivotValue = a[pivotIndex];
        int indexFromLeft = first + 1;
        int indexFromRight = pivot -1;
        boolean done = false;
        while(!done){
            while(a[indexFromLeft] < pivotValue)
                indexFromLeft++;
            while(a[indexFromRight] > pivotValue)
                indexFromRight--;
            if(indexFromLeft < indexFromRight){
                swap(a,indexFromLeft,indexFromRight);
                indexFromLeft++;
                indexFromRight++;
            }else{
                done = true;
            }
            swap(a,indexFromLeft,pivotIndex);
            pivotIndex = indexFromLeft;
            return pivotIndex;
        }
        private void sortFirstMiddleLast(T[]a,int first,int mid,int last)
        {

        }
        private void swap(T[] a,int i,int j)
        {

        }

        public class Main {
            public static <T> void display(T[] a)
            {
            /*
            for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
            */
           
            for(T item: a)
            System.out.print(item + " ");
            System.out.println();
            }
           public static void main(String[] args) {
           Integer [] list = {5, 2, 20, 15, 70,35, 17, 90};
           display(list);
           MergeSort<Integer> b = new MergeSort<>();
           b.mergeSort(list);
           display(list);
           }
        }
           
    
    public static void main(String[] args){
        Integer[] aInteger = {5,9,1,3};
        System.out.println("Before");
        display(arrInteger,4);
        s.quicksort(arrInteger,4);
        System.out.println("And after:");
        
        display(arrInteger,4);
        QuickSort.quickSort(arrInteger,4);

    }
}
