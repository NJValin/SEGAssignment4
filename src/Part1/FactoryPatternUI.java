package Part1;
/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class FactoryPatternUI {
    private Shape shape;
    /**
     * A factory method that create and returns an instance of the shape specified by the <b>type</b> parameter.
     * 
     * @param type the shape that will be generated. can be <code>triangle</code>, <code>circle</code>, or <code>rectangle</code>.
     * @param points the points of interest for the shape requested.
     * @param colour the colour of the border for the shape.
     * @since 1.0
     */
    public Shape getShape(String type, String points, String colour) {
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
        return shape;
    }
    /**
     * A method that draws the shape generated.
     * 
     * @return the drawing of the shape instance.
     * @see Part1.Shape#draw()
     * @since 1.0
     */
    public String draw() {
        return shape.draw();
    }
    /**
     * A setter method for the points of interest of the instance shape.
     * 
     * @param points the new points of the instance shape.
     * @see Part1.Shape#setPoints(java.lang.String)
     * @since 1.0
     */
    public void setPoints(String points) {
        shape.setPoints(points);
    }
    /**
     * A getter method for the points of interest of the instance shape.
     * @return the points of interest for the instance.
     * @see Part1.Shape#getPoints()
     * @since 1.0
     */
    public String getPoints() {return shape.getPoints();}

    /**
     * A setter method for the colour of the instance shape.
     * 
     * @param colour the new colour of the shape.
     * @see Part1.Shape#setColour(java.lang.String)
     * @since 1.0
     */
    public void setColour(String colour) {shape.setColour(colour);}

    /**
     * A getter method for the colour of the instance shape.
     * @return The colour of the instance shape.
     * @see Part1.Shape#getColour()
     * @since 1.0
     */
    public String getColour() {return shape.getColour();}
    
    
}
