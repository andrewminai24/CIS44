public class BubbleSort{

    public void sort (Object a []) throws Exception {// The algorithm for ascending sort algorithm
    int n=a.length;
    ArrayStack S=new ArrayStack(n);
    ArrryQueue Q=new ArrryQueue(n);
    Object max,x;
    for (int i=0; i<n;i++) 
    S.push(a[i]); // Will stay row data elements into the stack
    for (int j=0; j<n;j++)
    {
        max=S.getTop();
    while(!S.isEmpty()) //Looking for a trip to the maximum
    {
        x= S.getTop();
        Q.enQueue(x);
        S.pop();
    if((Integer)max<(Integer)x) max=x; // Find the largest element
    }
    a[j]=max;// The largest data elements in the array
    while(Q.notEmpty())//The data in the stack, for the next order
    {x=Q.getFront();
    if((Integer) max! = (Integer)x)S.push(x);
    Q.deQueue();
    } // For the next round into the stack 
    }
}