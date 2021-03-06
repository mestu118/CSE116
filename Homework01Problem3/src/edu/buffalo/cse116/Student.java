package edu.buffalo.cse116;
/**
 * Instances of this class represent a student in CSE116/504. It records the important information that an instructor
 * might use to analyze performance of their teaching.
 *
 * @author Matthew Hertz
 */

public class Student {

	  /**
	   * Record if the student is an undergraduate or graduate student. Both sets of students are treated identically, but
	   * this is needed to eliminate one possible reason for performance differences.
	   */
	  private boolean undergrad;

	  /**
	   * Every student also has a name. This is not needed for performance tracking, but it useful in remembering that we
	   * are all people.
	   */
	  private String name;

	  /**
	   * For simplicity, this only refers to the class in which a student passed CSE115. This will be null for students who
	   * completed this course at another institution. (In reality, we would want/need all previous CSE course registration
	   * data.)
	   */
	  private Registration cse115;

	  /**
	   * Creates a new blank instance of Student. This can only be called within this file and should only be used when
	   * creating copies of an object.
	   */
	  private Student() {
	    // This method is intentionally left blank
	  }

	  /**
	   * Creates a new instance of Student with the specified details.
	   * 
	   * @param ug True if the student is an undergraduate; false otherwise.
	   * @param fullName Name to be used by this Student instance
	   * @param term Semester the student took CSE115/504
	   * @param classId Name of the UB course that the student is using for the pre-req.
	   * @param score Report card grade that the student earned for this course.
	   * 
	   */
	  public Student(boolean ug, String fullName, String term, String classId, String score) {
		  this.undergrad = ug;
		  this.name = fullName; 
		  this.cse115 = new Registration(term, classId, score);

	  }

	  /**
	   * Returns a duplicate instance of Student in which the values of (Strings and) primitive fields are duplicated while
	   * any references fields are aliased (so both the original and copied object's fields should refer to the same
	   * instance). (The name is from the terminology used by classes implementing {@link Cloneable}. This type of clone is
	   * called a "shallow" clone).
	   *
	   * @return A duplicate Student instance. Any fields whose type is primitive or String will duplicate the value of this
	   *         (e.g., the instance used to call this method). Any reference fields will alias (refer to the same object
	   *         as) the field in the current object.
	   */
	  public Student makeShallowCopy() {
		  Student duplicate = new Student();
		  duplicate.name = this.name;
		  duplicate.undergrad = this.undergrad;	
		  // Points to the same Registration object
		  duplicate.cse115 = this.cse115;
		  
		  return duplicate;

	  }

	  /**
	   * Returns a duplicate instance of Student in which the values of (Strings and) primitive fields are duplicated while
	   * any references fields will either be null (if the field is null in the original) or contain a reference to a clone
	   * (duplicate) of the object in this's field. (The name is from the terminology used by classes implementing
	   * {@link Cloneable}. This type of clone is called a "deep" clone).
	   *
	   * @return A duplicate Student instance. Any fields whose type is primitive or String will duplicate the value of this
	   *         (e.g., the instance used to call this method). Any reference fields will contain null (if the original is
	   *         null) or a clone (refer to the same object as) the field in the current object.
	   */
	  public Student makeDeepCopy() {
		  Student duplicate = new Student();
		  duplicate.name = this.name;
		  duplicate.undergrad = this.undergrad;
		  
		  if(this.cse115 != null) {
			  duplicate.cse115 = this.cse115.clone(); 
		  }
		  
		  else {
			  duplicate.cse115 = null;
		  }
		  
		  return duplicate;

	  }

}
