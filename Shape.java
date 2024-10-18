public class Shape {
    public double x, y;
    public Shape (double x, double y) {
        this.x = x; //"this object" - this.x refers to the instance variable and x refers to the parameter
        this.y = y;
    }

    public void draw() {} //empty method body
}