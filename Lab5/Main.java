
public class Main {
    
    public static void main(String[] args) {

        public static <T> void display(T[] a) {
            for (T item: a) {
                System.out.print(item + " ");
            }
            
            System.out.println();
        }

        public static <T> void display(T[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            
            System.out.println();
        }
            Integer[] intArray = {4, 6, 7, 1, 3, 2, 5};
            Double[] doubleArray = {10.5, 1.2, 25.8, -3.74};
            
            System.out.println("Original Arrays:");
            display(intArray);
            display(doubleArray);
        }
        
        
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