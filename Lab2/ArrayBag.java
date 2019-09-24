/* 
 * ArrayBag.java
 * 
 * Author:          Computer Science E-22 staff
 * Modified by:     <your name>, <your e-mail address>
 * Date modified:   <current date>
 */

import java.util.*;

/**
 * An implementation of a Bag ADT using an array.
 */
public class ArrayBag implements Bag {
    /** 
     * The array used to store the items in the bag.
     */
    private Object[] items;
    
    /** 
     * The number of items in the bag.
     */
    private int numItems;
    
    public static final int DEFAULT_MAX_SIZE = 50;
    
    /**
     * Default, no-arg constructor - creates a new, empty ArrayBag with 
     * the default maximum size.
     */
    public ArrayBag() {
        items = new Object[DEFAULT_MAX_SIZE];
        numItems = 0;
    }
    
    /** 
     * A constructor that creates a new, empty ArrayBag with the specified
     * maximum size.
     */
    public ArrayBag(int maxSize) {
        if (maxSize <= 0)
            throw new IllegalArgumentException("maxSize must be > 0");
        items = new Object[maxSize];
        numItems = 0;
    }
    
    /** 
     * add - adds the specified item to the Bag.  Returns true on
     * success and false if there is no more room in the Bag.
     */
    public boolean add(Object item) {
        if (item == null)
            throw new IllegalArgumentException("item must be non-null");
        if (numItems == items.length)
            return false;              // no more room!
        else {
            items[numItems] = item;
            numItems++;
            return true;
        }
    }
    
    /** 
     * remove - removes one occurrence of the specified item (if any)
     * from the Bag.  Returns true on success and false if the
     * specified item (i.e., an object equal to item) is not in the Bag.
     */
    public boolean remove(Object item) {
        for (int i = 0; i < numItems; i++) {
            if (items[i] != null && items[i].equals(item)) {
                // Shift the remaining items left by one.
                System.arraycopy(items, i+1, items, i, numItems-i-1);
                items[numItems-1] = null;
                
                numItems--;
                return true;
            }
        }
        
        return false;  // item not found
    }
    
    /**
     * contains - returns true if the specified item is in the Bag, and
     * false otherwise.
     */
    public boolean contains(Object item) {
        for (int i = 0; i < numItems; i++) {
            if (items[i] != null && items[i].equals(item))
                return true;
        }
        
        return false;
    }
    
    /**
     * containsAll - does this ArrayBag contain all of the items in
     * otherBag?  Returns false if otherBag is null or empty. 
     */
    public boolean containsAll(Bag otherBag) {
        if (otherBag == null || otherBag.numItems() == 0)
            return false;
        
        Object[] otherItems = otherBag.toArray();
        for (int i = 0; i < otherItems.length; i++) {
            if (!contains(otherItems[i]))
                return false;
        }
        
        return true;
    }
    
    /**
     * numItems - returns the number of items in the Bag.
     */
    public int numItems() {
        return numItems;
    }
    
    /**
     * grab - returns a reference to a randomly chosen in the Bag.
     */
    public Object grab() {
        if (numItems == 0)
            throw new NoSuchElementException("the bag is empty");
        int whichOne = (int)(Math.random() * numItems);
        return items[whichOne];
    }
    
    /**
     * toArray - return an array containing the current contents of the bag
     */
    public Object[] toArray() {
        Object[] copy = new Object[numItems];
        System.arraycopy(items, 0, copy, 0, numItems);
        return copy;
    }
    
    /**
     * toString - converts this ArrayBag into a readable String object.
     * Overrides the Object version of this method.
     */
    public String toString() {
        String str = "{";
        
        for (int i = 0; i < numItems; i++)
            str = str + " " + items[i];
        str = str + " }";
        
        return str;
    }
    /**
     * roomLeft - returns how many more items can be filled in the bag
     * @param args
     */
    public int roomLeft(){
    	return (items.length - numItems);
    }
    
    /**
     * isEmpty - Checks if the bag has any items or not.
     * @param args
     */
    public boolean isEmpty(){
    	if(numItems == 0) return true;
    	else return false;
    }
    
