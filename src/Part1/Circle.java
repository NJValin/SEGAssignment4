package Part1;
/**
 * <p>A class that represents a circle of radius 1.
 *   The class implments {@link #Shape}.
 * 
 * @author <a href="https://github.com/NJValin">NeilValin</a>-300236063
 * @version 1.0
 * 
 */
public class Circle implements Shape {
    private String points;
    private String colour;

    /**
     *  The parameter of the circle class.
     * 
     * @param points a point in 2D space that represents the the center of the circle
     * @param colour the colour of the circles border
     */
    public Circle(String points, String colour) {
        this.points = points;
        this.colour = colour;
    }
    
    /**
     * A method that draws the circle instance.
     * 
     * <p> <b>Note:</b> Some consoles don't encode the symbol correctly.</p>
     * @see Part1.Shape#draw()
     * @since version 1.0
     * @return a 'drawing' of a circle (a circle unicode character).
     * 
     */
    @Override
    public String draw() {
        return "\u25EF";
    }

    /**
     * Simple setter method for points.
     * 
     * @param points the new center of the cirlce
     * @see Part1.Shape#setPoints(java.lang.String)
     * @since version 1.0
     */
    @Override
    public void setPoints(String points) {
        this.points = points;
    }

    /**
     * A getter method for the center of the circle.
     * @return the center of circle.
     * @see Part1.Shape#getPoints()
     * @since 1.0
     */
    @Override
    public String getPoints() {
        return points;
    }

    /**
     * A setter method for the colour.
     * @param colour the new colour of the border
     * @see Part1.Shape#setColour(java.lang.String)
     * @since 1.0
     */
    @Override
    public void setColour(String colour) {
        this.colour= colour;
    }

    /**
     * @return the colour of the border
     * @see Part1.Shape#getColour()
     * @since 1.0
     */
    @Override
    public String getColour() {
        return this.colour;
    }
    
}
