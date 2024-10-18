public class Time {
    public static void main(String[] args) {
        int minutes = Integer.parseInt(args[0]);//convert String to int
        int hours = minutes / 60;
        minutes = minutes % 60;
        if ((minutes <= 0) && (hours <= 0)) {
            System.out.println("error");
            System.exit(0);
        }
        else if((hours == 1) && (minutes == 1)) {
            System.out.println(hours + " hour " + minutes + " minute");
        }
        else if((hours == 1) && (minutes == 0)) {
            System.out.println(hours + " hour");
        }
        else if((hours == 0) && (minutes == 1)) {
            System.out.println(minutes + " minute");
        }
        else if((hours == 0) && (minutes > 0)) {
            System.out.println(minutes + " minutes");
        }
        else if((minutes == 0) && (hours > 0)) {
            System.out.println(hours + " hours");
        }
        else if((hours == 1) && (minutes > 0)) {
            System.out.println(hours + " hour " + minutes + " minutes");
        }
        else if((minutes == 1) && (hours > 0)) {
            System.out.println(hours + " hours " + minutes + " minute");
        }
        else if((hours > 0) && (minutes > 0)) {
            System.out.println(hours + " hours " + minutes + " minutes");
        }
    }
}