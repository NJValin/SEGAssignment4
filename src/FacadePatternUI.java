/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class FacadePatternUI {
    private Shape shape;
    /**
     * 
     * @param type
     * @param points
     * @param colour
     */
    public FacadePatternUI(String type, String points, String colour) {
        if (type.equalsIgnoreCase("circle")) {
            shape = new Circle(points, colour);
        }
        else if (type.equalsIgnoreCase("triangle")) {
            shape = new Triangle(points, colour);
        }
        else if (type.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle(points, colour);
        }
        else {
            throw new IllegalArgumentException("the parameter type must be one of the following: rectangle, circle, & triangle");
        }
    }
    /**
     * 
     * @return
     */
    public String draw() {
        return shape.draw();
    }
    /**
     * 
     * @param points
     */
    public void setPoints(String points) {
        shape.setPoints(points);
    }
    /**
     * 
     * @return
     */
    public String getPoints() {return shape.getPoints();}

    /**
     * 
     * @param colour
     */
    public void setColour(String colour) {shape.setColour(colour);}

    /**
     * 
     * @return
     */
    public String getColour() {return shape.getColour();}
    
    public static void main(String[] args) {
        
    }
}
