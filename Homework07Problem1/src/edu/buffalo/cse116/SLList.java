package edu.buffalo.cse116;

import java.util.AbstractList;

import java.util.NoSuchElementException;

/**
 * This class defines a few basic methods to get practice creating and traversing a linked list.
 *
 * @author Mark J. Estudillo 
 * @param <E> Type of data held in this collection
 */
public class SLList<E> extends AbstractList<E> {

  /** Reference to the first node in our linked list. This will be null if the list is empty. */
  private Entry head;

  /** Number of elements currently in the list. */
  private int size;

  /**
   * Creates an empty list.
   */
  public SLList() {
    size = 0;
    head = null;
  }

  /**
   * Creates a new linked list and initializes it so that it stores the elements from the given array in the identical
   * order.
   *
   * @param source Array holding the elements that should be stored in our new linked list.
   */
  public SLList(E[] source) {
	  if(source.length > 0) {
		  size = source.length;
		  head = new Entry(); 
		  head.setElement(source[0]);
		  if(source.length > 1) {
			  Entry temp = new Entry(); 
			  head.setNext(temp);  
			  
			  for(int i = 1, n = source.length; i < n; i++) {
				  if(i < source.length - 1) {
					  temp.setElement(source[i]);
					  temp.setNext(new Entry());
					  temp = temp.getNext();  
				  }
				  else {
					  temp.setElement(source[i]);
					  temp.setNext(null); 
				  }
			  }
		  }
	  }
  }

  /**
   * Allocates and returns a new array. The entries in this new array should be identical (and in the same order) as the
   * elements in the linked list.
   *
   * @return Array containing the elements in the linked list.
   */
  @Override
  public Object[] toArray() {
	  Object[] retVal = new Object[size]; 
	  Entry trav = head; 
	  int counter = 0; 
	  while(trav != null) {
		  retVal[counter] = trav.getElement();
		  counter++; 
		  trav = trav.getNext();
	  }
	  return retVal;

  }

  /**
   * Returns the number of elements currently in this list.
   *
   * @return the number of elements in the list
   */
  @Override
  public int size() {
    return size;
  }

  @Override
  public E get(int idx) {
    // Skipped to give students practice on traversing a linked list
	  if(idx >= size) {
		  throw new IndexOutOfBoundsException();
	  }
	  
	  E retVal = (E) new Object();
	  Entry trav = head;
	  int counter = 0; 
	  while(trav != null) {
		  if(counter == idx) {
			  retVal = trav.getElement();
		  }
		  counter++;
		  trav = trav.getNext();
	  }
	  return retVal; 
//    throw new UnsupportedOperationException("Defining this method defeats the purpose of this homework. Sorry!");
  }

  /**
   * Class which defines the Entry instances ("nodes") in this single-linked-based list. Note that this class does not
   * specify a generic type, but instead uses the element type from the outer class.
   *
   * @author Matthew Hertz
   */
  @SuppressWarnings("unused")
  private class Entry {
    /** Element stored with the current entry. */
    private E element;

    /** Reference to the next entry in our linked list or null if this is the last link. */
    private Entry next;

    /** Create a new, blank Entry. */
    public Entry() {
      element = null;
      next = null;
    }

    // Auto-generated getters and setters for students who prefer using them.

    private E getElement() {
      return element;
    }

    private void setElement(E element) {
      this.element = element;
    }

    private Entry getNext() {
      return next;
    }

    private void setNext(Entry next) {
      this.next = next;
    }
  }

}