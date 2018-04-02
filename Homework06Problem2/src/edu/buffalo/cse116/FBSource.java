package edu.buffalo.cse116;

import java.util.List;

/**
 * Companies rely on a problem, known as FizzBuzz, to screen job and internship applicants. Because this problem is so
 * well-known, it really only tests if the applicant has seen the problem before. The rules of FizzBuzz are:
 * <ul>
 * <li>If the entry is at index 0, it should have the value "Empty"</li>
 * <li>Else if the entry is at an index which is a multiple of 15, it should have the value "FizzBuzz"</li>
 * <li>Else if the entry is at an index which is a multiple of 3, it should have the value "Fizz"</li>
 * <li>Else if the entry is at an index which is a multiple of 5, it should have the value "Buzz"</li>
 * <li>Else, it should have the value of the index in String form (e.g., "2" or "13")</li>
 * </ul>
 * You will now write a method demonstrating that you can solve this problem in a manner that you may get to experience
 * again in an interview.
 *
 * @author Mark J. Estudillo
 */
public class FBSource {

  /**
   * Given a non-null {@link List} and the number of entries to create, this method will first remove entries from
   * {@code fbList} until its size is {@code fillSpace}. It will then go through and either replace an entry (if one is
   * already at that index) or add an entry (if the List does not have an entry at that index) with the proper value
   * using the "FizzBuzz" rules above.<br/>
   * Prerequisites: {@code fbList} is not null AND {@code fillSpace} is greater than or equal to 0.
   *
   * @param fbList List to which the entries, using "FizzBuzz" rules, will be included
   * @param fillSpace Number of entries that should be in the list when you are done
   */
  public static void makeFizzBuzzList(List<String> fbList, int fillSpace) {
	  if(fbList.size() > fillSpace) {
		  int index = fbList.size() - 1; 
		  while(fbList.size() != fillSpace) {
			  fbList.remove(index); 
			  --index; 
		  }
	  }
	  else if(fbList.size() < fillSpace) {
		  while(fbList.size() != fillSpace) {
			  fbList.add("");
		  }
	  }
	  
	  for(int i = 0; i < fbList.size(); i++) {
		  if(i == 0) {
			  fbList.set(0, "Empty"); 
		  }
		  else if(i%15 == 0) {
			  fbList.set(i, "FizzBuzz"); 
		  }
		  else if(i%3 == 0 && i%5 != 0) {
			  fbList.set(i, "Fizz"); 
		  }
		  else if(i%5 == 0) {
			  fbList.set(i, "Buzz"); 
		  }
		  else {
			  fbList.set(i, Integer.toString(i));
		  }
	  }


  }
}