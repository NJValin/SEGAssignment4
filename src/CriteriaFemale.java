import java.util.List;
/**
 * 
 * @author <a href="https://github.com/NJValin">Neil Valin</a>-300236063
 */
public class CriteriaFemale implements Criteria {

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
