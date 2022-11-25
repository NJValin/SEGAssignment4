package Part1;
/**
 * A method that represents a rectangle in 2D space.
 * Implements {@link Part1.Shape}.
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public class Rectangle implements Shape {
    private String points;
    private String colour;
    /**
     * The constructor for the rectangle.
     * 
     * @param points the corners of the rectangle
     * @param colour the colour of the border
     */
    public Rectangle(String points, String colour) {
        this.points = points;
        this.colour = colour;
    }
    /**
     * A method that draws a rectangle.
     * @return a drawing of a square (a uncode rectangle)
     * @since 1.0
     * @see Part1.Shape#draw()
     */
    public String draw() {
        return "☐";
    }
    /**
     * A setter method for points
     * 
     * @param the new corners of the rectangle.
     * @see Part1.Shape#setPoints(java.lang.String)
     * @since 1.0
     */
    public void setPoints(String points) {
        this.points  = points;
    }

    /**
     * A getter method for the points.
     * @return the corners of the rectangle.
     * @since 1.0
     * @see Part1.Shape#getPoints()
     */
    public String getPoints() {
        return this.points;
    }
    /**
     * A getter method for the colour
     * @return the colour of the rectangle
     * @see Part1.Shape#getColour()
     * @since 1.0
     */
    public String getColour() {
        return this.colour;
    }
    /**
     * 
     * @param colour the new colour of the rectangle.
     * @see Part1.Shape#setColour(java.lang.String)
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
