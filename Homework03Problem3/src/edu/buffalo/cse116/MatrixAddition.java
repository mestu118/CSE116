package edu.buffalo.cse116;

/**
 * Class that defines a method which performs matrix addition. This gives students their first practice at creating and using
 * the code needed for higher dimensional arrays.
 *
 * @author Matthew Hertz
 */
public class MatrixAddition {

  /**
   * Given two equally-sized matrices, return a newly allocated matrix containing the result of adding the two.
   * Precondition: a &amp; b must have the same number of rows and each row will have the same number of columns. You should
   * assume preconditions hold and can write your code knowing this is always be true.
   *
   * @param a The first matrix we will be adding
   * @param b The second matrix whose entries will be added
   * @return Newly allocated array whose entries are equal to the sum of the entries in a &amp; b
   * at the identical row and column.
   */
  public int[][] add(int[][] a, int[][] b) {
	  int[][] addedMatrix;
	  if(a.length == 0) {
		  return new int[0][0];
	  }
	  else if(a[0].length == 0) {
		  return new int[a.length][0];
	  }
	  else {
		  addedMatrix = new int[a.length][a[0].length];
	  }
	  
	  for(int i = 0; i < a.length; i++) {
		  for(int j = 0; j < a[0].length; j ++) {
			  addedMatrix[i][j] = a[i][j] + b[i][j];
		  }
	  }
	  return addedMatrix;
  }
}