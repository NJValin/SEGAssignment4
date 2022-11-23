/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class Rectangle implements Shape {
    private double[] points;
    private String colour;

    public Rectangle(double[] points, String colour) {
        if (points.length!=4) {
            throw new IllegalArgumentException("A rectangle has 4 points");
        }
        this.points = points;
        this.colour = colour;
    }

    public void draw() {

    }


    public void setPoints(double[] points) {


    }


    public double[] getPoints() {

        return this.points;
    }
    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
