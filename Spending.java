public class Spending {
    public static void main(String[] args) {
        long N = Long.parseLong(args[0]);

        if(N <= 0) {
            System.out.println("Invalid data");
            System.exit(0);
        }

        long maxPositive = 0;
        long maxAttack = 0;
        long maxIssue = 0;
        long maxVotesGained = 0;
        long votesGained = 0;

        for(int i = 0; i <= N; i++) {
            long POSITIVE = (long)((Math.random() * 100000) + 1);
            long ATTACK = (long)((Math.random() * 100000) - POSITIVE + 1);
            long ISSUE = 100000 - POSITIVE - ATTACK;
            votesGained = (long)((POSITIVE * 5e-8) + (POSITIVE * ATTACK * ISSUE * 1e-10) - (ATTACK * POSITIVE * 9e-7));
            if(votesGained > maxVotesGained) {
                maxPositive = POSITIVE;
                maxAttack = ATTACK;
                maxIssue = ISSUE;
                maxVotesGained = votesGained;
            }
        }
        
        System.out.println(maxPositive);
        System.out.println(maxAttack);
        System.out.println(maxIssue);
        System.out.println(maxVotesGained);
    }
}