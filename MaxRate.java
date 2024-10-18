public class MaxRate {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        while(StdIn.isEmpty() ==  false) {

            String maxState = "";
            double maxVaccinationRate = 0;
            for (int i = 0; i < n; i++) {
                String state = StdIn.readString();
                int vaccinatedIndividuals = StdIn.readInt();
                int statePopulation = StdIn.readInt();

                double vaccinationRate = (double)vaccinatedIndividuals / (double)statePopulation;
                double percentage = vaccinationRate * 100;

                if (percentage > maxVaccinationRate) {
                    maxVaccinationRate = percentage;
                    maxState = state;
                }
            }

            StdOut.print(maxState);
            StdOut.printf(" %.1f", maxVaccinationRate);
            StdOut.println("%");
        }
    }
}