package edu.buffalo.cse116;

import java.util.AbstractList;

/**
 * This class defines a few basic methods to get practice creating and traversing a linked list.
 *
 * @author Matthew Hertz
 * @param <E> Type of data held in this collection
 */
@SuppressWarnings("unused")
public class DLList<E> extends AbstractList<E> {

  /** Reference to the first node in our linked list. This will be null if the list is empty. */
  private Entry head;

  /** Reference to the last node in our linked list. This will be null if the list is empty. */
  private Entry tail;

  /** Number of elements currently in the list. */
  private int size;

  /**
   * Creates an empty list.
   */
  public DLList() {
    size = 0;
    head = null;
    tail = null;
  }

  /**
   * Creates a new linked list and initializes it so that it stores the elements from the given array in the identical
   * order.
   *
   * @param source Array holding the elements that should be stored in our new linked list.
   */
  public DLList(E[] source) {
	  if(source.length > 0) {
		  size = source.length;
		  head = new Entry();
		  head.setElement(source[0]);
		  tail = head; 
		  if(source.length > 1) {
			  Entry next = new Entry(); 
			  head.setNext(next);
			  next.setPrev(head);
			  tail = next;
			  for(int i = 1; i < source.length; i++) {
				  if(i < source.length - 1) {
					  next.setElement(source[i]);
					  Entry prev = new Entry(); 
					  prev.setPrev(next);
					  next.setNext(prev);
					  next = next.getNext();
				  }
				  else {
					  next.setElement(source[i]);
					  next.setNext(null);
					  tail = next; 
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
	  if(idx >= size) {
		  throw new IndexOutOfBoundsException(); 
	  }
	  E retVal = (E) new Object(); 
	  Entry trav = head; 
	  int counter = 0;
	  while(trav != null) {
		  if(counter == idx) {
			  retVal = trav.getElement();
			  return retVal;
		  }
		  counter++;
		  trav = trav.getNext();
	  }
	  return retVal; 
    // Skipped to give students practice on traversing a linked list
  }

  /**
   * Class which defines the Entry instances ("nodes") in this doubly-linked-based list. Note that this class does not
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

    /** Reference to the previous entry in our linked list or null if this is the first link. */
    private Entry prev;

    /** Create a new, blank Entry. */
    public Entry() {
      element = null;
      next = null;
      prev = null;
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

    private Entry getPrev() {
      return prev;
    }

    private void setPrev(Entry prev) {
      this.prev = prev;
    }
  }

}