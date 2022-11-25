package Part1;
import java.util.List;
/**
 * <p>A criteria that filters for men</p>
 * Implements {@link Part1.Criteria}
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public class CriteriaMale implements Criteria{
    /**
     * A method that filters a list for elements that are men.
     * 
     * @param people a list of people to be filtered
     * @return The list of all men in <b>people</b>
     * @since 1.0
     */
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result = new java.util.ArrayList<Person>();
        for (Person e:people) {
            if (e.getGender()==PersonStates.MALE) {
                result.add(e);
            }
        }
        return result;
    }
    
}
