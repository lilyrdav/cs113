public class FunWithRestaurants {
    public static void main (String[] args) {
        Restaurant Wendys = new Restaurant("Wendy's", 5);
        Wendys.like();
        StdOut.println(Wendys.likes); //WILL NOT COMPILE because likes is a private instance variable
        Wendys.likes = -10000; //WILL NOT COMPILE because likes is private
        StdOut.println(Wendys.getLikes()); //WILL COMPILE - prints 6

        Restaurant Popeyes = new Restaurant("Popeye's", 4);

        Restaurant[] faves = {Wendys, Popeyes}; //creates a 2-element array: element #0 is the Wendys object and element #1 is the Popeyes object
        StdOut.println(faves.length);
        StdOut.println(faves[1].getName()); //faves[1] is a Restaurant object - prints "Popeyes"

        //read from a file to populate the objects in an array
        int howMany = StdIn.readInt();
        Restaurant[] restaurants = new Restaurant[howMany]; //at this point, there are no objects in the array
        for (int i = 0; i < howMany; i++) {
            String n = StdIn.readString();
            int l = StdIn.readInt();
            restaurants[i] = new Restaurant(n, l); //new Restaurant() creates a new Restaurant object - restaurants[i] refers to this object
        }
        printRestaurants(restaurants, 20); // 20 = the minimum number of likes
    }

    public static void printRestaurants(Restaurant[] rests, int minLikes) {
        //iterate over all Restaurant objects in array one element at a time
        for(Restaurant r : rests) { //rests is the name of the array
            //r is a Restaurant
            //print name if it has more than the minimum number of likes
            if(r.getLikes() > minLikes) {
                StdOut.println(r.getName());
            }
        }
    }
}

Restaurant[] rests = new Restaurant[4];
rests[0] = new Restaurant("Qdoba", 3);
StdOut.println(rests[0].getName()); //prints "Qdoba"
StdOut.println(rests[1]); //prints "null" - rests[1] doesn't refer to any object
StdOut.println(rests[1].getName()); //this results in a NullPointerException - this happens when we try to call a method on a null object
if (rests[1] != null) {
    StdOut.println(rests[1].getName());
}