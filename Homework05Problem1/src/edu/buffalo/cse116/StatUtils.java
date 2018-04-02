package edu.buffalo.cse116;

/**
 * This class can be used to compute a few statistics for a given data set. This will compute both the average and
 * standard deviation.
 *
 * @author Mark J Estudillo
 */
public class StatUtils {

  /**
   * Compute the mean value of the data in the array.
   *
   * @param arr Array of doubles whose average we want to compute.
   * @return Mean of the values in {@code data}.
   * @throws NoDataException Exception thrown if arr is null.
   * @throws DivideByZeroException Exception thrown when the array does not contain anything (its length is 0).
   */
  public static double computeMean(double[] arr) throws DivideByZeroException, NoDataException {
	  if(arr == null) {
		throw new NoDataException();
	  }
	  else if(arr.length == 0) {
		  throw new DivideByZeroException(); 
	  }
	  double answer = 0.0; 
	  for(int i = 0; i < arr.length; i ++) {
		  answer += arr[i];
	  }
	  return answer/(1.0 * arr.length);
  }

  /**
   * Computes the standard deviation of the data in the array.
   *
   * @param arr Array of doubles whose standard deviation we want to compute.
   * @return Standard deviation of the values in {@code data}.
   * @throws InvalidDataSetException Exception thrown when the array is not large enough to compute a standard deviation
   *           (its length is 1).
   * @throws NoDataException Exception thrown when arr is null.
   */
  public static double computeStdDev(double[] arr) throws InvalidDataSetException, NoDataException {
	  double mean; 
	  double sum = 0; 
	  try {
		mean =computeMean(arr);
	  	} catch (NoDataException e) {
		// TODO Auto-generated catch block
		throw new NoDataException(); 
	  	} catch (DivideByZeroException e) {
		// TODO Auto-generated catch block
		return 0; 
	  	}
	  if(arr.length == 1) {
		  throw new InvalidDataSetException();
	  }
	  for(int i = 0; i < arr.length; i ++) {
		  sum += Math.pow(arr[i] - mean, 2);
	  }
	  return Math.sqrt(sum / (arr.length - 1));
  }
}
  
  
  
  