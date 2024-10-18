public class Strings {
	public static void main(String[] args) {
		int x = 3;

		// int is the type
		// x is the variable
		// 3 is the value that x holds/represents

		String word;

		// String is the class
		// word in the variable
		// declared but no initialized

		word = "Doge";

		// now word represents a String object consisting of the chars "Doge"
		// 'D' is index #0, 'o' is index #1, 'g' is index #2, 'e' is index #3

		char c = word.charAt(2);

		// word is the object on which we are calling the method
		// charAt is the method
		// 2 is the argument
		// c holds the return value
		// At returns the char at the specified index
		// char c holds the char 'g'
		// Why not String.charAt(2)? We can have multiple strings in a program
		// Why not x.charAt(2)? We can't call a method on an int

		String name = "Homer";
		c = name.charAt(2); // c is now 'm'
		name = "Cooper";
		c = name.charAt(2); //c is now 'o'
		int numChars = name.length();

		// name is the object
		// length is the method
		// length returns the number of chars in the String
        // numChars set to six because "Cooper" has six letters in it

        int indexR = name.indexOf('r');

        // name is the object
        // indexOf is the method
        // 'r' is the argument: char 'r' not String "r"
        // 'r' returns index of first occurrence of this char

        String message = "abcdefg";
        String middle = message.substring(2, 5);

        // message is the object, substring is the method
        // returns a new String consisting of chars from indices 2 to (5-1 = 4)
        // ends at index 4 --> inclusive of the first number and exclusive of the second
        // returns "cde"

        StdOut.println(middle.length()); //prints 3
        StdOut.printf("it is %s", middle); //prints "it is cde"

        //read Strings from stdin until there are no more; print the longest one

        int maxLength = 0;
        String longestString = "";
        while (StdIn.isEmpty() == false) {
            String next = StdIn.readString();
            if (next.length() > maxLength) {
                maxLength = next.length();
                longestString = next;
            }
        }
        StdOut.printf("%s %d", longestString, maxLength);


        String n = "Apple"; // This String is immutable - cannot be change
        n.toUpperCase(); // n doesn't change when we call toUpperCase
        StdOut.println(n); // THIS WILL PRINT "Apple", not "APPLE"
        String up = n.toUpperCase();
        StdOut.println(up); //prints "APPLE"
        StdOut.println(n); //still prints "Apple"
        StdOut.println(n.toUpperCase()); //prints "APPLE"
        //returns an anonymous object - has no name
        StdOut.println(n.toUpperCase().length()); //prints 5
        n = up.toLowerCase(); //now n is "apple"


        String data = "Admiral Grace Hopper";
        String abbrev = data.replace("Admiral", "Adm."); //abbrev is "Adm. Grace Hopper" but data hasn't changed

        int x = 7;
        String a = "dog";
        String b = a.toUpperCase();
        a = a.replace("d", "D");
    }
}          
			
