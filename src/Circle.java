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
        // TODO Auto-generated method stub
        return "\u25EF";
    }

    @Override
    public void setPoints(String points) {
        // TODO Auto-generated method stub
        this.points = points;
    }

    @Override
    public String getPoints() {
        // TODO Auto-generated method stub
        return points;
    }

    @Override
    public void setColour(String colour) {
        // TODO Auto-generated method stu
        this.colour= colour;
    }

    @Override
    public String getColour() {
        // TODO Auto-generated method stub
        return this.colour;
    }
    
}
