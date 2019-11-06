package lab4;

/**
    A class of bags whose entries are stored in a chain of linked nodes.
    The bag is never full.
    @author Frank M. Carrano
    @version 3.0
*/
public class LinkedBag<T> implements BagInterface<T>
{
	private Node firstNode;       // reference to first node
	private int numberOfEntries;

	public LinkedBag()
	{
		firstNode = null;
      numberOfEntries = 0;
	} // end default constructor

  // Exercise 1 -------------------------
	public LinkedBag(T[] items, int numberOfItems)
	{
		this();
		
		for (int index = 0; index < numberOfItems; index++)
			add(items[index]);
	} // end constructor
        
        public void reverse() {
            backwards(firstNode);
        }
        
        private void backwards(Node currentNode) {
            if (currentNode.next != null) {
                backwards(currentNode.next);
            }
                
            System.out.print(String.format(
                    "%s ",
                    currentNode.data
            ));
        }
    
	/** Adds a new entry to this bag.
	    @param newEntry  the object to be added as a new entry
	    @return true */
	public boolean add(T newEntry) // OutOfMemoryError possible
	{
      // add to beginning of chain:
		Node newNode = new Node(newEntry);
		newNode.setNextNode(firstNode);  // make new node reference rest of chain 
                                        // (firstNode is null if chain is empty)        
      firstNode = newNode;              // new node is at beginning of chain
		numberOfEntries++;
      
		return true;
	} // end add

	/** Sees whether this bag is full.
		 @return false */
	public boolean isFull() 
	{
		return false;
	} // end isFull
	
	/** Retrieves all entries that are in this bag.
	    @return a newly allocated array of all the entries in the bag */
	public T[] toArray()
	{
      // the cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries]; // unchecked cast

      int index = 0;
      Node currentNode = firstNode;
      while ((index < numberOfEntries) && (currentNode != null))
      {
         result[index] = currentNode.getData();
         index++;
         currentNode = currentNode.getNextNode();
      } // end while
      	
		return result;
	} // end toArray

	/** Sees whether this bag is empty.
	    @return true if the bag is empty, or false if not */
	public boolean isEmpty() 
	{
		return numberOfEntries == 0;
	} // end isEmpty

	/** Gets the number of entries currently in this bag.
	    @return the integer number of entries currently in the bag */
	public int getCurrentSize() 
	{
		return numberOfEntries;
	} // end getCurrentSize

	/** Counts the number of times a given entry appears in this bag.
		 @param anEntry  the entry to be counted
		 @return the number of times anEntry appears in the bag */
	public int getFrequencyOf(T anEntry) 
	{
		int frequency = 0;

      int counter = 0;
      Node currentNode = firstNode;
      while ((counter < numberOfEntries) && (currentNode != null))
      {
         if (anEntry.equals(currentNode.getData()))
         {
            frequency++;
         } // end if
         
         counter++;
         currentNode = currentNode.getNextNode();
      } // end while

		return frequency;
	} // end getFrequencyOf

	/** Tests whether this bag contains a given entry.
		 @param anEntry  the entry to locate
		 @return true if the bag contains anEntry, or false otherwise */
	public boolean contains(T anEntry)
	{
		return getReferenceTo(anEntry) != null;
	} // end contains
   
 	// Locates a given entry within this bag.
	// Returns a reference to the node containing the entry, if located,
	// or null otherwise.
	private Node getReferenceTo(T anEntry)
	{
		boolean found = false;
		Node currentNode = firstNode;
		
		while (!found && (currentNode != null))
		{
			if (anEntry.equals(currentNode.getData()))
				found = true;
			else
				currentNode = currentNode.getNextNode();
		} // end while
     
		return currentNode;
	} // end getReferenceTo

   /** Removes all entries from this bag. */
	public void clear() 
	{
		while (!isEmpty()) 
         remove();
	} // end clear
	
	/** Removes one unspecified entry from this bag, if possible.
       @return either the removed entry, if the removal
               was successful, or null */
	public T remove()
	{
		T result = null;
      if (firstNode != null)
      {
         result = firstNode.getData(); 
         firstNode = firstNode.getNextNode(); // remove first node from chain
         numberOfEntries--;
      } // end if

		return result;
	} // end remove
	
	/** Removes one occurrence of a given entry from this bag, if possible.
       @param anEntry  the entry to be removed
       @return true if the removal was successful, or false otherwise */
   public boolean remove(T anEntry) 
	{
		boolean result = false;
      Node nodeN = getReferenceTo(anEntry);
      
      if (nodeN != null)
      {
         nodeN.setData(firstNode.getData()); // replace located entry with entry in first node
         
         firstNode = firstNode.next; // remove first node from chain
         numberOfEntries--;
         result = true;
      } // end if
         
		return result;
	} // end remove

   public void display()
   {
	   Node current = firstNode;
	   while(current != null)
	   { 
	     System.out.println(current.data);
	     current = current.next;
	   }
   }
   
   @Override
   public String toString() {
       String str = "";
       Node current = firstNode;
       
       while (current != null) {
           T item = current.data;
           str += item + " ";
           current = current.next;
       }
       
       return str;
   }
   
	private class Node 
	{
	   private T    data; // entry in bag
	   private Node next; // link to next node

      private Node(T dataPortion)
		{
			this(dataPortion, null);	
		} // end constructor
		
		private Node(T dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;	
		} // end constructor
      
      private T getData()
      {
         return data;
      } // end getData
      
      private void setData(T newData)
      {
         data = newData;
      } // end setData
      
      private Node getNextNode()
      {
         return next;
      } // end getNextNode
      
      private void setNextNode(Node nextNode)
      {
         next = nextNode;
      } // end setNextNode
	} // end Node
} // end LinkedBag