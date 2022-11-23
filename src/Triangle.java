public class Triangle implements Shape {
    private String points;
    private String colour;
    public Triangle(String points, String colour) {
        this.points = points;
        this.colour = colour;

    }
    /**
     * 
     * @return
     */
    @Override
    public String draw() {
        // TODO Auto-generated method stub
        return "\u20E4";
    }
    
    /**
     * 
     * @param points
     */
    public void setPoints(String points) {
        // TODO Auto-generated method stub
        this.points  = points;
        
    }
    
    /** 
     * 
     * @return 
    */
    @Override
    public String getPoints() {
        // TODO Auto-generated method stub
        return points;
    }

    /**
     * 
     * @param colour 
     */
    @Override
    public void setColour(String colour) {
        // TODO Auto-generated method stub
        this.colour = colour;
    }

    @Override
    public String getColour() {
        // TODO Auto-generated method stub
        return colour;
    }

}