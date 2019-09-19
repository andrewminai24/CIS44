/**
 * LinkedBag - Represents a linked implementation of a bag.
 *
 *
 */

package cs1706.jss2;

import java.util.*;

public class LinkedBag implements BagADT
{
    private static Random rand = new Random();

    /** the current number of elements in the bag  */
    private int count;

    /** the beginning of the linked representation */
    private LinearNode contents;

    //-----------------------------------------------------------------
    //  Creates an empty bag.
    //-----------------------------------------------------------------
    public LinkedBag()
    {
        count = 0;
        contents = null;
    }

    //-----------------------------------------------------------------
    //  Adds the specified element to the bag.
    //-----------------------------------------------------------------
    public void add (Object element)
    {
        LinearNode node = new LinearNode (element);
        node.setNext(contents);
        contents = node;
        count++;

    }

    //-----------------------------------------------------------------
    //  Adds the contents of the parameter to this bag.
    //-----------------------------------------------------------------
    public void addAll (BagADT bag)
    {
        Iterator scan = bag.iterator();

        while (scan.hasNext())
            add (scan.next());
    }

    //-----------------------------------------------------------------
    //  Removes a random element from the bag and returns it. Throws
    //  an EmptyBagException if the bag is empty.
    //-----------------------------------------------------------------
    public Object removeRandom() throws EmptyBagException
    {
        LinearNode previous, current;
        Object result = null;

        if (isEmpty())
            throw new EmptyBagException();

        int choice = rand.nextInt(count) + 1;

        if (choice == 1)
        {
            result = contents.getElement();
            contents = contents.getNext();
        }
        else
        {
            previous = contents;
            for (int skip=2; skip < choice; skip++)
                previous = previous.getNext();
            current = previous.getNext();
            result = current.getElement();
            previous.setNext(current.getNext());
        }

        count--;

        return result;
    }

    //-----------------------------------------------------------------
    //  Removes one occurance of the specified element from the bag
    //  and returns it. Throws an EmptyBagException if the bag is
    //  empty and a NoSuchElemetnException if the target is not in
    //  the bag.
    //-----------------------------------------------------------------
    public Object remove (Object target) throws EmptyBagException,
            NoSuchElementException
    {
        boolean found = false;
        LinearNode previous, current;
        Object result = null;

        if (isEmpty())
            throw new EmptyBagException();

        if (contents.getElement().equals(target))
        {
            result = contents.getElement();
            contents = contents.getNext();
        }
        else
        {
            previous = contents;
            current = contents.getNext();
            for (int look=0; look < count && !found; look++)
                if (current.getElement().equals(target))
                    found = true;
                else
                {
                    previous = current;
                    current = current.getNext();
                }

            if (!found)
                throw new NoSuchElementException();

            result = current.getElement();
            previous.setNext(current.getNext());
        }

        count--;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns a new bag that is the union of this bag and the
    //  parameter.
    //-----------------------------------------------------------------
    public BagADT union (BagADT bag)
    {
        LinkedBag both = new LinkedBag();

        LinearNode current = contents;

        while (current != null)
        {
            both.add (current.getElement());
            current = current.getNext();
        }

        Iterator scan = bag.iterator();
        while (scan.hasNext())
            both.add (scan.next());

        return both;
    }

    //-----------------------------------------------------------------
    //  Returns true if this bag contains the specified target
    //  element.
    //-----------------------------------------------------------------
    public boolean contains (Object target)
    {
        boolean found = false;

        LinearNode current = contents;

        for (int look=0; look < count && !found; look++)
            if (current.getElement().equals(target))
                found = true;
            else
                current = current.getNext();

        return found;
    }

    //-----------------------------------------------------------------
    //  Returns true if this bag contains exactly the same elements
    //  as the parameter.
    //-----------------------------------------------------------------
    public boolean equals (BagADT bag)
    {
        boolean result = false, found;

        if (size() == bag.size())
        {
            Iterator scan = bag.iterator();

            found = true;
            while (scan.hasNext() && found)
                found = contains(scan.next());

            result = found;
        }

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns true if this bag is empty and false otherwise.
    //-----------------------------------------------------------------
    public boolean isEmpty()
    {
        return (size() == 0);
    }

    //-----------------------------------------------------------------
    //  Returns the number of elements currently in this bag.
    //-----------------------------------------------------------------
    public int size()
    {
        return count;
    }

    //-----------------------------------------------------------------
    //  Returns an iterator for the elements currently in this bag.
    //-----------------------------------------------------------------
    public Iterator iterator()
    {
        return new LinkedIterator (contents, count);
    }

    //-----------------------------------------------------------------
    //  Returns a string representation of this bag.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "";

        LinearNode current = contents;

        while (current != null)
        {
            result += current.getElement().toString() + "\n";
            current = current.getNext();
        }

        return result;
    }
}
