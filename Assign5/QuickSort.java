package quicksort;

public class QuickSort <T extends Comparable> {
    public void quickSort(T[] a) {
        quickSort(a, 0, a.length - 1);
    }
    
    private void quickSort(T[] a, int first, int last) {
        int pivot = partition(a, first, last);
        
        if (pivot - first > 3) {
            quickSort(a, first, pivot - 1);
        }
        
        else if (pivot - first == 3) {
            sortFirstMiddleLast(a, first, first + 1, pivot - 1);
        }
        
        else if (pivot - first == 2) {
            sortTwoItems(a, first, pivot - 1);
        }
        
        if (last - pivot > 3) {
            quickSort(a, pivot + 1, last);
        }
        
        else if (last - pivot == 3) {
            sortFirstMiddleLast(a, pivot + 1, last - 1, last);
        }
        
        else if (last - pivot == 2) {
            sortTwoItems(a, pivot + 1, last);
        }
    }
    
    private int partition(T[] a, int first, int last) {
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
    
    private void swap(T[] a, int i, int j) {
        T temp;
        
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private void sortFirstMiddleLast (T[] a, int first, int mid, int last) {
        if (a[first].compareTo(a[mid]) > 0) {
            swap(a, first, mid);
        }
        
        if (a[first].compareTo(a[last]) > 0) {
            swap(a, first, last);
        }
        
        if (a[mid].compareTo(a[last]) > 0) {
            swap(a, mid, last);
        }
    }
    
    private void sortTwoItems (T[] a, int first, int last) {
        if (a[first].compareTo(a[last]) > 0) {
            swap(a, first, last);
        }
    }
}