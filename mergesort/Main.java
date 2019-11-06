package mergesort;

public class Main {
    public static <T> void display(T[] a) {
        for (T item: a) {
            System.out.print(item + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {4, 6, 7, 1, 3, 2, 5};
        Double[] doubleArray = {10.5, 1.2, 25.8, -3.74};
        
        System.out.println("Original Arrays:");
        display(intArray);
        display(doubleArray);
    }
}