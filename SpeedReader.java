public class SpeedReader {

    public static void main(String[] args) {

        int wpm = Integer.parseInt(args[0]);

        StdDraw.setCanvasSize(800, 400);
        StdDraw.setXscale(0, 100);
        StdDraw.setYscale(0, 100);

        StdDraw.enableDoubleBuffering();

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(new java.awt.Font("COURIER", java.awt.Font.BOLD, 100));

        while (StdIn.isEmpty() == false) {

            String word = StdIn.readString(); 
            StdDraw.setPenColor(StdDraw.BLACK);

            if(word.length() % 2 != 0) {
                StdDraw.text(50, 50, word);
            }
            else if(word.length() % 2 == 0) {
                StdDraw.text(46.25, 50, word);
            }

            int length = word.length();
            int middleIndex = word.length() / 2;
            char anchor = word.charAt(middleIndex);

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(50, 50, Character.toString(anchor));

            StdDraw.show();

            StdDraw.pause(1000 / (wpm / 60));

            StdDraw.clear();
        }
    }
}
