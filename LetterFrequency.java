public class LetterFrequency {
    public static void main(String[] args) {
        int[] count = new int[26];
        while(StdIn.isEmpty() == false) {
            char ch = StdIn.readChar();

            if(ch >= 'A' && ch <= 'Z') {
                ch = Character.toLowerCase(ch);
            }

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 97;
                count[index]++;
            }
        }

        double max = 0;
        for(int j = 0; j < 26; j++){
            double value = count[j];
            if(value > max) {
                max = value;
            }
        }

        StdDraw.setXscale(0, 26);
        StdDraw.setYscale(0, 1);

        double[] scale = new double[26];
        for(int i = 0; i < 26; i++) {
            char letter = (char)(i + 97);
            scale[i] = count[i] / max;
            StdOut.print(letter);
            StdOut.printf(": %.3f\n", scale[i]);
            
            if((i % 2) != 0) {
                StdDraw.setPenColor(StdDraw.MAGENTA);
            }
            else {
                StdDraw.setPenColor(StdDraw.CYAN);
            }
            StdDraw.filledRectangle(i + 0.5, 0.5 * scale[i], 0.5, 0.5 * scale[i]);

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.text(i + 0.5, 0.05, Character.toString(letter));
        }
    }
}