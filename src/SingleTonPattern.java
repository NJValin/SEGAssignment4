/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class SingleTonPattern {
    private String name;
    private String position;
    private static SingleTonPattern ceo = new SingleTonPattern("Neil Valin", "CEO");
    /**
     * 
     * @param name  The head of the company's name
     * @param position  The head of the company's position
     */
    private SingleTonPattern(String name, String position) {
        this.name = name;
        this.position = position;
    }
    /**
     * 
     * @return The only instance of SingleTonPattern class.
     */
    public static SingleTonPattern getCompanyHead() {
        return ceo;
    }
    /**
     * @return the name of the head of the company's name
     */
    public  String getName() {
        return ceo.name;
    }

    /**
     * 
     * @return The head of the company's position.
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
     * 
     * @param position The new position of the company leader
     */
    public  void setPosition(String position) {
        ceo.position = position;
    }
}
