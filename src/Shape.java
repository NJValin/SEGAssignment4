/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public interface Shape {
    /**
     * 
     * Draws the shape.
     */
    public void draw();
    /**
     * 
     * @param points sets the pointso of the shape.
     */
    public void setPoints(double[] points);
    /**
     * 
     * @return The set of points that define the shape
     */
    public double[] getPoints();
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
