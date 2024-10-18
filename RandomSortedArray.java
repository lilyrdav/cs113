public class RandomSortedArray {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage: java RandomSortedArray [N] [Max]");
            System.exit(0);
        }

        int N = Integer.parseInt(args[0]);
        int Max = Integer.parseInt(args[1]);

        if((N < 1) || (Max < 1)) {
            System.out.println("error");
            System.exit(0);
        }

        int[] randomint = new int[N];

        for(int i = 0; i < randomint.length; i++) {
            randomint[i] = (int)(Math.random() * (Max)) + 1;
        }
        
        for(int i = 0; i <= (N - 1); i++) {
            for(int j = 0; j <= (N - 2); j++) {
                if(randomint[j] > randomint[j + 1]) {
                    int temp = randomint[j];
                    randomint[j] = randomint[j + 1];
                    randomint[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i <= (N - 1); i++) {
            System.out.println(randomint[i]);
        }
    }
}