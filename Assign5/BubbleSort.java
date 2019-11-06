public class BubbleSort <T extends Comparable> {
    
    public void bubbleSort(T[] arr) {
        for (int pass = 0; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i+1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}