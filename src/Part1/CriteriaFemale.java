package Part1;
import java.util.List;
/**
 * <p>A criteria for filtering women.</p>
 *  Implements {@link Part1.Criteria}.
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 * @version 1.0
 */
public class CriteriaFemale implements Criteria {

    /**
     * A method that filters <b>people</b> and returns all the elements that are women.
     * @param people The list of all people to be filtered.
     * @return a list of women.
     * @see Part1.Criteria#meetCriteria(java.util.List)
     * @since 1.0
     */
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> result = new java.util.ArrayList<>();
        for (Person person : people) {
            if (person.getGender()==PersonStates.FEMALE) {
                result.add(person);
            }

        }
        return result;
    }
    
}
