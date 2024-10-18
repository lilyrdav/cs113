public class FunWithFunds {
    public static void main (String[] args) {
        Fund f1 = new Fund ("fund1", 1000);
        //Fund is the class and f1 is the variable name
        //new indicates that we're creating a new object
        //Second Fund is the name of the class of which we're creating an object
        //"fund1" and 1000 are the arguments to the constructor

        f1.donate(250); //f1 is the name of the object, donate is the name of the method, and 250 is the argument

        double percent = f1.pctReached(); //returns 25.0
        StdOut.println(percent); //prints 25.0

        //We can access instance variables too!
        int amount = f1.amtPledged;
        //f1 is the object name and amtPledged is the instance variable name
        //amount would be 250
        //parentheses call a method. amtPledged is not a method, so no parentheses

        StdOut.println(f1); //calls f1.toString() --> same as StdOut.println(f1.toString())

        Fund f2 = new Fund ("fund2", 8000);
        f2.donate(4000); //f2.amtPledged is now 4000
        f2.donate (1000); //now f2.amtPledged is 5000

        Fund f = new Fund ("my fund", 2000);
        f.donate(200); //now f.amtPledged is 200
        f.donate (-100); //f.amtPledged is still 200
        f.amtPledged = -10000; //oops
    }
}