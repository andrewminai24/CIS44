public class MergeSort <T extends Comparable<? super T>> {
    public void mergeSort(T[] a) {
        @SuppressWarnings("unchecked")
        T[] tempArray = (T[]) new Comparable <?> [a.length];
        
        mergeSort(a, tempArray, 0, a.length - 1);
    }
    
    private void mergeSort(T[] a, T[] tempArray, int first, int last) {
        int mid = (first + last) / 2;
        
        if (first < last) {
            mergeSort(a, tempArray, first, mid);
            mergeSort(a, tempArray, mid + 1, last);
        }
        
        else {
            merge(a, tempArray, first, mid, last);
        }
    }
    
    private void merge(T[] a, T[] tempArray, int first, int mid, int last) {
        int beginHalf1 = first;
        int endHalf1 = mid;
        
        int beginHalf2 = mid + 1;
        int endHalf2 = last;
        
        int index = first;
        
        for ( ; beginHalf1 <= endHalf1 && beginHalf2 <= endHalf2; index++) {
            if (a[beginHalf1].compareTo(a[beginHalf2]) < 0) {
                tempArray[index] = a[beginHalf1];
                beginHalf1++;
            }
            
            else {
                tempArray[index] = a[beginHalf2];
                beginHalf2++;
            }
        }
        
        for ( ; beginHalf1 <= endHalf1; index++, beginHalf1++) {
            tempArray[index] = a[beginHalf1];
        }
        
        for ( ; beginHalf2 <= endHalf2; index++, beginHalf2++) {
            tempArray[index] = a[beginHalf2];
        }
        
        for (index = first; index <= last; index++) {
            a[index] = tempArray[index];
        }
        
        for (T item: tempArray) {
            System.out.print(item + " ");
        }
        
        System.out.println();
    }
}