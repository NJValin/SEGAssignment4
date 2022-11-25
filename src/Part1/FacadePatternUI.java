package Part1;
/**
 * The externally facing user interface used in the Facade design pattern. To implement this design pattern a Shape system is used.
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public class FacadePatternUI {
    private Circle circle;
    private Triangle triangle;
    private Rectangle rectangle;
    /**
     * A constructor for using the UI.
     * 
     * @param points the points for the shapes.
     * @param colour the colour of hte shaptes border.
     * @since 1.0
     */
    public FacadePatternUI(String points, String colour) {
        circle = new Circle(points, colour);
        triangle = new Triangle(points, colour);
        rectangle = new Rectangle(points, colour);
        
    }
    /**
     * A method that draws a circle.
     * 
     * @return a drawing of the circle.
     * @since 1.0
     * @see Part1.Shape#draw()
     */
    public String drawCircle() {
        return circle.draw();
    }
    /**
     * A method that draws a rectangle.
     * 
     * @return a drawing (unicode chracter) of a rectangle.
     * @since 1.0
     * @see Part1.Shape#draw()
     */
    public String drawRectangle() {
        return rectangle.draw();
    }
    /**
     * A method that draws a triangle.
     * @return a drawing (unicode character) of a triangle.
     * @since 1.0
     * @see Part1.Shape#draw()
     */
    public String drawTriangle() {
        return triangle.draw();
    }
    /**
     * A setter method for changing the center of the circle.
     * 
     * @param points A point that sets the center of the circle.
     * @since 1.0
     * @see Part1.Shape#setPoints()
     */
    public void setCirclePoints(String points) {
        circle.setPoints(points);
    }
    /**
     * A setter method for setting the corners of the rectangle.
     * 
     * @param points A set of points that set the 
     * @since 1.0
     * @see Part1.Shape#setPoints()
     */
    public void setRectanglePoints(String points) {
        rectangle.setPoints(points);
    }
    /**
     * A setter method for setting the corners of the triangle
     * 
     * @param points A set of points that set the 
     * @since 1.0
     * @see Part1.Shape#setPoints()
     */
    public void setTrianglePoints(String points) {
        triangle.setPoints(points);
    }
    /**
     * A getter method that returns the center of the circle.
     * 
     * @return the center of the circle.
     * @see Part1.Shape#getPoints()
     * @since 1.0
     */
    public String getCirclePoints() {return circle.getPoints();}

    /**
     * A getter method that returns the corners of the rectangle.
     * 
     * @return the corners of the rectangle.
     * @see Part1.Shape#getPoints()
     * @since 1.0
     */
    public String getRectanglePoints() {return rectangle.getPoints();}

    /**
     * A getter method that returns the corners of the triangle.
     * 
     * @return the corners of the triangle
     * @see Part1.Shape#getPoints()
     * @since 1.0
     */
    public String getTriangleString() {return triangle.getPoints();}


    /**
     * A setter methdo that changes the colour of the circles border
     * 
     * @param colour the colour of the circle's border 
     * @see Part1.Shape#setColour(java.lang.String)
     * @since 1.0
     */
    public void setCircleColour(String colour) {circle.setColour(colour);}

    /**
     * A setter methdo that changes the colour of the rectangles border
     * 
     * @param colour the colour of the rectangle's border 
     * @see Part1.Shape#setColour(java.lang.String)
     * @since 1.0
     */
    public void setRectangleColour(String colour) {rectangle.setColour(colour);}

    /**
     * A setter methdo that changes the colour of the triangles border
     * 
     * @param colour the colour of the triangle's border 
     * @see Part1.Shape#setColour(java.lang.String)
     * @since 1.0
     */
    public void setTriangleColour(String colour) {triangle.setColour(colour);}

    /**
     * A getter method for the circle border colour
     * 
     * @return the colour of the circle's border
     * @see Part1.Shape#getColour()
     * @since 1.0
     */
    public String getCircleColour() {return circle.getColour();}

    /**
     * A getter method for the rectangles border colour
     * 
     * @return the colour of the rectangle's border
     * @see Part1.Shape#getColour()
     * @since 1.0
     */
    public String getRectangleColour() {return rectangle.getColour();}

    /**
     * A getter method for the triangles border colour
     * 
     * @return the colour of the triangle's border
     * @see Part1.Shape#getColour()
     * @since 1.0
     */
    public String getTriangleColour() {return triangle.getColour();}
    
}
