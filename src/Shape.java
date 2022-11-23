/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public interface Shape {
    /**
     * 
     * Draws the shape.
     */
    public String draw();
    /**
     * 
     * @param points sets the pointso of the shape.
     */
    public void setPoints(String points);
    /**
     * 
     * @return The set of points that define the shape
     */
    public String getPoints();
    /**
     * 
     */
    public void setColour(String colour);
    /**
     * 
     * @return
     */
    public String getColour();
}
