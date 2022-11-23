/**
 * A circle of radius 1.
 * 
 * @author <a href="https://github.com/NJValin">NeilValin</a>-300236063
 */
public class Circle implements Shape {
    private String points;
    private String colour;

    /**
     * 
     * 
     * @param points a point in 2D space that represents the the center of the circle
     * @param colour
     */
    public Circle(String points, String colour) {
        this.points = points;
        this.colour = colour;
    }
    @Override
    public String draw() {
        return "◯";
    }

    @Override
    public void setPoints(String points) {
        this.points = points;
    }

    @Override
    public String getPoints() {
        return points;
    }

    @Override
    public void setColour(String colour) {
        this.colour= colour;
    }

    @Override
    public String getColour() {
        return this.colour;
    }
    
}
