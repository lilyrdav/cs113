public class Restaurant {
    //instance variables
    private String name;
    private int likes; //private means that the instance variable can only be accessed within this class

    //constructor
    public Restaurant(String n, int l) {
        name = n;
        likes = l;
    }

    //instance methods
    public void like() {
        likes++;
    }

    public String toString() {
        return name + "has" + likes + "likes";
    }

    //accessor methods - give other code read-only access to the private instance variables
    public String getName() {
        return name;
    }

    public int getLikes() {
        return likes;
    }
} //end of Restaurant class