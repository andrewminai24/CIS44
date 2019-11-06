package quicksort;

public class Main {
    public static <T> void display(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {4, 6, 7, 1, 3, 2, 5};
        Double[] doubleArray = {10.5, 1.2, 25.8, -3.74};
        
        System.out.println("Original Arrays:");
        display(intArray);
        display(doubleArray);
        
        QuickSort sort = new QuickSort();
        
        sort.quickSort(intArray);
        sort.quickSort(doubleArray);
        
        System.out.println("\nSorted Arrays:");
        display(intArray);
        display(doubleArray);
    }
}