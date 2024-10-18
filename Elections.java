public class Elections {
    public static void main(String[] args) {
        int basevoters= 1200000;
        int oppvoters= 1300000;
        int swingvoters = 2500000;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        for(int baselikelihood = 75, baselikelihood <= 85, baselikelihood + +) {
            for(int opplikelihood = 20, opplikelihood <= 40, opplikelihood + +) {
                for(int swinglikelihood = 35, swinglikelihood <= 60, swinglikelihood + +) {
                    int basevotes = basevoters * (baselikelihood / 100);
                    int oppvotes = oppvoters * (opplikelihood / 100);
                    int swingvotes = swingvoters * (swinglikelihood / 100);

                    int ourvotes = basevotes + oppvotes + swingvotes;
                    int theirvotes = (1200000 + 1300000 + 2500000) - ourvotes;

                    if(ourvotes > theirvotes) {
                        wins = baselikelihood
                    }
                    else if(ourvotes < theirvotes) {
                        losses = baselikelihood
                    }
                    else(ourvotes == theirvotes) {
                        ties = baselikelihood
                    }
                }
            }
        }
        double probability = (wins / (wins + losses + ties)) * 100
    }
}