package Part1;
/**
 * <p>A class that represents a Triangle in 2D space.</p>
 *   The class implments {@link #Shape}.
 * 
 * @author <a href="https://github.com/NJValin">NeilValin</a>-300236063
 * @version 1.0
 * 
 */
public class Triangle implements Shape {
    private String points;
    private String colour;
    /**
     * A constructor for Triangle.
     * 
     * @param points the three points of the triangle.
     * @param colour the colour of the border.
     * @since 1.0
     */
    public Triangle(String points, String colour) {
        this.points = points;
        this.colour = colour;

    }
    /**
     * A method that draws a triangle.
     * 
     * @return a drawing of a triangle (a unicode character).
     * @see Part1.Shape#draw().
     * @since 1.0
     */
    @Override
    public String draw() {
        return "\u25B2";
    }
    
    /**
     * A setter mehtods for the points of the triangles
     * @param points the three corners of the triangle.
     * @see Part1.Shape#setPoints(java.lang.String)
     * @since 1.0
     */
    public void setPoints(String points) {
        this.points  = points;
        
    }
    
    /** 
     * A getter method for the points of the triangles
     *  	
     * @return the set of corners of the triangle.
     * @see Part1.Shape#getPoints()
     * @since 1.0
    */
    @Override
    public String getPoints() {
        return points;
    }

    /**
     * A setter method for the triangle
     * @param colour the new colour of the triangle
     * @see Part1.Shape#setColour(java.lang.String)
     * @since 1.0
     */
    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * A getter method for the colour of the triangle.
     * 
     * @return the colour of the triangle
     * @see Part1.Shape#getColour()
     * @since 1.0
     */
    @Override
    public String getColour() {
        return colour;
    }

}