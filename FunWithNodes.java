public class FunWithNodes {
    public static void main (String[] args) {
        Node a = new Node ("aardvark");
        Node b = new Node ("bear");
        a.next = b;
        Node c = new Node ("cat");
        b.next = c;
        Node n = a; //n is the "current Node";
        while (n! = null) {
            StdOut.println(n.data);
            n = n.next;
        }
        //This is a LINKED LIST and is a foundational DATA STRUCTURE
        //Common data structure operations: add, itrate, remove, contains

        String target = StdIn.readString();
        //does the LinkedList contain this String?
        n = a; //reset n to refer to a i.e. the "head" of the LinkedList
        boolean found = false;
        while (n != null) {
            if (n.data.equals(target)) {
                found = true;
                break;
            }
            else n = n.next;
        }
        
    }
}