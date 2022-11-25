package Part1;
/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class FacadePatternUI {
    private Circle circle;
    private Triangle triangle;
    private Rectangle rectangle;
    /**
     * 
     * @param type
     * @param points
     * @param colour
     */
    public FacadePatternUI(String points, String colour) {
        circle = new Circle(points, colour);
        triangle = new Triangle(points, colour);
        rectangle = new Rectangle(points, colour);
        
    }
    /**
     * 
     * @return
     */
    public String drawCircle() {
        return circle.draw();
    }
    /**
     * 
     * @return
     */
    public String drawRectangle() {
        return rectangle.draw();
    }
    /**
     * 
     * @return
     */
    public String drawTriangle() {
        return triangle.draw();
    }
    /**
     * 
     * @param points
     */
    public void setCirclePoints(String points) {
        circle.setPoints(points);
    }
    /**
     * 
     * @param points
     */
    public void setRectanglePoints(String points) {
        rectangle.setPoints(points);
    }
    /**
     * 
     * @param points
     */
    public void setTrianglePoints(String points) {
        triangle.setPoints(points);
    }
    /**
     * 
     * @return
     */
    public String getCirclePoints() {return circle.getPoints();}

    /**
     * 
     * @return
     */
    public String getRectanglePoints() {return rectangle.getPoints();}

    /**
     * 
     * @return
     */
    public String getTriangleString() {return triangle.getPoints();}


    /**
     * 
     * @param colour
     */
    public void setCircleColour(String colour) {circle.setColour(colour);}

    /**
     * 
     * @param colour
     */
    public void setRectangleColour(String colour) {rectangle.setColour(colour);}

    /**
     * 
     * @param colour
     */
    public void setTriangleColour(String colour) {triangle.setColour(colour);}
    /**
     * 
     * @return
     */
    public String getCircleColour() {return circle.getColour();}

    /**
     * 
     * @return
     */
    public String getRectangleColour() {return rectangle.getColour();}

    /**
     * 
     * @return
     */
    public String getTriangleColour() {return triangle.getColour();}
    
    public static void main(String[] args) {
        FacadePatternUI x = new FacadePatternUI("(2,3)", "red");
        System.out.println(x.drawCircle());
    }
}
