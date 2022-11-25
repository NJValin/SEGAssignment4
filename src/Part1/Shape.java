package Part1;
/**
 * An interface that represents some shape in 2D space.
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public interface Shape {
    
    /**
     * A method that draws the shape
     * @return Draws the shape.
     * @since 1.0
     */
    public String draw();
    /**
     * A setter method that sets the points of interest of the shape.
     * @param points sets the pointso of the shape.
     * @since 1.0
     */
    public void setPoints(String points);
    /**
     * A getter method that gets the points of interest of the shape.
     * @return The set of points that define the shape
     * @since 1.0
     */
    public String getPoints();


    /**
     * A setter method that sets the colour of the border of the shape.
     * @param colour the new Colour of the border.
     * @since 1.0
     */
    public void setColour(String colour);
    /**
     * A getter method for the colour of the shape.
     * @return the colour of the shapes border.
     */
    public String getColour();
}
