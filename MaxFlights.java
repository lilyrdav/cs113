public class MaxFlights {
    public static void main(String[] args) {
        String[] airportCode = args;

        String url = "https://www.cs.brynmawr.edu/~cdmurphy/phl-flights.txt";
        Flight[] flights = FlightReader.readFlights(url);

        int maxFlights = 0;
        String maxAirport = "";
        for (int i = 0; i < airportCode.length; i++) {
            int count = 0;
            for (int j = 0; j < flights.length; j++) {
                if (airportCode[i].equals(flights[j].getDestination())) {
                    count++;
                }

                if (count > maxFlights) {
                    maxFlights = count;
                    maxAirport = airportCode[i];
                }
            }
        }

        StdOut.println(maxAirport + " has the most flights: " + maxFlights);
    }
}