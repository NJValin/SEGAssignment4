/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class Rectangle implements Shape {
    private String points;
    private String colour;
    /**
     * 
     * @param points
     * @param colour
     */
    public Rectangle(String points, String colour) {
        this.points = points;
        this.colour = colour;
    }
    /**
     * 
     * @return
     */
    public String draw() {
        return "☐";
    }
    /**
     * 
     * @param
     */
    public void setPoints(String points) {
        this.points  = points;
    }

    /**
     * 
     * @return
     */
    public String getPoints() {
        return this.points;
    }
    /**
     * 
     * @return
     */
    public String getColour() {
        return this.colour;
    }
    /**
     * 
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }
    
}
