public static <T extends Comparable<? super T>>
 void selectionSort(T[] a, int n)
{
 selectionSort(a, 0, n - 1); // invoke recursive method
} // end selectionSort
public static <T extends Comparable<? super T>>
 void selectionSort(T[] a, int first, int last)
{
if (first < last)
{ // Place the smallest value at beginning of array:
int indexOfNextSmallest = getIndexOfSmallest(a, first, last);
swap(a, first, indexOfNextSmallest);
selectionSort(a, first + 1, last);
} // end if
} // end
 // Returns the index of the smallest value in a portion of an array.
 private static <T extends Comparable<? super T>>
 int getIndexOfSmallest(T[] a, int first, int last)
 {
 T min = a[first];
 int indexOfMin = first;
 for (int index = first + 1; index <= last; index++)
 {
 if (a[index].compareTo(min) < 0)
 {
 min = a[index];
 indexOfMin = index;
 // Assertion: min is the smallest of a[first] through a[index].
 } // end if
 } // end for
 return indexOfMin;
 } // end getIndexOfSmallest
// -------------------------------------------------------------------------------
 // ALTERNATE VERSION
public static <T extends Comparable<? super T>>
 void selectionSort2(T[] a, int n)
{
selectionSort2(a, 0, n - 1);
} // end selectionSort2
public static <T extends Comparable<? super T>> 
 void selectionSort2(T[] a, int first, int last)
{
if (first < last)
{ // place the largest value at end of array:
swap(a, getIndexOfLargest(a, first, last), last);
selectionSort2(a, first, last - 1 );
} // end if
} // end selectionSort2
 // Returns the index of the largest value in a portion of an
 private static <T extends Comparable<? super T>>
 int getIndexOfLargest(T[] a, int first, int last)
{
T max = a[first];
int indexOfMax = first;
for (int index = first+1; index <= last; index++)
{
if (a[index].compareTo(max) > 0)
{
max = a[index];
indexOfMax = index;
// Assertion: max is the largest of a[first] through a[index].
} // end if
} // end for
return indexOfMax;
} // end getIndexOfLargest
// -------------------------------------------------------------------------------
// INSERTION SORT
public static <T extends Comparable<? super T>>
 void insertionSort(T[] a, int n)
{
insertionSort(a, 0, n - 1);
} // end insertionSort
 public static <T extends Comparable<? super T>>
 void insertionSort(T[] a, int first, int last)
 {
 if (first < last)
 {
 // Sort all but the last entry
 insertionSort(a, first, last - 1);
 // Insert the last entry in sorted order
 insertInOrder(a[last], a, first, last - 1); 
 } // end if
 } // end insertionSort
// -------------------------------------------------------------------------------
// ALTERNATE VERSION
public static <T extends Comparable<? super T>>
 void insertionSort2(T[] a, int n)
{
insertionSort2(a, 0, n - 1);
} // end insertionSort2
public static <T extends Comparable<? super T>>
 void insertionSort2(T[] a, int first, int last)
{
if (first < last)
{
insertionSort2(a, first, last - 1); // Sort all but last item
insertInOrder(a[last], a, first, last - 1); // Insert last item in sorted order
} // end if
} // end insertionSort2
// Inserts element into the sorted array elements a[begin] through a[end].
private static <T extends Comparable<? super T>>
 void insertInOrder(T element, T[] a, int begin, int end)
{
if (element.compareTo(a[end]) >= 0)
a[end + 1] = element;
else if (begin < end)
{
a[end + 1] = a[end];
insertInOrder(element, a, begin, end - 1);
}
else
{
a[end + 1] = a[end];
a[end] = element;
} // end if
} // end insertInOrder
// -------------------------------------------------------------------------------
// BUBBLE SORT
public static <T extends Comparable<? super T>>
 void recursiveBubbleSort(T[] a, int n)
{
if (n > 1)
{
for (int index = 0; index < n - 1; index++)
order(a, index, index + 1);
recursiveBubbleSort(a, n - 1);
} // end if
} // end recursiveBubbleSort
// -------------------------------------------