    /**
     * increaseCapacity - Increase capacity of the bag by given no.
     * @param increment
     */
    public void increaseCapacity(int increment){
    	//Error checking
    	if (increment < 0) throw new IllegalArgumentException("Increment must be > 0");
    	if (increment == 0) return;
    	//temporary array to hold copy of the current Objects in Bag
    	Object[] tempItems = new Object[numItems + increment];
    	System.arraycopy(items, 0, tempItems, 0, numItems);
    	items = tempItems;
    	//System.out.println(items.length);
    }
    
    /**
     * addItmes - Adds all the items from given bag to the calling ArrayBag.
     * @param other
     */
    public boolean addItems(Bag other){
    	//Error checking
    	if (other == null) throw new IllegalArgumentException();
    	if (other.isEmpty()) return true;			//Passed bag is empty. So no items to add.
    	if (roomLeft() < other.numItems()) return false;    //Not enough room to add all objects of other bag.
    	Object[] otherItems = other.toArray();
    	for(int i = 0; i<otherItems.length; i++){
    		add(otherItems[i]);
    	}
    	return true;
    }
    
    /**
     * intersectionWith - Returns bag with all common items of both the bags
     * @param other
     */
    public Bag intersectionWith(Bag other){
    	if (other == null) throw new IllegalArgumentException();
    	// If any or both the bags are empty, return empty ArrayBag.
    	if (other.isEmpty() || this.isEmpty()) return new ArrayBag(0);
    	// Initialize ArrayBag with smallest sized bag.
    	int size = 0;
    	if (this.numItems() <= other.numItems())
    		size = numItems;
    	else size = other.numItems();
    	ArrayBag commonItems = new ArrayBag(size);
    	//Add only common and non-repeating items to the returning ArrayBag.
    	Object[] otherItems = other.toArray();
    	for(int i = 0; i<otherItems.length; i++){
    		if(this.contains(otherItems[i]) && (!commonItems.contains(otherItems[i]))){
    			commonItems.add(otherItems[i]);
    		}
    	}
    	return commonItems;
    }
    
    /* Test the ArrayBag implementation. */
    public static void main(String[] args) {
        // Create a Scanner object for user input.
        Scanner in = new Scanner(System.in);
        
        // Create an ArrayBag named bag1.
        System.out.print("Size of bag 1: ");
        int size = in.nextInt();
        Bag bag1 = new ArrayBag(size);
        in.nextLine();    // consume the rest of the line
        
        // Read in strings, add them to bag1, and print out bag1.
        String itemStr;        
        for (int i = 0; i < size-2; i++) {
            System.out.print("item " + i + ": ");
            itemStr = in.nextLine();
            bag1.add(itemStr);
        }
        System.out.println("bag 1 = " + bag1);
        System.out.println();
        
        // Select a random item and print it.
        Object item = bag1.grab();
        System.out.println("grabbed " + item);
        System.out.println();
        
        // Iterate over the objects in bag1, printing them one per
        // line.
        Object[] items = bag1.toArray();
        for (int i = 0; i < items.length; i++)
            System.out.println(items[i]);
        System.out.println();
        
        // Get an item to remove from bag1, remove it, and reprint the bag.
        System.out.print("item to remove: ");
        itemStr = in.nextLine();
        if (bag1.contains(itemStr))
            bag1.remove(itemStr);
        System.out.println("bag 1 = " + bag1);
        System.out.println();
        
        //Get how many more items can be put in the Bag
        System.out.println("Room left for " + bag1.roomLeft() + " more items.");
        
        //Check if bag is empty
        System.out.println("Is bag empty? true/false: " + bag1.isEmpty());
        
        bag1.increaseCapacity(5);
        
        // Get an item to remove from bag1, remove it, and reprint the bag.
        System.out.print("item to remove: ");
        itemStr = in.nextLine();
        if (bag1.contains(itemStr))
            bag1.remove(itemStr);
        System.out.println("bag 1 = " + bag1);
        System.out.println();
        // Get an item to remove from bag1, remove it, and reprint the bag.
        System.out.print("item to remove: ");
        itemStr = in.nextLine();
        if (bag1.contains(itemStr))
            bag1.remove(itemStr);
        System.out.println("bag 1 = " + bag1);
        System.out.println();
      //Get how many more items can be put in the Bag
        System.out.println("Room left for " + bag1.roomLeft() + " more items.");
        
        //Check if bag is empty
        System.out.println("Is bag empty? true/false: " + bag1.isEmpty());
       
    }
}

