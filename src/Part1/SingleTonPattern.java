package Part1;
/**
 * A class that contains only a single instance. The example used in this design, is that of a 
 * companies leader. By default they are CEO and named Neil Valin.
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public class SingleTonPattern {
    private String name;
    private String position;
    private static SingleTonPattern ceo = new SingleTonPattern("Neil Valin", "CEO");
    /**
     * The contructor for the singleton pattern, only used internally.
     * 
     * @param name  The head of the company's name
     * @param position  The head of the company's position
     */
    private SingleTonPattern(String name, String position) {
        this.name = name;
        this.position = position;
    }
    /**
     * A method that returns the instance, allowing for external use of the class.
     * 
     * @return The only instance of SingleTonPattern class.
     * @since 1.0
     */
    public static SingleTonPattern getCompanyHead() {
        return ceo;
    }
    /**
     * A getter method that returns the name of the head of the company.
     * 
     * @return the name of the head of the company's name
     * @since 1.0
     */
    public  String getName() {
        return ceo.name;
    }

    /**
     * A getter method that returns the position that the head of the company occupies.
     * 
     * @return The head of the company's position.
     * @since 1.0
     */
    public  String getPosition() {
        return ceo.position;
    }
    /**
     * <p>Over throw the current leader; and premote the given <b>name</b> as the head of the company.</p>
     * @param name The new name for the company's leader
     */
    public  void setName(String name) {
        ceo.name = name;
    }
    /**
     * A setter method for the position, in the company, of the leader.
     * 
     * @param position The new position of the company leader
     */
    public  void setPosition(String position) {
        ceo.position = position;
    }
}
