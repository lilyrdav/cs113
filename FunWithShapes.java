public class FunWithShapes {
    public static void main(String[] args) {
        Circle c1 = new Circle (20, 30, 5);
        StdOut.println(c1.radius); //radius = instance variable in Circle class
        StdOut.println(c1.x); //instance variable that is inherited from Shape
        c1.draw(); //Will call draw method in Circle class

        Square s1 = new Square (40, 70, 8);
        StdOut.println(s1.x);
        s1.draw();

        Circle c2 = new Circle (50, 50, 15);
        Shape[] shapes = {c1, c2, s1}; //this is okay because Circle and Square are both Shapes
        for (Shape s : shapes) {
            s.draw(); //calls c1.draw first time through loop, c2.draw the second time, and s1.draw the third time
        }
    }
}