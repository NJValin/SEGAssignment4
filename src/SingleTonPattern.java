/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class SingleTonPattern {
    private String name;
    private String position;
    private SingleTonPattern ceo = new SingleTonPattern("Neil Valin", "CEO");
    private SingleTonPattern(final String name, final String position) {
        this.name = name;
        this.position = position;
    }
}
