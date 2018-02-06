package edu.buffalo.cse116;
/**
 * Class that is used to print out the lyrics to "5 little ducks"
 *
 * @author Matthew Hertz
 */
public class Ducks {
	public static void main(String[] args) {
		for(int i = 5; i > 0; i--) {
			if(i == 1) {
				System.out.println(i +" little duck went swimming one day,");
				System.out.println("Over the hill and far away");
				System.out.println("Mamma duck said: 'Quack, quack, quack, quack!'");
				System.out.println("And all her little ducks came back.");
			}
			else {
				System.out.println(i +" little ducks went swimming one day,");
				System.out.println("Over the hill and far away");
				System.out.println("Mamma duck said: 'Quack, quack, quack, quack!'");
				if((i - 1) == 1) {
					System.out.println("And only " + (i -1) + " little duck came back.");
				}
				else {
					System.out.println("And only " + (i - 1) + " little ducks came back.");
				}
				System.out.println();
			}
		}
	}

}
