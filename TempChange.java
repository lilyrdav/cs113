public class TempChange {
    public static void main(String[] args) {
        String city1 = args[0];
        double starttemp1 = Double.parseDouble(args[1]);
        double endtemp1 = Double.parseDouble(args[2]);
        String city2 = args[3];
        double starttemp2 = Double.parseDouble(args[4]);
        double endtemp2 = Double.parseDouble(args[5]);
        String city3 = args[6];
        double starttemp3 = Double.parseDouble(args[7]);
        double endtemp3 = Double.parseDouble(args[8]);
        double changecity1 = Math.abs(starttemp1 - endtemp1);
        double changecity2 = Math.abs(starttemp2 - endtemp2);
        double changecity3 = Math.abs(starttemp3 - endtemp3);
        if((changecity1 > changecity2) && (changecity1 > changecity3)) {
            System.out.println(city1 + " has the biggest change: " + changecity1);
        }
        else if((changecity2 > changecity1) && (changecity2 > changecity3)) {
            System.out.println(city2 + " has the biggest change: " + changecity2);
        }
        else if((changecity3 > changecity1) && (changecity3 > changecity2)) {
            System.out.println(city3 + " has the biggest change: " + changecity3);
        }
    }
}