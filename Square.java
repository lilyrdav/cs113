public class Square extends Shape {
    public double side;
    public Square (double x, double y, double s) {
        super(x, y); //calls Shape constructor
        side = s;
    }

    public void darw () {
        StdDraw.square(x, y, side);
    }
}