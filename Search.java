public class Search {
    public static void main(String[] args) {
        int[] targets = { 4, 9, 8, 1, -2, 3, 14, 38, -4, 16 };
        boolean found = false;
        for(String a : args) {
            for(int t : targets) {
                if(Integer.parseInt(a) == t) {
                    found = true;
                }
            }
        }
        System.out.println(found);   
    }
}