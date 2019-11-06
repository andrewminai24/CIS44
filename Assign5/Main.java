import java.util.Date;
import java.security.SecureRandom;

public class Main {
    public static <T> void display(T[] a) {
        for (T item: a) {
            System.out.print(item + " ");
        }
        
        System.out.println();
    }
    
    public static void resetArray(Integer[] a) {
        Integer randomInt;
        SecureRandom rng = new SecureRandom();
        
        for (int i = 0; i < a.length; i++) {
            randomInt = rng.nextInt(a.length);
            a[i] = randomInt;
        }
        
        System.out.println("Original Arrays:");
        display(a);
    }
    
    public static void listSorts(long mergeTime, long quickTime, long bubbleTime) {
        Long[] timeList = {mergeTime, quickTime, bubbleTime, };
        
        
        for (int i = 0; i < timeList.length; i++) {
            if (timeList[i] == mergeTime) {
                System.out.println("Merge Sort: " + mergeTime);
            }
            
            else if (timeList[i] == quickTime) {
                System.out.println("Quick Sort: " + quickTime);
            }
            
            else if (timeList[i] == bubbleTime) {
                System.out.println("Bubble Sort: " + bubbleTime);
            }
            
            
        }
    }
    
    public static void main(String[] args) {
        Date current;
        long startTime, stopTime, mergeTime, quickTime, bubbleTime;
        
        Integer[] testArray = new Integer[10000];
        
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        BubbleSort bubble = new BubbleSort();
        
        resetArray(testArray);
        
        current = new Date();
        startTime = current.getTime();
        
        merge.mergeSort(testArray);
        
        current = new Date();
        stopTime = current.getTime();
        
        mergeTime = stopTime - startTime;
        
        System.out.println("\nSorted Arrays:");
        display(testArray);
        
        
        System.out.printf(
                "\n\nMerge Sort Time: %s\n\n",
                mergeTime
        );
        
        resetArray(testArray);
        
        current = new Date();
        startTime = current.getTime();
        
        quick.quickSort(testArray);
        
        current = new Date();
        stopTime = current.getTime();
        
        quickTime = stopTime - startTime;
        
        System.out.println("\n\nSorted Arrays:");
        display(testArray);
        
        System.out.printf(
                "\n\nQuick Sort Time: %s\n\n",
                quickTime
        );
        
        resetArray(testArray);
        
        current = new Date();
        startTime = current.getTime();
        
        bubble.bubbleSort(testArray);
        
        current = new Date();
        stopTime = current.getTime();
        
        bubbleTime = stopTime - startTime;
        
        System.out.println("\n\nSorted Arrays:");
        display(testArray);
        
        System.out.printf(
                "\n\nBubble Sort Time: %s\n\n",
                bubbleTime
        );
        
        resetArray(testArray);
        
        current = new Date();
        startTime = current.getTime();
        
        
        current = new Date();
        stopTime = current.getTime();
        
        
        System.out.println("\nSorted Arrays:");
        display(testArray);
        
        
        
        System.out.println("Sorts listed by time:");
        listSorts(mergeTime, quickTime, bubbleTime);
    }
}